package org.example.crmschool.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "exercises", schema = "public", catalog = "postgres")
public class ExercisesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "date_given")
    private Date dateGiven;
    @Basic
    @Column(name = "deadline")
    private Date deadline;
    @Basic
    @Column(name = "subject_id")
    private Integer subjectId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExercisesEntity that = (ExercisesEntity) o;

        if (id != that.id) return false;
        if (!Objects.equals(description, that.description)) return false;
        if (!Objects.equals(dateGiven, that.dateGiven)) return false;
        if (!Objects.equals(deadline, that.deadline)) return false;
        return Objects.equals(subjectId, that.subjectId);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (dateGiven != null ? dateGiven.hashCode() : 0);
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        result = 31 * result + (subjectId != null ? subjectId.hashCode() : 0);
        return result;
    }
}

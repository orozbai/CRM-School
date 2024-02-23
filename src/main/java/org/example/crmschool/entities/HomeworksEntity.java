package org.example.crmschool.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "homeworks", schema = "public", catalog = "postgres")
public class HomeworksEntity {
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
    @Column(name = "grade")
    private Integer grade;
    @Basic
    @Column(name = "exercise_id")
    private Integer exerciseId;
    @Basic
    @Column(name = "student_id")
    private Integer studentId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HomeworksEntity that = (HomeworksEntity) o;

        if (id != that.id) return false;
        if (!Objects.equals(description, that.description)) return false;
        if (!Objects.equals(dateGiven, that.dateGiven)) return false;
        if (!Objects.equals(grade, that.grade)) return false;
        if (!Objects.equals(exerciseId, that.exerciseId)) return false;
        return Objects.equals(studentId, that.studentId);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (dateGiven != null ? dateGiven.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        result = 31 * result + (exerciseId != null ? exerciseId.hashCode() : 0);
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        return result;
    }
}

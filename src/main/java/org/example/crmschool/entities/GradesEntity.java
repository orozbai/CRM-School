package org.example.crmschool.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "grades", schema = "public", catalog = "postgres")
public class GradesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "student_id")
    private Integer studentId;
    @Basic
    @Column(name = "subject_id")
    private Integer subjectId;
    @Basic
    @Column(name = "grade")
    private Integer grade;
    @Basic
    @Column(name = "date_given")
    private Date dateGiven;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GradesEntity that = (GradesEntity) o;

        if (id != that.id) return false;
        if (!Objects.equals(studentId, that.studentId)) return false;
        if (!Objects.equals(subjectId, that.subjectId)) return false;
        if (!Objects.equals(grade, that.grade)) return false;
        return Objects.equals(dateGiven, that.dateGiven);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        result = 31 * result + (subjectId != null ? subjectId.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        result = 31 * result + (dateGiven != null ? dateGiven.hashCode() : 0);
        return result;
    }
}

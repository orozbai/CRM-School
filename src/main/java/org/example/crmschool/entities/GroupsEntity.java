package org.example.crmschool.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "groups", schema = "public", catalog = "postgres")
public class GroupsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "group_name")
    private String groupName;
    @Basic
    @Column(name = "instructor_id")
    private Integer instructorId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupsEntity that = (GroupsEntity) o;

        if (id != that.id) return false;
        if (!Objects.equals(groupName, that.groupName)) return false;
        return Objects.equals(instructorId, that.instructorId);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
        result = 31 * result + (instructorId != null ? instructorId.hashCode() : 0);
        return result;
    }
}

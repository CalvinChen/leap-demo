package hello.model.mtm;

import leap.orm.annotation.*;
import leap.orm.model.Model;

import java.util.List;

@Table
@ManyToMany(target = Teacher.class, joinEntityType = StudentTeacher.class)
public class Student extends Model {
    @Id
    private String id;

    @Column
    private String name;

    @Relational
    private List<Teacher> teachers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
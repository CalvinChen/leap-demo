package hello.model.m2o;

import leap.orm.annotation.*;
import leap.orm.model.Model;

/**
 * Created by calvin on 2017/6/28.
 */
@Table
public class Student extends Model {
    @Id
    private String id;

    @Column
    private String name;

    @Column
    @ManyToOne(Teacher.class)
    private String teacherId;

    @Relational
    private Teacher teacher;

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

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}

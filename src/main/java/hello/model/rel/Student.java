package hello.model.rel;

import leap.lang.enums.Bool;
import leap.lang.meta.annotation.Sortable;
import leap.orm.annotation.*;
import leap.orm.model.Model;

import java.util.List;

/**
 * Created by calvin on 2017/6/28.
 */
@Table

@ManyToMany(target = Exam.class, joinEntityType = StudentExam.class)
public class Student extends Model {
    @Id
    private String id;

    @Column
    @Sortable
    private String name;

    @ManyToOne(target = Teacher.class, optional = Bool.TRUE)
    private String teacherId;

    @Relational
    private Teacher teacher;

    @Relational
    private List<Exam> exams;

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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }
}

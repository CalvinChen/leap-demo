package hello.model.mtm;

import leap.orm.annotation.Id;
import leap.orm.annotation.ManyToOne;
import leap.orm.annotation.Table;
import leap.orm.model.Model;

@Table
public class StudentTeacher extends Model {

    @Id
    @ManyToOne(Student.class)
    private String studentId;

    @Id
    @ManyToOne(Teacher.class)
    private String teacherId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}

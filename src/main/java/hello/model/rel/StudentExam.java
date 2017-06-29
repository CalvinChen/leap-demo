package hello.model.rel;

import leap.orm.annotation.Id;
import leap.orm.annotation.ManyToOne;
import leap.orm.annotation.Table;
import leap.orm.model.Model;

/**
 * Created by calvin on 2017/6/28.
 */
@Table
public class StudentExam extends Model {

    @Id
    @ManyToOne(Student.class)
    private String studentId;

    @Id
    @ManyToOne(Exam.class)
    private String examId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }
}

import java.util.ArrayList;

public class Course {
    private String courseName;
    private Teacher teacher;

    private ArrayList<Student> enrolledStudents;

    public Course (String courseName, Teacher teacher, ArrayList<Student> enrolledStudents)
    {
        this.courseName=courseName;
        this.teacher=teacher;
        this.enrolledStudents=enrolledStudents;
    }
    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}

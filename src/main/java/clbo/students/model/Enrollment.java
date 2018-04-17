package clbo.students.model;

public class Enrollment {


    private int enrollmentId;
    private Student student;
    private Course course;
    private int grade;

    public Enrollment() {
    }

    public Enrollment(int enrollmentId, Student student, Course course, int grade) {
        this.enrollmentId = enrollmentId;
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "enrollmentId=" + enrollmentId +
                ", student=" + student +
                ", course=" + course +
                ", grade=" + grade +
                '}';
    }
}

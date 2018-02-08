package clbo.students.model;

import java.util.Date;

public class Student {

    private int id;
    private String name;
    private String lastName;
    private Date EnrollmentDate;
    private String cpr;


    public Student() {
    }

    public Student(int id, String name, String lastName, Date enrollmentDate, String cpr) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        EnrollmentDate = enrollmentDate;
        this.cpr = cpr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getEnrollmentDate() {
        return EnrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        EnrollmentDate = enrollmentDate;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", EnrollmentDate=" + EnrollmentDate +
                ", cpr='" + cpr + '\'' +
                '}';
    }



}

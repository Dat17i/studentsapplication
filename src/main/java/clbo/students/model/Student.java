package clbo.students.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

public class Student {

    private int id;
    private String name;
    private String lastName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate EnrollmentDate;
    private String cpr;


    public Student() {
    }

    public Student(int id, String name, String lastName, LocalDate enrollmentDate, String cpr) {
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

    public LocalDate getEnrollmentDate() {
        return EnrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
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

package clbo.students.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

public class Course {

    private int id;
    private String title;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    private int etcs;

    public Course() {
    }

    public Course(int id, String title, LocalDate startDate, int etcs) {
        this.id = id;
        this.title = title;
        this.startDate = startDate;
        this.etcs = etcs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getEtcs() {
        return etcs;
    }

    public void setEtcs(int etcs) {
        this.etcs = etcs;
    }


}

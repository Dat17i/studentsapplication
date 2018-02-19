package clbo.students.model;

import java.util.Date;

public class Course {

    private int id;
    private String title;
    private Date startDate;
    private int etcs;

    public Course() {
    }

    public Course(int id, String title, Date startDate, int etcs) {
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getEtcs() {
        return etcs;
    }

    public void setEtcs(int etcs) {
        this.etcs = etcs;
    }


}

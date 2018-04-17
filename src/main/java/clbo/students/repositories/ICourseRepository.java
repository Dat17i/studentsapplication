package clbo.students.repositories;

import clbo.students.model.Course;
import clbo.students.model.Enrollment;

import java.util.ArrayList;

public interface ICourseRepository {

    ArrayList<Course> readAll();
    ArrayList<Enrollment> readOneWithEnrollments(int id);
    Course read(int id);
    void create(Course course);
    void update(Course course);
    void delete(int id);
}

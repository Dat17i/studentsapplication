package clbo.students.repositories;

import clbo.students.model.Student;

import java.util.ArrayList;

public interface IStudentsRepository {

    ArrayList<Student> readAll();
    Student read(int id);
    void create(Student student);
    void update(Student student);
    void delete(int id);

}

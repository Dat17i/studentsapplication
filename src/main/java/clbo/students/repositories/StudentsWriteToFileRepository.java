package clbo.students.repositories;

import clbo.students.model.Student;

import java.util.ArrayList;

public class StudentsWriteToFileRepository implements IStudentsRepository {

    @Override
    public ArrayList<Student> readAll() {
        return null;
    }

    @Override
    public Student read(int id) {

        // Specific write to file code
        return null;
    }

    @Override
    public void create(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(int id) {

    }
}

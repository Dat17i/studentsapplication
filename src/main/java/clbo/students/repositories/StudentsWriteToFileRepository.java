package clbo.students.repositories;

import clbo.students.model.Student;
import clbo.students.repositories.util.FileHandling;

import java.util.ArrayList;

public class StudentsWriteToFileRepository implements IStudentsRepository {


    @Override
    public ArrayList<Student> readAll() {

        FileHandling fh = new FileHandling();
        return fh.readFromFile();

    }

    @Override
    public Student read(int id) {
        return null;
    }

    @Override
    public void create(Student student) {

        FileHandling fh = new FileHandling();
        fh.writeToFile(student);

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(int id) {

    }

}

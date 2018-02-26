package clbo.students.repositories;

import clbo.students.model.Student;
import clbo.students.repositories.util.FileHandling;

import java.util.ArrayList;

public class StudentsFileRepository implements IStudentsRepository {


    @Override
    public ArrayList<Student> readAll() {

        FileHandling fh = new FileHandling();
        return fh.readFromFile();
    }

    @Override
    public Student read(int id) {

        FileHandling fh = new FileHandling();
        ArrayList<Student> students = fh.readFromFile();

        for (Student st : students) {
            if (st.getId() == id){
                return st;
            }
        }

        return null;
    }

    @Override
    public void create(Student student) {

        FileHandling fh = new FileHandling();
        fh.writeToFile(student);

    }

    @Override
    public void update(Student student) {

        FileHandling fh = new FileHandling();
        ArrayList<Student> students = fh.readFromFile();

        for (Student st : students) {

            if (st.getId() == student.getId()) {
                students.remove(st);
                students.add(student);
            }
        }

        fh.writeToFile(students);
    }

    @Override
    public void delete(int id) {

    }

}

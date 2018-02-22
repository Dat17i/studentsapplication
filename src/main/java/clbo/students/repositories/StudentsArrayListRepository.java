package clbo.students.repositories;

import clbo.students.model.Student;

import java.util.ArrayList;
import java.util.Date;

public class StudentsArrayListRepository implements IStudentsRepository {


    private ArrayList<Student> students = new ArrayList<>();


    public StudentsArrayListRepository() {
        students.add(new Student(1, "Claus", "Bove", new Date("2017/10/11"), "2210999999"));
        students.add(new Student(2, "Anna", "Bove", new Date(2017, 12, 12), "22199"));
        students.add(new Student(3, "Poul", "ffffff", new Date(2017, 2, 10), "221fadsda0999999"));

    }

    @Override
    public ArrayList<Student> readAll() {
        return students;
    }

    @Override
    public Student read(int id) {

        // Specific write to arraylist code

        Student stud = students.get(id-1);
        return stud;
    }

    @Override
    public void create(Student student) {
        students.add(student);
        student.setId(students.size());
    }

    @Override
    public void update(Student student) {

        for (Student st : students) {

            if (st.getId() == student.getId()) {
                students.remove(st);
                students.add(student);
            }
        }
    }

    @Override
    public void delete(int id) {

    }
}

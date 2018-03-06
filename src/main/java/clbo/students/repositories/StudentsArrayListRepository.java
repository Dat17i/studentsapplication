package clbo.students.repositories;

import clbo.students.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class StudentsArrayListRepository implements IStudentsRepository {


    private ArrayList<Student> students = new ArrayList<>();


    public StudentsArrayListRepository() {
        students.add(new Student(1, "Claus", "Bove", LocalDate.of(2017,10,11), "2210999999"));
        students.add(new Student(2, "Anna", "Bove", LocalDate.of(2017, 12, 12), "22199"));
        students.add(new Student(3, "Poul", "ffffff", LocalDate.of(2017, 2, 10), "221fadsda0999999"));

    }

    @Override
    public ArrayList<Student> readAll() {
        return students;
    }

    @Override
    public Student read(int id) {
        return students.get(id - 1);
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
        // here the "id" is maybe 1, and student number 1 would be at index number 0 in the list.
        // Therefor in order to delete the student with id number 1 you deduct 1 to the get the index

        System.out.println(students.get(id-1));
        students.remove(id-1);
    }
}

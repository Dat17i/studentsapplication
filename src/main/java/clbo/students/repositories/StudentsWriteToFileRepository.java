package clbo.students.repositories;

import clbo.students.model.Student;
import clbo.students.repositories.util.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentsWriteToFileRepository implements IStudentsRepository {

    private File f;
    private Scanner scan;
    ArrayList<Student> students;

    public StudentsWriteToFileRepository() {

        students = new ArrayList<>();
        f = new File("students.txt");

        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

       /* try {
            scan = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
    }

    @Override
    public ArrayList<Student> readAll() {

        FileHandling fh = new FileHandling();
        return fh.readFromFile();

        /*students.clear();
        f = new File("students.txt");

        try {
            scan = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        //Date date = simpleDateFormat.parse();


        while (scan.hasNextLine()) {
            try {
                students.add(new Student(scan.nextInt(), scan.next(), scan.next(), simpleDateFormat.parse(scan.next()), scan.next()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        return students;*/
    }

    @Override
    public Student read(int id) {

        // Specific write to file code
        return null;
    }

    @Override
    public void create(Student student) {

        FileHandling fh = new FileHandling();
        fh.writeToFile(student);


/*

        students.clear();
        students = readAll();
        students.add(new Student(generateRandomId(), student.getName(), student.getLastName(), student.getEnrollmentDate(), student.getCpr()));

        for (Student st: students) {
            System.out.println(st);
        }

        File f = new File("students.txt");
        PrintStream file = null;

        try {
            file = new PrintStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
*/

        /*for (Student stu : students) {

            file.print(stu.getId() + " "
                    + stu.getName() + " "
                    + stu.getLastName() + " "
                    + formateDateToString(stu.getEnrollmentDate()) + " "
                    + stu.getCpr());

            students.remove(stu);



        }*/




/*

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(student.getEnrollmentDate());
*/


    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(int id) {

    }

    private int generateRandomId() {
        return 0;
    }

/*    private String formateDateToString(Date date) {

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }*/
}

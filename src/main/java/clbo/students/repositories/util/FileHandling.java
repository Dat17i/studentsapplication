package clbo.students.repositories.util;

import clbo.students.model.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class FileHandling {
    private PrintStream file;
    private Scanner scan;
    private ArrayList<Student> list = new ArrayList<>();
    private String fileName = "students.txt";
    private String pattern = "yyyy-MM-dd";
    private SimpleDateFormat simpleDateFormat;

    public FileHandling() {
        try {
            this.scan = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        simpleDateFormat = new SimpleDateFormat(pattern);
    }

    public ArrayList<Student> readFromFile() {

        list.clear();
/*
        while (scan.hasNextLine()) {

            list.add(new Student(scan.nextInt(), scan.next(), scan.next(), parseStringToDate(scan.next()), scan.next()));

        }
*/
        return list;
    }


    public void writeToFile(Student student) {
        list = readFromFile();
        student.setId(generateRandomId());
        list.add(student);

        try {
            file = new PrintStream(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        writeListToFile(list);

    }


    public void writeToFile(ArrayList<Student> students) {

        try {
            file = new PrintStream(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        writeListToFile(students);

    }

    // Private Methods

    private void writeListToFile(ArrayList<Student> students) {

        int counter = 1;
/*
        for (Student st : students) {

            file.print(st.getId() + " "
                    + st.getName() + " "
                    + st.getLastName() + " "
                    + formatDateToString(st.getEnrollmentDate()) + " "
                    + st.getCpr());

            if (students.size() != counter) {
                file.println();
            }
            counter++;
        }
        */
    }

    private String formatDateToString(Date date) {
        return simpleDateFormat.format(date);
    }

    private Date parseStringToDate(String date) {

        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    private int generateRandomId() {
        Random r = new Random();
        int id = r.nextInt(10000000);
        return id;
    }

}

package clbo.students.repositories.util;

import clbo.students.model.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class FileHandling {
    private Scanner scan;
    private ArrayList<Student> list = new ArrayList<>();
    private String fileName = "students.txt";

    public FileHandling() {
        try {
            this.scan = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Student> readFromFile() {

        list.clear();

        while (scan.hasNextLine()) {

            list.add(new Student(scan.nextInt(), scan.next(), scan.next(), parseStringToDate(scan.next()), scan.next()));

        }

        return list;
    }


    public void writeToFile(Student student) {

        list = readFromFile();
        list.add(student);

        PrintStream file = null;
        try {
            file = new PrintStream(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int counter = 1;

        for (Student st : list) {

            file.print(generateRandomId() + " "
                    + st.getName() + " "
                    + st.getLastName() + " "
                    + formatDateToString(st.getEnrollmentDate()) + " "
                    + st.getCpr());

            if (list.size() != counter) {
                file.println();
            }
            counter++;
        }

    }

    private String formatDateToString(Date date) {

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    private Date parseStringToDate(String date) {

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();

        }
        return null;
    }

    private int generateRandomId() {
        return 0;
    }

}

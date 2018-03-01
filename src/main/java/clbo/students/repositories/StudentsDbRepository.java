package clbo.students.repositories;

import clbo.students.model.Student;
import clbo.students.repositories.util.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentsDbRepository implements IStudentsRepository {

    private Connection conn;
    private PreparedStatement preparedStatement;
    private ResultSet result;


    public StudentsDbRepository(){
        this.conn = DbConnection.getConnection();
    }

    @Override
    public ArrayList<Student> readAll() {

        ArrayList<Student> students = new ArrayList<>();

        try {
            preparedStatement = conn.prepareStatement("SELECT * FROM students");
            result = preparedStatement.executeQuery();

            while (result.next()){
                students.add(new Student(result.getInt("id"), result.getString("first_name"), result.getString("last_name"), result.getDate("enrollment_date"), result.getString("cpr") ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }

    @Override
    public Student read(int id) {
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

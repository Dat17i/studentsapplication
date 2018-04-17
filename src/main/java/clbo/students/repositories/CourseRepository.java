package clbo.students.repositories;

import clbo.students.controller.CoursesController;
import clbo.students.model.Course;
import clbo.students.model.Enrollment;
import clbo.students.model.Student;
import clbo.students.repositories.util.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CourseRepository implements ICourseRepository {


    private Connection conn;
    private PreparedStatement preparedStatement;
    private ResultSet result;

    public CourseRepository(){
        this.conn = DbConnection.getConnection();
    }


    @Override
    public ArrayList<Course> readAll() {

        ArrayList<Course> courses = new ArrayList<>();

        try {
            preparedStatement = conn.prepareStatement("SELECT * FROM courses");
            result = preparedStatement.executeQuery();

            while (result.next()){
                courses.add(new Course(result.getInt("courses_id"), result.getString("title"), result.getDate("start_date").toLocalDate(), result.getInt("etcs") ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return courses;
    }

    @Override
    public ArrayList<Enrollment> readOneWithEnrollments(int id) {
        return null;
    }

    @Override
    public Course read(int id) {
        return null;
    }

    @Override
    public void create(Course course) {

    }

    @Override
    public void update(Course course) {

    }

    @Override
    public void delete(int id) {

    }
}

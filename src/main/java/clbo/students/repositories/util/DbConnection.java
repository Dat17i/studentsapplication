package clbo.students.repositories.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private final static String USERNAME = "keastudentsapp";
    private final static String PASSWORD = "Su3x~-56vT1R";
    private final static String CONNSTRING = "jdbc:mysql://den1.mysql2.gear.host/keastudentsapp?useSSL=false";

    public static Connection getConnection() {

        try {
            return DriverManager.getConnection(CONNSTRING, USERNAME, PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}

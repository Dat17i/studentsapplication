package clbo.students.repositories.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private final static String USERNAME = "springdbclbo";
    private final static String PASSWORD = "Rk04?!6UM9bB";
    private final static String CONNSTRING = "jdbc:mysql://den1.mysql6.gear.host/springdbclbo?useSSL=false";

    public static Connection getConnection() {

        try {
            return DriverManager.getConnection(CONNSTRING, USERNAME, PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}

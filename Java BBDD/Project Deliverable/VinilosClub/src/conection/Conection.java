package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {

    private static final String URL = "jdbc:mariadb://localhost:3306/escuela";
    private static final String USER = "root";
    private static final String PASS = "password";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

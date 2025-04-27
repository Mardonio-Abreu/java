import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConexionDB {

    private final static String URL = "jdbc:mariadb://localhost:3306/";
    private final static String USER = "root";
    private final static String PASS = "password";

    public static Connection getConnection() {

        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

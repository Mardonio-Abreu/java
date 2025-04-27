import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class ConsultaAlumnos {
    public static void main(String[] args) {

        Connection conexion = ConexionDB.getConnection();

        try {
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery("select * from escuela.alumnos");

            while (resultado.next()) {

                int numero_cuenta = resultado.getInt("numero_cuenta");
                String nombre = resultado.getString("nombre");
                String apellidoPaterno = resultado.getString("apellido_paterno");
                String apellidoMaterno = resultado.getString("apellido_materno");

                System.out.printf("%-10d %-10s  %-10s  %-10s%n ", numero_cuenta, nombre, apellidoPaterno, apellidoMaterno);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

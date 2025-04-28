import java.sql.Connection;
import  java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class AlumnoDAO {



    public static void crearAlumno( Alumno alumno  ) {
        Connection conection = ConexionDB.getConnection();

        String query = "INSERT INTO escuela.alumnos VALUES(?, ?, ?, ?)";

        try {
            PreparedStatement statement = conection.prepareStatement(query);
            statement.setInt(1, alumno.getNumeroCuenta());
            statement.setString(2, alumno.getNombre());
            statement.setString(3, alumno.getApellidoPaterno());
            statement.setString(4, alumno.getApellidoMaterno());

            statement.executeUpdate();
            System.out.println("Alumno creado" + alumno.getNumeroCuenta());


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
   }

   public static void leerAlumnos(  ) {
       Connection conection = ConexionDB.getConnection();

       try {
           Statement statement = conection.createStatement();
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

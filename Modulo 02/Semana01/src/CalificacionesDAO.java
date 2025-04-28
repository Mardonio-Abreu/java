import java.sql.*;

public class CalificacionesDAO {

    static Connection conection = ConexionDB.getConnection();

    // INSERT INTO calificaciones VALUES (1, 31312, 'Calculo', 80);

    public static void crearCalificacion( Calificacion calificacion  ) {
        String query = "INSERT INTO escuela.calificaciones VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement statement = conection.prepareStatement(query);
            statement.setInt(1, calificacion.getIdCalificacion());
            statement.setInt(2, calificacion.getNumeroCuenta());
            statement.setString(3, calificacion.getMateria());
            statement.setInt(4, calificacion.getCalificacion());

            statement.executeUpdate();
            System.out.println("Calificación creada " + calificacion.getMateria() + ": " + calificacion.getCalificacion());


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
   }

   static void leerCalificaciones() {
       try {
           Statement statement = conection.createStatement();
           ResultSet resultado = statement.executeQuery("select * from escuela.calificaciones");

           while (resultado.next()) {

               int calificacionId = resultado.getInt("id");
               int numeroCuenta = resultado.getInt("numero_cuenta");
               String materia    = resultado.getString("materia");
               String calificacion = resultado.getString("calificaciones");

               System.out.printf("%-10d %-10d  %-10s  %-10s%n ", calificacionId, numeroCuenta, materia, calificacion);
           }
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
   }
}

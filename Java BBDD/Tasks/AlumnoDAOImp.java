package entities.alumno;

import assets.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAOImp implements AlumnoDAO {
    @Override
    public void agregarAlumno(Alumno alumno) {
        String query = "INSERT INTO alumnos (numero_cuenta, nombre, apellido_paterno, apellido_materno) VALUES (?,?,?,?)";

        try {
            Connection conect = ConexionBD.getConnection();
            PreparedStatement pstmt = conect.prepareStatement(query);

            pstmt.setInt(1, alumno.getnCuenta());
            pstmt.setString(2, alumno.getNombre());
            pstmt.setString(3, alumno.getApellidoPaterno());
            pstmt.setString(4, alumno.getApellidoMaterno());

            pstmt.executeUpdate();

            conect.close();
            pstmt.close();

            System.out.println("Alumno " + alumno.getnCuenta() + " agregado correctamente");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Alumno> obterAlumnos() {
        String query = "SELECT * FROM alumnos";
        List<Alumno> alumnos = new ArrayList<>();

        try {
            Connection conect = ConexionBD.getConnection();
            Statement stmt = conect.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            conect.close();
            stmt.close();

            while (rs.next()) {
                 alumnos.add(new Alumno(
                        rs.getInt("numero_cuenta"),
                        rs.getString("nombre"),
                        rs.getString("apellido_paterno"),
                        rs.getString("apellido_materno")
                ));
            }
            
            return alumnos;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Alumno obterAlumno(int numero_cuenta) {
        String query = "SELECT * FROM alumnos WHERE numero_cuenta = ?";

        try {
            Connection conect = ConexionBD.getConnection();
            PreparedStatement pstmt = conect.prepareStatement(query);

            pstmt.setInt(1, numero_cuenta);
            ResultSet rs = pstmt.executeQuery();

            conect.close();
            pstmt.close();

            if (rs.next()) {
                return new Alumno(
                        rs.getInt("numero_cuenta"),
                        rs.getString("nombre"),
                        rs.getString("apellido_paterno"),
                        rs.getString("apellido_materno")
                );
            } else {
                return null;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void actualizarAlumno(Alumno alumno) {
        String query = "UPDATE alumnos SET nombre = ?, apellido_paterno = ?, apellido_materno = ? WHERE numero_cuenta = ?";

        try {
            Connection conect = ConexionBD.getConnection();
            PreparedStatement pstmt = conect.prepareStatement(query);

            pstmt.setString(1, alumno.getNombre());
            pstmt.setString(2, alumno.getApellidoPaterno());
            pstmt.setString(3, alumno.getApellidoMaterno());
            pstmt.setInt(4, alumno.getnCuenta());

            pstmt.executeUpdate();
            System.out.println("Alumno " + alumno.getnCuenta() + " actualizado correctamente");

            conect.close();
            pstmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void eliminarAlumno(int numero_cuenta) {
        String query = "DELETE FROM alumnos WHERE numero_cuenta = ?";

        try {
            Connection conect = ConexionBD.getConnection();
            PreparedStatement pstmt = conect.prepareStatement(query);

            pstmt.setInt(1, numero_cuenta);
            pstmt.executeUpdate();

            conect.close();
            pstmt.close();

            System.out.println("Alumno " + numero_cuenta + " eliminado correctamente");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

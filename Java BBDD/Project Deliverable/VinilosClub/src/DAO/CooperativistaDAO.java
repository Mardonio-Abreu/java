package DAO;

import conection.Conection;
import pojos.Cooperativista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class CooperativistaDAO implements CRUD<Cooperativista> {

    public void insertar(Cooperativista cooperativista) {
        String query = "INSERT INTO Cooperativistas VALUES (?, ?, ?, ?, ?)";
        Connection connection = Conection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, cooperativista.getNumero_cooperativista());
            statement.setString(2, cooperativista.getNombre());
            statement.setString(3, cooperativista.getApellido_paterno());
            statement.setString(4, cooperativista.getApellido_materno());
            statement.setString(5, cooperativista.getCorreo_electronico());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void actualizar(Cooperativista cooperativista) {
        String query = "UPDATE Cooperativistas SET numero_cooperativista = ?, nombre = ?, apellido_paterno = ?, apellido_materno = ?, correo_electronico = ? WHERE numero_cooperativista = ?";
        Connection connection = Conection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, cooperativista.getNumero_cooperativista());
            statement.setString(2, cooperativista.getNombre());
            statement.setString(3, cooperativista.getApellido_paterno());
            statement.setString(4, cooperativista.getApellido_materno());
            statement.setString(5, cooperativista.getCorreo_electronico());

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void eliminar(int id) {
        String query = "DELETE FROM Cooperativistas WHERE numero_cooperativista = ?";
        Connection connection = Conection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Cooperativista buscarPorId(int id) {
        String query = "SELECT * FROM Cooperativistas WHERE numero_cooperativista = ?";
        Connection connection = Conection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Cooperativista cooperativista = new Cooperativista();
                cooperativista.setNumero_cooperativista(rs.getInt("numero_cooperativista"));
                cooperativista.setNombre(rs.getString("nombre"));
                cooperativista.setApellido_paterno(rs.getString("apellido_paterno"));
                cooperativista.setApellido_materno(rs.getString("apellido_materno"));
                cooperativista.setCorreo_electronico(rs.getString("correo_electronico"));
                return cooperativista;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public List<Cooperativista> buscarTodos() {
        List<Cooperativista> lista = new ArrayList<>();
        String query = "SELECT * FROM Cooperativistas";
        Connection connection = Conection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Cooperativista cooperativista = new Cooperativista();
                cooperativista.setNumero_cooperativista(rs.getInt("numero_cuenta"));
                cooperativista.setNombre(rs.getString("nombre"));
                cooperativista.setApellido_paterno(rs.getString("apellido_paterno"));
                cooperativista.setApellido_materno(rs.getString("apellido_materno"));
                cooperativista.setCorreo_electronico(rs.getString("fecha_nacimiento"));
                lista.add(cooperativista);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return lista;
    }
}

package DAO;

import pojos.Cliente;
import conection.Conection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class ClienteDAO implements CRUD<pojos.Cliente> {

    public void insertar(pojos.Cliente cliente) {
        String query = "INSERT INTO Clientes VALUES (?, ?, ?, ?, ?)";
        Connection connection = Conection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, cliente.getNumero_cliente());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getApellido_paterno());
            statement.setString(4, cliente.getApellido_materno());
            statement.setString(5, cliente.getCorreo_electronico());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void actualizar(Cliente cliente) {
        String query = "UPDATE Clientes SET numero_cliente = ?, nombre = ?, apellido_paterno = ?, apellido_materno = ?, correo_electronico = ? WHERE numero_cliente = ?";
        Connection connection = Conection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, cliente.getNumero_cliente());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getApellido_paterno());
            statement.setString(4, cliente.getApellido_materno());
            statement.setString(5, cliente.getCorreo_electronico());

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void eliminar(int id) {
        String query = "DELETE FROM Clientes WHERE numero_cliente = ?";
        Connection connection = Conection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Cliente buscarPorId(int id) {
        String query = "SELECT * FROM Clientes WHERE numero_cliente = ?";
        Connection connection = Conection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNumero_cliente(rs.getInt("numero_cliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido_paterno(rs.getString("apellido_paterno"));
                cliente.setApellido_materno(rs.getString("apellido_materno"));
                cliente.setCorreo_electronico(rs.getString("correo_electronico"));
                return cliente;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public List<Cliente> buscarTodos() {
        List<Cliente> lista = new ArrayList<>();
        String query = "SELECT * FROM Clientes";
        Connection connection = Conection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNumero_cliente(rs.getInt("numero_cuenta"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido_paterno(rs.getString("apellido_paterno"));
                cliente.setApellido_materno(rs.getString("apellido_materno"));
                cliente.setCorreo_electronico(rs.getString("fecha_nacimiento"));
                lista.add(cliente);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return lista;
    }
}

package DAO;

import conection.Conection;
import pojos.Articulo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class ArticuloDAO implements CRUD<Articulo> {

    public void insertar(Articulo articulo) {
        String query = "INSERT INTO Articulos VALUES (?, ?, ?, ?, ?, ?, ?)";
        Connection connection = Conection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, articulo.getNumero_articulo());
            statement.setInt(2, articulo.getNumero_cooperativista());
            statement.setString(3, articulo.getCategoria());
            statement.setString(4, articulo.getNombre());
            statement.setString(5, articulo.getDescripcion());
            statement.setDouble(6, articulo.getPrecio());
            statement.setArray(7, articulo.getFotografias());

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void actualizar(Articulo articulo) {
        String query = "UPDATE Articulos SET numero_articulo = ?, numero_cooperativista = ?, categoria = ?, nombre = ?, descripcion = ?, precio = ?, fotografias = ?  WHERE numero_articulo = ?";
        Connection connection = Conection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, articulo.getNumero_articulo());
            statement.setInt(2, articulo.getNumero_cooperativista());
            statement.setString(3, articulo.getCategoria());
            statement.setString(4, articulo.getNombre());
            statement.setString(5, articulo.getDescripcion());
            statement.setDouble(6, articulo.getPrecio());
            statement.setArray(7, articulo.getFotografias());

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void eliminar(int id) {
        String query = "DELETE FROM Articulos WHERE numero_articulo = ?";
        Connection connection = Conection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Articulo buscarPorId(int id) {
        String query = "SELECT * FROM Articulos WHERE numero_articulo = ?";
        Connection connection = Conection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Articulo articulo = new Articulo();
                articulo.setNumero_articulo(rs.getInt("numero_articulo"));
                articulo.setNumero_cooperativista(rs.getInt("numero_cooperativista"));
                articulo.setCategoria(rs.getString("categoria"));
                articulo.setNombre(rs.getString("nombre"));
                articulo.setDescripcion(rs.getString("descripcion"));
                articulo.setPrecio(rs.getDouble("precio"));
                articulo.setFotografias(rs.getArray("fotografias"));

                return articulo;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public List<Articulo> buscarTodos() {
        List<Articulo> lista = new ArrayList<>();
        String query = "SELECT * FROM Articulos";
        Connection connection = Conection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Articulo articulo = new Articulo();
                articulo.setNumero_articulo(rs.getInt("numero_cuenta"));
                articulo.setNumero_cooperativista(rs.getInt("numero_cooperativista"));
                articulo.setCategoria(rs.getString("categoria"));
                articulo.setNombre(rs.getString("nombre"));
                articulo.setDescripcion(rs.getString("descripcion"));
                articulo.setPrecio(rs.getDouble("precio"));
                articulo.setFotografias(rs.getArray("fotografias"));

                lista.add(articulo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return lista;
    }
}

package club.vinilos.dao;

import club.vinilos.model.Inventario;
import java.util.List;

public interface InventarioDAO {
    Inventario getInventarioById(int id);
    List<Inventario> getAllInventarios();
    void addInventario(Inventario inventario);
    void updateInventario(Inventario inventario, int id);
    void deleteInventario(int id);
}

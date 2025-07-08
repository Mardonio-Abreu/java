package club.vinilos.service;

import club.vinilos.model.Inventario;

import java.util.List;

public interface InventarioService {
    Inventario findInventarioById(int id);
    List<Inventario> findAllInventarios();
    void saveInventario(Inventario inventario);
    void deleteInventarioById(int id);
    void updateInventarioById(Inventario inventario, int id);
}

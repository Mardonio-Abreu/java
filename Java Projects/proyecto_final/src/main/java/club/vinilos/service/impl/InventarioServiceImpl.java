package club.vinilos.service.impl;

import club.vinilos.model.Inventario;
import club.vinilos.dao.InventarioDAO;
import club.vinilos.dao.impl.InventarioDAOImpl;
import club.vinilos.service.InventarioService;


import java.util.List;

public class InventarioServiceImpl implements InventarioService {

    private static InventarioServiceImpl instance;
    private static final InventarioDAO inventarioDAO = InventarioDAOImpl.getInstance();

    private InventarioServiceImpl() {}

    public static InventarioServiceImpl getInstance() {
        if (instance == null) {
            instance = new InventarioServiceImpl();
        }
        return instance;
    }

    public Inventario findInventarioById(int id) {
        return inventarioDAO.getInventarioById(id);
    }

    public List<Inventario> findAllInventarios() {
        return inventarioDAO.getAllInventarios();
    }

    public void saveInventario(Inventario inventario) {
        inventarioDAO.addInventario(inventario);
    }

    public void deleteInventarioById(int id) {
        inventarioDAO.deleteInventario(id);
    }

    public void updateInventarioById(Inventario inventario, int id) {
        inventarioDAO.updateInventario(inventario, id);
    }

    

}

package club.vinilos.service.impl;

import club.vinilos.model.Articulo;
import club.vinilos.dao.ArticuloDAO;
import club.vinilos.dao.impl.ArticuloDAOImpl;
import club.vinilos.service.ArticuloService;

import java.util.List;

public class ArticuloServiceImpl implements ArticuloService {

    private static ArticuloServiceImpl instance;
    private static final ArticuloDAO articuloDAO = ArticuloDAOImpl.getInstance();

    private ArticuloServiceImpl() {}

    public static ArticuloServiceImpl getInstance() {
        if (instance == null) {
            instance = new ArticuloServiceImpl();
        }
        return instance;
    }

    public Articulo findArticuloById(int id) {
        return articuloDAO.getArticuloById(id);
    }

    public List<Articulo> findAllArticulos() {
        return articuloDAO.getAllArticulos();
    }

    public void saveArticulo(Articulo articulo) {
        articuloDAO.addArticulo(articulo);
    }

    public void deleteArticuloById(int id) {
        articuloDAO.deleteArticulo(id);
    }

    public void updateArticuloById(Articulo articulo, int id) {
        articuloDAO.updateArticulo(articulo, id);
    }
}

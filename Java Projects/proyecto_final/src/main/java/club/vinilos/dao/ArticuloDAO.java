package club.vinilos.dao;

import club.vinilos.model.Articulo;
import java.util.List;

public interface ArticuloDAO {
    Articulo getArticuloById(int id);
    List<Articulo> getAllArticulos();
    void addArticulo(Articulo articulo);
    void updateArticulo(Articulo articulo, int id);
    void deleteArticulo(int id);
    }

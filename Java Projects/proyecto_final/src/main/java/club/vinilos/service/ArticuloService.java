package club.vinilos.service;

import club.vinilos.model.Articulo;

import java.util.List;

public interface ArticuloService {
    Articulo findArticuloById(int id);
    List<Articulo> findAllArticulos();
    void saveArticulo(Articulo articulo);
    void deleteArticuloById(int id);
    void updateArticuloById(Articulo articulo, int id);

}

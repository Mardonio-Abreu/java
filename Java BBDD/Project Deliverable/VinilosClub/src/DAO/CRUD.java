package DAO;

import java.util.List;

public interface CRUD<T> {

    //CRUD interface

    void insertar(T t);
    void actualizar(T t);
    void eliminar(int id);
    T buscarPorId(int id);
    List<T> buscarTodos();

}
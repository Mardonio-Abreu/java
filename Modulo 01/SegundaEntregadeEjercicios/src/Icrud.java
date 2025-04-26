public interface Icrud {

    String create(int indice, String producto);
    String read(int indice);
    String update(int indice, String producto);
    String delete(int indice);

}

package dgtic.core.modelo;

import java.util.ArrayList;

public class MariaDB implements Conexion{
    @Override
    public void enlace() {
        System.out.println("MariaDB enlace");
    }

    @Override
    public ArrayList<String> queryTabla(String query) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add(query);
        System.out.println("MariaDB query");
        return lista;
    }
}

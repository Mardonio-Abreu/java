package dgtic.core.modelo;

import java.util.ArrayList;

public class PostgreSQL implements Conexion{
    @Override
    public void enlace() {
        System.out.println("PostgreSQL enlace");
    }

    @Override
    public ArrayList<String> queryTabla(String query) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add(query);
        System.out.println("PostgreSQL query");
        return lista;
    }
}


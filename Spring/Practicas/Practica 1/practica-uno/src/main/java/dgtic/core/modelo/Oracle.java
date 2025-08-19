package dgtic.core.modelo;

import java.util.ArrayList;

public class Oracle implements Conexion{
    @Override
    public void enlace() {
        System.out.println("Oracle enlace");
    }

    @Override
    public ArrayList<String> queryTabla(String query) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add(query);
        System.out.println("Oracle query");
        return lista;
    }
}

package dgtic.core.modelo;

import java.util.ArrayList;

public interface Conexion {
    void enlace ();
    ArrayList<String> queryTabla(String query);
}

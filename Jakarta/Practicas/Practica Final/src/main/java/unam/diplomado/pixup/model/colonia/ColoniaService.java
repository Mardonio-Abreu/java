package unam.diplomado.pixup.model.colonia;

import jakarta.ejb.Local;
import jakarta.ws.rs.core.Response;

@Local
public interface ColoniaService {

    Colonia obtenerColoniaPoId(Integer id);
    Response crearColonia(Colonia colonia);
    Colonia actualizarColonia(Colonia colonia);
    void eliminarColoniaPorId(Integer id);

}

package unam.diplomado.pixup.model.colonia;

import jakarta.ejb.Local;

@Local
public interface ColoniaService {

    Colonia obtenerColoniaPoId(Integer id);
    Colonia crearColonia(Colonia colonia);
    Colonia actualizarColonia(Colonia colonia);
    void eliminarColoniaPorId(Integer id);

}

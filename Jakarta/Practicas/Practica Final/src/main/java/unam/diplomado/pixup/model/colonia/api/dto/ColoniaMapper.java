package unam.diplomado.pixup.model.colonia.api.dto;

import jakarta.ejb.Singleton;
import unam.diplomado.pixup.model.colonia.Colonia;

@Singleton
public class ColoniaMapper {
    public ColoniaDTO toDto(Colonia colonia) {
        return new ColoniaDTO(
                colonia.getId(),
                colonia.getNombre(),
                colonia.getCp(),
                colonia.getMunicipio().getNombre(),
                colonia.getMunicipio().getEstado().getNombre()
        );
    }
}
package unam.diplomado.pixup.model.disco.api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArtistaDTO {
    @NotNull(message = "Artista ID no valido")
    private Integer id;
}
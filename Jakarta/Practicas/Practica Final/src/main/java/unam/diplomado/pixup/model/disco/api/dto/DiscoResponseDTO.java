package unam.diplomado.pixup.model.disco.api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiscoResponseDTO {

    private Integer id;

    @NotNull(message = "Titulo no valido")
    private String titulo;

    @NotNull(message = "Precio no valido")
    private Double precio;

    @NotNull(message = "Numero de articulos no valido")
    private Integer existencia;

    @NotNull(message = "El descuento no valido")
    private Double descuento;

    @NotNull(message = "La imagen no valida")
    private String imagen;

    @NotNull(message = "La fecha de lanzamiento no es valida")
    private String fechaLanzamiento;

    @NotNull(message = "Artista no valido")
    private ArtistaDTO artista;

    @NotNull(message = "Disquera no valida")
    private DisqueraDTO disquera;

    @NotNull(message = "Género musical no valido")
    private GeneroMusicalDTO GeneroMusical;
}
package unam.diplomado.pixup.model.disco;

import java.time.ZonedDateTime;
import java.util.Date;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import unam.diplomado.pixup.model.artista.Artista;
import unam.diplomado.pixup.model.disquera.Disquera;
import unam.diplomado.pixup.model.generoMusical.GeneroMusical;

@Data
@NoArgsConstructor
@Entity
@Table(name = "disco")
public class Disco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private Double precio;
    private Integer existencia;
    private Double descuento;
    @Column(name = "fecha_lanzamiento")
    private ZonedDateTime fechaLanzamiento;
    private String imagen;


    @ManyToOne
    @JoinColumn (name = "id_disquera")
    private Disquera disquera;

    @ManyToOne
    @JoinColumn (name = "id_artista")
    private Artista artista;

    @ManyToOne
    @JoinColumn (name = "id_genero_musical")
    private GeneroMusical generoMusical;

}

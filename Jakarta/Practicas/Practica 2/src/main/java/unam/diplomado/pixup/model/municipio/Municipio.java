package unam.diplomado.pixup.model.municipio;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import unam.diplomado.pixup.model.estado.Estado;

@Data
@NoArgsConstructor
@Entity

@Table(name = "municipio")
public class Municipio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    @ManyToOne(targetEntity = Estado.class)
    @JoinColumn(name = "id_estado", nullable = false)
    private Estado estado;


}

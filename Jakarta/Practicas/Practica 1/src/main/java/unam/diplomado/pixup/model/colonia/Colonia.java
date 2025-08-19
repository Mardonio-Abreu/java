package unam.diplomado.pixup.model.colonia;

import unam.diplomado.pixup.model.municipio.Municipio;

import lombok.*;
import jakarta.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Colonia {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String cp;

    @ManyToOne(targetEntity = Municipio.class)
    @JoinColumn(name = "id_municipio", nullable = false)
    private Municipio municipio;


}

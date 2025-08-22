package unam.diplomado.pixup.model.colonia;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
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

    @NotBlank(message="Nombre es requerido")
    private String nombre;

    @Pattern(regexp="^(\\d{5})$",
             message = "Formato no valido para Código Postal")
    private String cp;

    @ManyToOne(targetEntity = Municipio.class)
    @JoinColumn(name = "id_municipio", nullable = false)
    private Municipio municipio;


}

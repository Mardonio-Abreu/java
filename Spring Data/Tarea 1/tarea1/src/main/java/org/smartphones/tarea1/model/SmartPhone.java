package org.smartphones.tarea1.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "smartphone")
public class SmartPhone {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int idmarca;
    private String modelo;

    @Column(name="numero_de_serie")
    private int numeroSerie;

    private double precio;
}

package org.smartphones.tarea1.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "smartphone")
public class SmartPhone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmarca")
    private Integer id;
    private String modelo;

    @Column(name="numero_de_serie")
    private Integer numeroSerie;
    private Double precio;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return getId() == that.getId() && getNumeroSerie() == that.getNumeroSerie() && Double.compare(getPrecio(), that.getPrecio()) == 0 && Objects.equals(getModelo(), that.getModelo());
    }

}

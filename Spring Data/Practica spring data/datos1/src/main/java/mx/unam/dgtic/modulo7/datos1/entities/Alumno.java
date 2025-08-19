package mx.unam.dgtic.modulo7.datos1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String carrera;
    private Double estatura;

    @Column(unique = true)
    private String email;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(getId(), alumno.getId()) && Objects.equals(getNombre(), alumno.getNombre()) && Objects.equals(getApellido(), alumno.getApellido()) && Objects.equals(getCarrera(), alumno.getCarrera()) && Objects.equals(getEstatura(), alumno.getEstatura());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getApellido(), getCarrera(), getEstatura());
    }
}

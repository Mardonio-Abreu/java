package unam.diplomado.pixup.model.disquera;

import jakarta.persistence.*;
import lombok.*;
import lombok.Data;

@Data
@NoArgsConstructor
@Entity
@Table(name = "disquera")
public class Disquera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

}

package dgtic.core.repositorio;

import dgtic.core.modelo.Estudiante;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("baseDeDatosDAO")
public class BaseDeDatosDAOImpl implements BaseDeDatosDAO {

    @Override
    public List<Estudiante> getEstudiantes(String carrera) {
        return BaseDeDatos.carreras.get(carrera);
    }

    @Override
    public Estudiante getEstudiante(String carrera, String matricula) {
        return BaseDeDatos.carreras.get(carrera).stream()
                .filter(est -> est.getMatricula().equals(matricula))
                .findFirst().orElse(null);

    }
}

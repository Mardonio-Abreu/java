package dgtic.core.repositorio;

import dgtic.core.modelo.Estudiante;

import java.util.List;

public interface BaseDeDatosDAO {
    List<Estudiante> getEstudiantes(String carrera);

    Estudiante getEstudiante(String carrera, String matricula);
}

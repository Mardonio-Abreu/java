package dgtic.core.repositorio;

import dgtic.core.modelo.Estudiante;

import java.util.List;

public interface BaseDeDatosDAO {
    public List<Estudiante> getEstudiantes(String carrera);
    public Estudiante getEstudiante(String carrera,String matricula);
}

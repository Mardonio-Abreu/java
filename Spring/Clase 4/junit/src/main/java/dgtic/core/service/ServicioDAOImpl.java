package dgtic.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ServicioDAOImpl implements ServicioDAO {
    @Autowired
    private BaseDeDatosDAO baseDeDatosDAO;

    public String getServicioDAO(String carrera) {
        return baseDeDatosDAO.getEstudiantes(carrera).stream()
                .map(alm->alm.getMatricula()+";"+
                        (alm.getMaterias().stream()
                                .map(mat->(mat.getNombre()+";"+mat.getCreditos()))
                                .collect(Collectors.joining(";")))+";"+alm.getNombre())
                .collect(Collectors.joining("\n"));
    }

}

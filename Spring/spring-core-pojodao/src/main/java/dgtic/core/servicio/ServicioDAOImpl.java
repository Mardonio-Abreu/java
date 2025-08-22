package dgtic.core.servicio;

import dgtic.core.repositorio.BaseDeDatosDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ServicioDAOImpl implements ServicioDAO {
    //    @Autowired
//    @Qualifier("baseDeDatosDAOExt")
    private BaseDeDatosDAO baseDeDatosDAO;

    @Autowired
    public void setBaseDeDatosDAO(@Qualifier("baseDeDatosDAOExt")BaseDeDatosDAO baseDeDatosDAO) {
        this.baseDeDatosDAO = baseDeDatosDAO;
    }

//    public ServicioDAOImpl(@Qualifier("baseDeDatosDAOExt")BaseDeDatosDAO baseDeDatosDAOT) {
//        this.baseDeDatosDAO = baseDeDatosDAOT;
//    }

    public String archivoCSV(String carrera) {
        return baseDeDatosDAO.getEstudiantes(carrera).stream()
                .map(alm->alm.getMatricula()+";"+
                        (alm.getMaterias().stream()
                                .map(mat->(mat.getNombre()+";"+mat.getCreditos()))
                                .collect(Collectors.joining(";")))+";"+alm.getNombre())
                .collect(Collectors.joining("\n"));
    }
}

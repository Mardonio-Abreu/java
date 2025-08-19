package dgtic.core.inicio;

import dgtic.core.repositorio.BaseDeDatosDAO;
import dgtic.core.repositorio.BaseDeDatosDAOImpl;
import dgtic.core.servicio.ServicioDAO;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Inicio {
    public static void main(String[] args) {
        ConfigurableApplicationContext contexto=
                new AnnotationConfigApplicationContext(
                        "dgtic.core"
                );
        BaseDeDatosDAO base=contexto.getBean("baseDeDatosDAO", BaseDeDatosDAOImpl.class);
        System.out.println(base.getEstudiantes("ico"));
        BaseDeDatosDAO baseDos=contexto.getBean("baseDeDatosDAO", BaseDeDatosDAOImpl.class);
        System.out.println(baseDos.getEstudiante("ime","126"));
        System.out.println("----------");
        ServicioDAO servicio=contexto.getBean(ServicioDAO.class);
        System.out.println(servicio.archivoCSV("ime"));
        contexto.close();
    }
}


package dgtic.core.inicio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import dgtic.core.servicio.EmpleadoServicio;
import dgtic.core.servicio.PredeterminadoServicio;
import dgtic.core.servicio.ReporteEmpleadoServicio;

public class Inicio {
    public static void main(String[] args) {
        ApplicationContext contexto = new ClassPathXmlApplicationContext(
                new String[] { "bean-configuration.xml",
                        "bean-services.xml"});
//factory-bean
        EmpleadoServicio servUno=(EmpleadoServicio) contexto.getBean("empleadoServicio");
        servUno.servicioEmpleado();

        ReporteEmpleadoServicio servDos=(ReporteEmpleadoServicio) contexto.getBean("empleadoServicioReporte");
        servDos.reporteDiario();
        System.out.println("----");

        PredeterminadoServicio servTres=(PredeterminadoServicio) contexto.getBean("servicioLocal");
        servTres.getEmpleadoServicio().servicioEmpleado();
        servTres.getReporteEmpleadoServicio().reporteDiario();

        ((ClassPathXmlApplicationContext) contexto).close();
    }
}
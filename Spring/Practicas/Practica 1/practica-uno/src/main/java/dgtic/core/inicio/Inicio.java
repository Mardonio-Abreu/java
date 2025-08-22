package dgtic.core.inicio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import dgtic.core.modelo.Reporte;

public class Inicio {
    public static void main(String[] args) {
        ApplicationContext contexto=
                new ClassPathXmlApplicationContext(new String[] {
                        "/src/main/java/dgtic/core/xml/bean-configuration.xml"
                });

        Reporte reporteUno = (Reporte) contexto.getBean("reporteUno");
        System.out.println(reporteUno);

//        if(emp.getActividad()!=null) {
//            emp.getActividad().realiza();
//        }

        System.out.println("-----");

        ((ClassPathXmlApplicationContext) contexto).close();
    }
}
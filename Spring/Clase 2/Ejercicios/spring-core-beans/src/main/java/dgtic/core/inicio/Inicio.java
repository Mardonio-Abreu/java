package dgtic.core.inicio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import dgtic.core.modelo.Empleado;

public class Inicio {
    public static void main(String[] args) {
        ApplicationContext contexto=
                new ClassPathXmlApplicationContext(new String[] {
                        "bean-configuration.xml"
                });
        Empleado emp=(Empleado)contexto.getBean("empleado");
        System.out.println(emp.toString());
        if(emp.getActividad()!=null) {
            emp.getActividad().realiza();
        }
        System.out.println("-----");
        Empleado empDos=(Empleado)contexto.getBean("empleadoDos");
        System.out.println(empDos.toString());
        if(empDos.getActividad()!=null) {
            empDos.getActividad().realiza();
        }
        System.out.println("-----");
        Empleado empTres=(Empleado)contexto.getBean("empleadoTres");
        empTres.setNombre("Carlos");
        System.out.println(empTres.toString());
        if(empTres.getActividad()!=null) {
            empTres.getActividad().realiza();
        }
        System.out.println("-----");
        Empleado empCuatro=(Empleado)contexto.getBean("empleadoCuatro");
        empCuatro.setNombre("Tomas");
        System.out.println(empCuatro.toString());
        if(empCuatro.getActividad()!=null) {
            empCuatro.getActividad().realiza();
        }
        System.out.println("-----");
        Empleado empCinco=(Empleado)contexto.getBean("empleadoCinco");
        System.out.println(empCinco.toString());
        if(empCinco.getActividad()!=null) {
            empCinco.getActividad().realiza();
        }
        ((ClassPathXmlApplicationContext) contexto).close();
    }
}
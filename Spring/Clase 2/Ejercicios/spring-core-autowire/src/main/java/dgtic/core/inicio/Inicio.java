package dgtic.core.inicio;

import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dgtic.core.modelo.Empleado;

public class Inicio {
    public static void main(String[] args) {
        ApplicationContext contexto = null;
        try {
            contexto = new ClassPathXmlApplicationContext(new String[] { "bean-configuration.xml" });
            Empleado emp = (Empleado) contexto.getBean("empleado");
            System.out.println(emp);
            if (emp.getActividad() != null) {
                emp.getActividad().realiza();
            }else {
                System.out.println(emp.getActividad());
            }
            System.out.println("-----");
        } catch (UnsatisfiedDependencyException ex) {
            System.out.println("No se pueden crear los beans");
        }
        if (contexto != null) {
            ((ClassPathXmlApplicationContext) contexto).close();
        }
    }
}
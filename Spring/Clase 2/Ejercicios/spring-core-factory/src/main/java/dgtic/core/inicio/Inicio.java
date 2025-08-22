package dgtic.core.inicio;

import dgtic.core.modelo.Persona;
import dgtic.core.modelo.TiposCarro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Inicio {
    public static void main(String[] args) throws IllegalAccessException {
        ApplicationContext contexto = new ClassPathXmlApplicationContext(
                new String[] { "bean-configuration.xml",
                        "bean-services.xml"});

        Persona persona = (Persona) contexto.getBean("persona");
        persona.getCoche().getModeloCoche(TiposCarro.DEPORTIVO).crear();
        System.out.println(persona.toString());
        System.out.println("--------");

        Persona personaDos = (Persona) contexto.getBean("persona");
        personaDos.setNombre("Tomas");
        personaDos.getCoche().getModeloCoche(TiposCarro.FAMILIAR).crear();
        System.out.println(personaDos.toString());
        System.out.println("--------");

        System.out.println(persona.toString());
        System.out.println("--------");
        ((ClassPathXmlApplicationContext) contexto).close();
    }
}
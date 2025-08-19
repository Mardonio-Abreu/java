package dgtic.core.inicio;

import dgtic.core.modelo.Persona;
import dgtic.core.modelo.TiposCarro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Inicio {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext(
                new String[] { "bean-configuration.xml","bean-services.xml"}
        );
        Persona persona=context.getBean("persona", Persona.class);
        try {
            persona.getCoche().getModeloCoche(TiposCarro.FAMILIAR).crear();
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        ((ClassPathXmlApplicationContext)context).close();

    }
}
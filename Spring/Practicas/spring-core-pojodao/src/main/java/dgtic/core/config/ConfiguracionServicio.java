package dgtic.core.config;

import dgtic.core.modelo.Estudiante;
import org.springframework.context.annotation.*;

@Configuration
@ImportResource(locations = {"classpath:bean-configuration.xml"})
//@ComponentScan(basePackages = "dgtic.core")
public class ConfiguracionServicio {
    @Bean("estudiante")
    @Scope("prototype")
    public Estudiante servicioEstudiante() {
        Estudiante est = new Estudiante();
        est.setNombre("Mario");
        est.setEdad(45);
        return est;
    }

    @Bean("estudianteDos")
    public Estudiante servicioEstudianteDos() {
        Estudiante est = new Estudiante();
        est.setNombre("Raul");
        est.setEdad(15);
        return est;
    }
}

package dgtic.core.config;

import dgtic.core.modelo.Estudiante;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigDos {
    @Bean(name = "estudianteTres")
    public Estudiante datos() {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Pablo");
        estudiante.setEdad(23);
        return estudiante;
    }
}

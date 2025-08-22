package mx.unam.dgtic.modsiete.perfilesdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PerfilesdemoApplication implements CommandLineRunner {

    @Value("${miapp.message}")
    private String message;

	public static void main(String[] args) {
		SpringApplication.run(PerfilesdemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");
        System.out.println(message);
    }
}

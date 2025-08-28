package org.smartphones.tarea2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("org.smartphones.tarea2.repository")
@EntityScan("org.smartphones.tarea1.model")
public class Tarea2Application {

	public static void main(String[] args) {
        SpringApplication.run(Tarea2Application.class, args);
    }
}

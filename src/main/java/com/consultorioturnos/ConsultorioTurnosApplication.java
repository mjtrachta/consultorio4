package com.consultorioturnos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories//usaremos repositorios de spring
public class ConsultorioTurnosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsultorioTurnosApplication.class, args);
	}

}

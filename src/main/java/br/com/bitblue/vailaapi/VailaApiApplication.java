package br.com.bitblue.vailaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import br.com.bitblue.vailaapi.controller.EventoController;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackageClasses = EventoController.class)
public class VailaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VailaApiApplication.class, args);
	}
}

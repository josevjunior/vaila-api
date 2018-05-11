package br.com.bitblue.vailaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
//@ImportResource(value = "classpath:/configuration/hsqldb_cfg.xml")
public class VailaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VailaApiApplication.class, args);
	}
}

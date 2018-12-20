package br.com.helenilson.matias.agendaconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AgendaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaConfigServerApplication.class, args);
	}

}


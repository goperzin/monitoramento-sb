package br.com.itau.sbccmonitoramento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class SbccMonitoramentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbccMonitoramentoApplication.class, args);
	}

}

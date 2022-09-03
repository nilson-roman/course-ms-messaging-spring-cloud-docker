package io.github.cursodsousa.msavaliacaodecredito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsavaliacaodecreditoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsavaliacaodecreditoApplication.class, args);
	}

}

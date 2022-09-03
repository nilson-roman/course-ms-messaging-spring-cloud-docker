package io.github.cursodsousa.msavaliacaodecredito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MsavaliacaodecreditoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsavaliacaodecreditoApplication.class, args);
	}

}

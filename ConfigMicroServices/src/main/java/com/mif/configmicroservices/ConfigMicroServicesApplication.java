package com.mif.configmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigMicroServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigMicroServicesApplication.class, args);
	}

}

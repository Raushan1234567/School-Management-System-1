package com.rau;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RauServiceDiscoveryServerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RauServiceDiscoveryServerServiceApplication.class, args);
	}

}

package com.mnr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("classpath:/integration-config.xml")
public class DemoSpringIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringIntegrationApplication.class, args);
	}

}

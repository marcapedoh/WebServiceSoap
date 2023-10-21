package com.MarcRG.SoapWebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SoapWebServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(SoapWebServiceApplication.class, args);
	}

}

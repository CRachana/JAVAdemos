package com.sample.poc_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
public class PocProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocProjectApplication.class, args);
	}
}



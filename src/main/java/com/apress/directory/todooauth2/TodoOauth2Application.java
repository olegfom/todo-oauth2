package com.apress.directory.todooauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.apress.todo"})
public class TodoOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(TodoOauth2Application.class, args);
	}

}

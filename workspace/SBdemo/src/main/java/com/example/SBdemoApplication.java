package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SBdemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SBdemoApplication.class, args);
	    ConfigurableApplicationContext cac = SpringApplication.run(SBdemoApplication.class, args);
	    SBdemoApplication app = cac.getBean(SBdemoApplication.class);
	    app.hello();
	}

	public void hello() {
		 System.out.println("hello()");
	}
}

package com.tothenew.bootcamp.First;

import com.tothenew.bootcamp.First.Q6.ConstructorInjection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(FirstApplication.class, args);

	}
}
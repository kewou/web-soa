package com.beezy.websoa;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class WebSoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSoaApplication.class, args);
	}

	@Autowired
	private Environment environment;

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("\nSbeezy JAVA SE TEST");

			DateFormat formatter = new SimpleDateFormat("dd-MMM-yy");

			System.out.println(Calendar.getInstance().getTimeInMillis());

			// String[] beanNames = ctx.getBeanDefinitionNames();
			// Arrays.sort(beanNames);
			// for (String beanName : beanNames) {
			// //System.out.println(beanName);
			// }

		};
	}
}

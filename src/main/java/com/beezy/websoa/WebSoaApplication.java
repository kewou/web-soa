package com.beezy.websoa;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import antlr.collections.List;

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
            
            ArrayList<Integer> listeInt = new ArrayList<Integer>();
            listeInt.add(3);
            listeInt.add(6);
            listeInt.add(9);
            for(int i=0;i<listeInt.size()-1;i++){
            	System.out.println(listeInt.get(i)+"-"+listeInt.get(i+1));
            }
            
                       
            
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                //System.out.println(beanName);
//            }

        };
    }
}

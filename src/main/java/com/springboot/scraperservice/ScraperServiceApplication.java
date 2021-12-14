package com.springboot.scraperservice;

import com.springboot.scraperservice.webscraper.ScraperEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ScraperServiceApplication {

    public static void main(String[] args) {
        try{
        ConfigurableApplicationContext context = SpringApplication.run(ScraperServiceApplication.class, args);
		context.getBean(ScraperEngine.class).start();
     } catch (Exception e) {
        e.printStackTrace();
    }
    }

}

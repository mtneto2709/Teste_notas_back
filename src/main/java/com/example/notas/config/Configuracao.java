package com.example.notas.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class Configuracao extends WebMvcConfigurerAdapter {
	
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**/*")
        .allowedMethods("GET", "POST", "OPTIONS", "PUT", "DELETE")
        .allowedHeaders(
                "token",
          "Content-Type", 
          "X-Requested-With", 
          "accept", 
          "Origin", 
          "Access-Control-Request-Method",
                "Access-Control-Request-Headers");
    }
}

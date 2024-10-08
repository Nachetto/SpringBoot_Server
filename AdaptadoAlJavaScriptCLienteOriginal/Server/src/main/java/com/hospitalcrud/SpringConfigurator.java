package com.hospitalcrud;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringConfigurator implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5500", "null", "http://localhost:63342")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS") // Añade "OPTIONS" aquí
                .allowCredentials(true);
    }
}
package Ejercicio.Arcane;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // Esto hace que al entrar a localhost:8080/ muestre tu personajes.html
        registry.addViewController("/").setViewName("forward:/personajes.html");
    }
}


package pe.edu.cibertec.integrantes_frontend_prj.config;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplateListado(RestTemplateBuilder builder) {
        return builder
                .rootUri("http://localhost:8181/auth")
                .build();
    }

}

package pe.edu.cibertec.integrantes_frontend_prj.config;

import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public Request.Options requestOptions() {
        //Declaramos un timeout para conectarnos y otro para lectura
        return new Request.Options(10000, 10000);
    }
}

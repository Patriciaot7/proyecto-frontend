package pe.edu.cibertec.integrantes_frontend_prj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//Habilitamos el Feign Client y ya se podra usar
@EnableFeignClients
public class 	IntegrantesFrontendPrjApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrantesFrontendPrjApplication.class, args);
	}

}

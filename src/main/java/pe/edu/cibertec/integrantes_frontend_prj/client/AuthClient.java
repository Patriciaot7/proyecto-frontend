package pe.edu.cibertec.integrantes_frontend_prj.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.edu.cibertec.integrantes_frontend_prj.config.FeignConfig;
import pe.edu.cibertec.integrantes_frontend_prj.dto.LoginRequestDTO;
import pe.edu.cibertec.integrantes_frontend_prj.dto.LoginResponseDTO;

import java.util.ArrayList;

//Asociamos la clase config al Feign
@FeignClient(name = "autenticacion", url = "http://localhost:8181/auth", configuration = FeignConfig.class) //Permitira pasar los servicios que queramos consumir
public interface AuthClient {
    //Firma del login
    @PostMapping("/login")
    ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO loginRequestDTO);

    @GetMapping("/integrantes")
    ArrayList<String> integrantes();

}

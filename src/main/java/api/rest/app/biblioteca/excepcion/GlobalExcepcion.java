package api.rest.app.biblioteca.excepcion;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExcepcion {

    @ExceptionHandler(NotFoundExcepcion.class)
    public ResponseEntity<Map<String,Object>> datoNoEncontrado(NotFoundExcepcion ex){
        Map<String,Object> respuesta=new HashMap<>();
        respuesta.put("mensaje", ex.getMensaje());
    }
}

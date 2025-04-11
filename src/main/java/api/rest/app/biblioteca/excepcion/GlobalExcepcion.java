package api.rest.app.biblioteca.excepcion;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExcepcion {

    @ExceptionHandler(NotFoundExcepcion.class)
    public ResponseEntity<Map<String,Object>> datoNoEncontrado(NotFoundExcepcion ex){
        Map<String,Object> respuesta=new HashMap<>();
        respuesta.put("mensaje", ex.getMensaje());
        respuesta.put("timestamp", new Timestamp(System.currentTimeMillis()));
        respuesta.put("codigo", HttpStatus.NOT_FOUND.value());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(respuesta);
    }
}

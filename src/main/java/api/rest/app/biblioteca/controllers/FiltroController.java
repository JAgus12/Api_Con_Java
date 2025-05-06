package api.rest.app.biblioteca.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.rest.app.biblioteca.services.LibroServiceManager;
import api.rest.app.biblioteca.services.PeliculaServiceManager;
import api.rest.app.biblioteca.services.RevistaServiceManager;

@RestController
@RequestMapping("/api/filtrar")
public class FiltroController {

    private final LibroServiceManager libroService;
    private final PeliculaServiceManager peliculaService;
    private final RevistaServiceManager revistaService;
    
    public FiltroController(LibroServiceManager libroService, PeliculaServiceManager peliculaService,
            RevistaServiceManager revistaService) {
        this.libroService = libroService;
        this.peliculaService = peliculaService;
        this.revistaService = revistaService;
    }

    @GetMapping("/{tipo}")
    public List<?> filtrar(@PathVariable String tipo){
        switch (tipo.toLowerCase()) {
            case "libro":
                return libroService.finAll();
            case "pelicula":
                return peliculaService.findAll();
            case "revista":
                return revistaService.findAll();
            default:
                return List.of();
        }
    }
    

}

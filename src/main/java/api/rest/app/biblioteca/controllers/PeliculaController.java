package api.rest.app.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.rest.app.biblioteca.entities.Pelicula;
import api.rest.app.biblioteca.services.PeliculaServiceManager;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculaController {

    @Autowired
    private PeliculaServiceManager serviceManager;

    @GetMapping()
    @Transactional(readOnly = true)
    public List<Pelicula> findAll(){
        return this.serviceManager.findAll();
    }

    @GetMapping("/{producto_id}")
    @Transactional
    public Pelicula findPelicula(@PathVariable Long producto_id){
        return this.serviceManager.findById(producto_id);
    }

    @PostMapping()
    @Transactional
    public Pelicula save(@RequestBody Pelicula pelicula){
        return this.serviceManager.save(pelicula);
    }

    @DeleteMapping("/{producto_id}")
    @Transactional
    public Pelicula deletePelicula(@PathVariable Long producto_id){
        return this.serviceManager.deleteById(producto_id);
    }

    @PutMapping("/{producto_id}")
    @Transactional
    public Pelicula updatePelicula(@PathVariable Long producto_id,@RequestBody Pelicula pelicula){
        return this.serviceManager.update(producto_id, pelicula);
    }
}

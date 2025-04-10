package api.rest.app.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.rest.app.biblioteca.model.entity.Libro;
import api.rest.app.biblioteca.services.LibroServiceManager;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private LibroServiceManager serviceManager;

    @GetMapping()
    @Transactional(readOnly = true)
    public List<Libro> findAllLibros(){
        return this.serviceManager.finAll();
    } 

    @GetMapping("/{id}")
    @Transactional(readOnly = true)
    public Libro findLibro(@PathVariable Long id){
        return this.serviceManager.findById(id);
    }

    @PostMapping()
    @Transactional
    public Libro save(@RequestBody Libro libro){
        return this.serviceManager.save(libro);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public Libro deleteLibro(@PathVariable Long id){
        return this.serviceManager.deleteById(id);
    }

    @PutMapping("/{id}")
    @Transactional
    public Libro updateLibro(@PathVariable Long id,@RequestBody Libro libro){
        return this.serviceManager.update(id, libro);
    }
}

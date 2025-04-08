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

import api.rest.app.biblioteca.entities.Libro;
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

    @GetMapping("/{isbn}")
    @Transactional(readOnly = true)
    public Libro findLibro(@PathVariable String isbn){
        return this.serviceManager.findById(isbn);
    }

    @PostMapping()
    @Transactional
    public Libro save(@RequestBody Libro libro){
        return this.serviceManager.save(libro);
    }

    @DeleteMapping("/{isbn}")
    @Transactional
    public Libro deleteLibro(@PathVariable String isbn){
        return this.serviceManager.deleteById(isbn);
    }

    @PutMapping("/{isbn}")
    @Transactional
    public Libro updateLibro(@PathVariable String isbn,@RequestBody Libro libro){
        return this.serviceManager.update(isbn, libro);
    }
}

package api.rest.app.biblioteca.controllers;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.rest.app.biblioteca.model.entity.Genero;
import api.rest.app.biblioteca.services.GeneroServiceManager;

@RestController
@RequestMapping("/api/generos")
public class GeneroController {

    private final GeneroServiceManager generoServiceManager;

    public GeneroController(GeneroServiceManager generoServiceManager) {
        this.generoServiceManager = generoServiceManager;
    }

    @GetMapping()
    @Transactional(readOnly = true)
    public List<Genero> findAll(){
        return this.generoServiceManager.findAll();
    }

    @GetMapping("/{genero_id}")
    @Transactional(readOnly = true)
    public Genero findGenero(@PathVariable Long genero_id){
        return this.generoServiceManager.findById(genero_id);
    }

    @PostMapping()
    @Transactional
    public Genero save(@RequestBody Genero genero){
        return this.generoServiceManager.save(genero);
    }

    @DeleteMapping("/{genero_id}")
    @Transactional
    public Genero deleteGenero(@PathVariable Long genero_id){
        return this.generoServiceManager.deleteById(genero_id);
    }

    @PutMapping("/{genero_id}")
    @Transactional
    public Genero updateGenero(@PathVariable Long genero_id,@RequestBody Genero genero){
        return this.generoServiceManager.update(genero_id, genero);
    }
}

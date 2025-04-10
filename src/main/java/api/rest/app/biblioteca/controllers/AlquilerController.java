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

import api.rest.app.biblioteca.entities.Alquiler;
import api.rest.app.biblioteca.services.AlquilerServiceManager;

@RestController
@RequestMapping("/api/alquileres")
public class AlquilerController {

    @Autowired
    private AlquilerServiceManager serviceManager;

    @GetMapping()
    @Transactional(readOnly = true)
    public List<Alquiler> findAll(){
        return this.serviceManager.findAll();
    }

    @GetMapping("/{alquiler_id}")
    @Transactional
    public Alquiler findById(@PathVariable Long alquiler_id){
        return this.serviceManager.findById(alquiler_id);
    }

    @PostMapping()
    @Transactional
    public Alquiler save(@RequestBody Alquiler alquiler){
        return this.serviceManager.save(alquiler);
    }

    @DeleteMapping("/{alquiler_id}")
    @Transactional
    public Alquiler deleteById(@PathVariable Long alquiler_id){
        return this.serviceManager.deleteById(alquiler_id);
    }

    @PutMapping("/{alquiler_id}")
    @Transactional
    public Alquiler updateAlquiler(@PathVariable Long alquiler_id,@RequestBody Alquiler alquiler){
        return this.serviceManager.update(alquiler_id, alquiler);
    }
}

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

import api.rest.app.biblioteca.entities.Direccion;
import api.rest.app.biblioteca.services.DireccionServiceManager;

@RestController
@RequestMapping("/api/direcciones")
public class DireccionController {

    @Autowired
    private DireccionServiceManager serviceManager;

    @GetMapping()
    @Transactional(readOnly = true)
    public List<Direccion> findAllDireccions(){
        return this.serviceManager.findAll();
    }

    @GetMapping("/{direccion_id}")
    @Transactional(readOnly = true)
    public Direccion findDireccion(@PathVariable Long direccion_id){
        return this.serviceManager.findById(direccion_id);
    }

    @PostMapping()
    @Transactional
    public Direccion save(@RequestBody Direccion direccion){
        return this.serviceManager.save(direccion);
    }

    @DeleteMapping("/{direccion_id}")
    @Transactional
    public Direccion deleteDireccion(@PathVariable Long direccion_id){
        return this.serviceManager.deleteById(direccion_id);
    }

    @PutMapping("/{direccion_id}")
    @Transactional
    public Direccion updateDireccion(@PathVariable Long direccion_id,@RequestBody Direccion direccion){
        return this.serviceManager.update(direccion_id,direccion);
    }
}

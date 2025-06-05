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

import api.rest.app.biblioteca.Dto.AlquilerDto;
import api.rest.app.biblioteca.model.entity.Alquiler;
import api.rest.app.biblioteca.services.AlquilerServiceManager;

@RestController
@RequestMapping("/api/alquileres")
public class AlquilerController {

    private final AlquilerServiceManager serviceManager;

    public AlquilerController(AlquilerServiceManager serviceManager) {
        this.serviceManager = serviceManager;
    }

    @GetMapping()
    @Transactional(readOnly = true)
    public List<Alquiler> findAll(){
        return this.serviceManager.findAll();
    }

    @GetMapping("/{alquiler_id}")
    @Transactional
    public Alquiler findAlquiler(@PathVariable Long alquiler_id){
        return this.serviceManager.findById(alquiler_id);
    }

    @GetMapping("/usuario/{usuario}")
    @Transactional
    public Alquiler findAlquilerUsuario(@PathVariable String usuario){
        return this.serviceManager.findAlquilerUsuario(usuario);
    }

    @PostMapping()
    @Transactional
    public Alquiler save(@RequestBody AlquilerDto alquiler){
        return this.serviceManager.save(alquiler);
    }

    @DeleteMapping("/{alquiler_id}")
    @Transactional
    public Alquiler deleteAlquiler(@PathVariable Long alquiler_id){
        return this.serviceManager.deleteById(alquiler_id);
    }

    @PutMapping("/{alquiler_id}")
    @Transactional
    public Alquiler updateAlquiler(@PathVariable Long alquiler_id,@RequestBody Alquiler alquiler){
        return this.serviceManager.update(alquiler_id, alquiler);
    }

    @GetMapping("/productosAlquilados/{producto_id}")
    public int productosAlqulados(@PathVariable Long producto_id){
        return this.serviceManager.countById(producto_id);
    }
}

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

import api.rest.app.biblioteca.model.entity.Revista;
import api.rest.app.biblioteca.services.RevistaServiceManager;

@RestController
@RequestMapping("/api/revistas")
public class RevistaController {

    private final RevistaServiceManager serviceManager;

    public RevistaController(RevistaServiceManager serviceManager) {
        this.serviceManager = serviceManager;
    }

    @GetMapping()
    @Transactional(readOnly = true)
    public List<Revista> findAllRevistas(){
        return this.serviceManager.findAll();
    }

    @GetMapping("/{producto_id}")
    @Transactional
    public Revista findRevista(@PathVariable Long producto_id){
        return this.serviceManager.findById(producto_id);
    }

    @PostMapping()
    @Transactional
    public Revista save(@RequestBody Revista revista){
        return this.serviceManager.save(revista);
    }

    @DeleteMapping("/{producto_id}")
    @Transactional
    public Revista deleteRevista(@PathVariable Long producto_id){
        return this.serviceManager.deleteById(producto_id);
    }

    @PutMapping("/{producto_id}")
    @Transactional
    public Revista updateRevista(@PathVariable Long producto_id,@RequestBody Revista revista){
        return this.serviceManager.update(producto_id, revista);
    }
}

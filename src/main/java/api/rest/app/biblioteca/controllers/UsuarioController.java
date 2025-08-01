package api.rest.app.biblioteca.controllers;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.rest.app.biblioteca.model.entity.Usuario;
import api.rest.app.biblioteca.services.UsuarioServiceManager;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private UsuarioServiceManager serviceManager;
    
    public UsuarioController(UsuarioServiceManager serviceManager) {
        this.serviceManager = serviceManager;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping()
    @Transactional(readOnly = true)
    public List<Usuario> findAllUsuarios(){
        return this.serviceManager.findAll();
    }

    @GetMapping("/{usuario}")
    @Transactional(readOnly = true)
    public Usuario findById(@PathVariable String usuario){
        return this.serviceManager.findById(usuario);
    }

    @PostMapping()
    @Transactional
    public Usuario save(@RequestBody Usuario usuario){
        return this.serviceManager.save(usuario);
    }

    @DeleteMapping("/{usuario}")
    @Transactional
    public Usuario deleteUser(@PathVariable String usuario){
        return this.serviceManager.deleteById(usuario);
    }

    @PutMapping("/{usuario}")
    @Transactional
    public Usuario updateUser(@PathVariable String usuario,@RequestBody Usuario user){
        return this.serviceManager.update(usuario, user);
    }


  


}

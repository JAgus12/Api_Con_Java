package api.rest.app.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.rest.app.biblioteca.model.entity.Usuario;
import api.rest.app.biblioteca.repositories.UsuarioRepository;

@Service
public class UsuarioServiceManager implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) this.repository.findAll();
    }

    @Override
    public Usuario findById(String usuario) {
       return this.repository.findById(usuario).get();
       
    }

    @Override
    public Usuario save(Usuario usuario) {
        return this.repository.save(usuario);
    }

    @Override
    public Usuario deleteById(String usuario) {
        Usuario usuarioborrado=this.repository.findById(usuario).get();
        this.repository.deleteById(usuario);
        return usuarioborrado;
    }

    @Override
    public Usuario update(String usuario, Usuario user) {
        Usuario usuarioModificar=this.repository.findById(usuario).get();
        usuarioModificar.setNombre(user.getNombre());
        usuarioModificar.setApellido1(user.getApellido1());
        usuarioModificar.setApellido2(user.getApellido2());
        usuarioModificar.setPassword(user.getPassword());
        usuarioModificar.setEmail(user.getEmail());
        usuarioModificar.setFechaNacimiento(user.getFechaNacimiento());
        usuarioModificar.setFechaAlta(user.getFechaAlta());
        usuarioModificar.setRol(user.getRol());
        usuarioModificar.setTelefono(user.getTelefono());
        usuarioModificar.setActivo(user.getActivo());
        return this.repository.save(usuarioModificar);

    }

    @Override
    public Boolean existsById(String usuario) {
        return this.repository.existsById(usuario);
    }

    

}

package api.rest.app.biblioteca.services;

import java.util.List;

import org.springframework.stereotype.Service;

import api.rest.app.biblioteca.excepcion.NotFoundExcepcion;
import api.rest.app.biblioteca.model.entity.Usuario;
import api.rest.app.biblioteca.repositories.UsuarioRepository;

@Service
public class UsuarioServiceManager implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceManager(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) this.usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(String usuario) {
       return this.usuarioRepository.findById(usuario).orElseThrow(()->new NotFoundExcepcion("No existe este usuario"));
       
    }

    @Override
    public Usuario save(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    @Override
    public Usuario deleteById(String usuario) {
        Usuario usuarioborrado=this.usuarioRepository.findById(usuario).get();
        this.usuarioRepository.deleteById(usuario);
        return usuarioborrado;
    }

    @Override
    public Usuario update(String usuario, Usuario user) {
        Usuario usuarioModificar=this.usuarioRepository.findById(usuario).get();
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
        return this.usuarioRepository.save(usuarioModificar);

    }

    @Override
    public Boolean existsById(String usuario) {
        return this.usuarioRepository.existsById(usuario);
    }

    

}

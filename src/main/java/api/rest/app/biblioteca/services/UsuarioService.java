package api.rest.app.biblioteca.services;

import java.util.List;

import api.rest.app.biblioteca.entities.Usuario;

public interface UsuarioService {

    List<Usuario> findAll();
    Usuario findById(String usuario);
    Usuario save(Usuario usuario);
    Usuario deleteById(String usuario);
    Usuario update(String usuario,Usuario user);
}

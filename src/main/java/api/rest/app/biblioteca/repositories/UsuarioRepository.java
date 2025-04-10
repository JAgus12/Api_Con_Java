package api.rest.app.biblioteca.repositories;

import org.springframework.data.repository.CrudRepository;

import api.rest.app.biblioteca.model.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario,String> {

}

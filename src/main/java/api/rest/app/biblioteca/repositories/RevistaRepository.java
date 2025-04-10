package api.rest.app.biblioteca.repositories;

import org.springframework.data.repository.CrudRepository;

import api.rest.app.biblioteca.model.entity.Revista;

public interface RevistaRepository extends CrudRepository<Revista,Long> {

}

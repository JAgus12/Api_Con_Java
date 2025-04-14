package api.rest.app.biblioteca.repositories;

import org.springframework.data.repository.CrudRepository;

import api.rest.app.biblioteca.model.entity.Genero;

public interface GeneroRepository extends CrudRepository<Genero,Long> {

}

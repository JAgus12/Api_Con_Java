package api.rest.app.biblioteca.repositories;

import org.springframework.data.repository.CrudRepository;

import api.rest.app.biblioteca.model.entity.Pelicula;

public interface PeliculaRepository extends CrudRepository<Pelicula,Long> {

}

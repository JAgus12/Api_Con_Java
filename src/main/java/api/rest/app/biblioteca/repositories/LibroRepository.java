package api.rest.app.biblioteca.repositories;

import org.springframework.data.repository.CrudRepository;

import api.rest.app.biblioteca.entities.Libro;

public interface LibroRepository extends CrudRepository<Libro,Long> {

}

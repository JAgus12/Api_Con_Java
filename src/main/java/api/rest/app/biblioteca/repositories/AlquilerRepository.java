package api.rest.app.biblioteca.repositories;

import org.springframework.data.repository.CrudRepository;

import api.rest.app.biblioteca.entities.Alquiler;

public interface AlquilerRepository extends CrudRepository<Alquiler,Long> {

}

package api.rest.app.biblioteca.services;

import java.util.List;

import api.rest.app.biblioteca.entities.Pelicula;

public interface PeliculaService {

    List<Pelicula> findAll();
    Pelicula findById(Long producto_id);
    Pelicula save(Pelicula pelicula);
    Pelicula deleteById(Long producto_id);
    Pelicula update(Long producto_id,Pelicula pelicula);

}

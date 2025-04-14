package api.rest.app.biblioteca.services;

import java.util.List;

import api.rest.app.biblioteca.model.entity.Genero;

public interface GeneroService {

    List<Genero> findAll();
    Genero findById(Long id);
    Genero save(Genero genero);
    Genero deleteById(Long id);
    Genero update(Long id,Genero genero);
}

package api.rest.app.biblioteca.services;

import java.util.List;

import api.rest.app.biblioteca.model.entity.Libro;

public interface LibroService {

    List<Libro> finAll();
    Libro findById(Long id);
    Libro save(Libro libro);
    Libro deleteById(Long id);
    Libro update(Long id,Libro libro);
}

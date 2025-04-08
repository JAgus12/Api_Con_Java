package api.rest.app.biblioteca.services;

import java.util.List;

import api.rest.app.biblioteca.entities.Libro;

public interface LibroService {

    List<Libro> finAll();
    Libro findById(String isbn);
    Libro save(Libro libro);
    Libro deleteById(String isbn);
    Libro update(String isbn,Libro libro);
}

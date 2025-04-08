package api.rest.app.biblioteca.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.rest.app.biblioteca.entities.Libro;
import api.rest.app.biblioteca.repositories.LibroRepository;

@Service
public class LibroServiceManager implements LibroService {


    @Autowired
    private LibroRepository repository;


    @Override
    public Libro deleteById(String isbn) {
        Libro libroBorrado=this.repository.findById(isbn).get();
        this.repository.deleteById(isbn);
        return libroBorrado;
    }

    @Override
    public List<Libro> finAll() {
        return (List<Libro>) this.repository.findAll();
    }

    @Override
    public Libro findById(String isbn) {
        return this.repository.findById(isbn).get();
    }

    @Override
    public Libro save(Libro libro) {
        return this.repository.save(libro);
    }

    @Override
    public Libro update(String isbn, Libro libro) {
        Libro libroModificar=this.repository.findById(isbn).get();
        libroModificar.setAutor(libro.getAutor());
        libroModificar.setDescripcion(libro.getDescripcion());
        libroModificar.setEditorial(libro.getEditorial());
        libroModificar.setTitulo(libro.getTitulo());
        libroModificar.setFechaModificacion(new Timestamp(System.currentTimeMillis()));
        libroModificar.setUnidades(libro.getUnidades());
        if(libro.getFechaAlta()==null){
            libroModificar.setFechaAlta(libroModificar.getFechaAlta());
        }
        libroModificar.setFechaAlta(libro.getFechaAlta());
        return this.repository.save(libroModificar);
    }

    
}

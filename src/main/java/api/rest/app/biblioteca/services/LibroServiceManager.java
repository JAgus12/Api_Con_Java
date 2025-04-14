package api.rest.app.biblioteca.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Service;

import api.rest.app.biblioteca.excepcion.NotFoundExcepcion;
import api.rest.app.biblioteca.model.entity.Libro;
import api.rest.app.biblioteca.repositories.LibroRepository;

@Service
public class LibroServiceManager implements LibroService {

    private final LibroRepository libroRepository;

    public LibroServiceManager(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    @Override
    public Libro deleteById(Long id) {
        Libro libroBorrado=this.libroRepository.findById(id).orElseThrow(()->new NotFoundExcepcion("No existe ese libro"));
        this.libroRepository.deleteById(id);
        return libroBorrado;
    }

    @Override
    public List<Libro> finAll() {
        return (List<Libro>) this.libroRepository.findAll();
    }

    @Override
    public Libro findById(Long id) {
        return this.libroRepository.findById(id).orElseThrow(()->new NotFoundExcepcion("EL libro con ese Id no existe"));
    }

    @Override
    public Libro save(Libro libro) {
        return this.libroRepository.save(libro);
       
    }

    @Override
    public Libro update(Long id, Libro libro) {
        Libro libroModificar=this.libroRepository.findById(id).get();
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
        return this.libroRepository.save(libroModificar);
    }

    
}

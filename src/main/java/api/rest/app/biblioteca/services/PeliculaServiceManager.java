package api.rest.app.biblioteca.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.rest.app.biblioteca.entities.Pelicula;
import api.rest.app.biblioteca.repositories.PeliculaRepository;

@Service
public class PeliculaServiceManager implements PeliculaService {

    @Autowired
    private PeliculaRepository repository;

    @Override
    public Pelicula deleteById(Long producto_id) {
        Pelicula peliculaBorrada = this.repository.findById(producto_id).get();
        this.repository.deleteById(producto_id);
        return peliculaBorrada;
    }

    @Override
    public List<Pelicula> findAll() {
        return (List<Pelicula>) this.repository.findAll();
    }

    @Override
    public Pelicula findById(Long producto_id) {
        return this.repository.findById(producto_id).get();
    }

    @Override
    public Pelicula save(Pelicula pelicula) {
        return this.repository.save(pelicula);
    }

    @Override
    public Pelicula update(Long producto_id, Pelicula pelicula) {
        Pelicula peliculaModificar = this.repository.findById(producto_id).get();
        peliculaModificar.setAlquileres(pelicula.getAlquileres());
        peliculaModificar.setAnho(pelicula.getAnho());
        peliculaModificar.setCreatedBy(pelicula.getAnho());
        peliculaModificar.setDescripcion(pelicula.getDescripcion());
        peliculaModificar.setDirector(pelicula.getDirector());
        peliculaModificar.setDuracion(pelicula.getDuracion());
        pelicula.setFechaAlta(pelicula.getFechaAlta());
        peliculaModificar.setFechaModificacion(new Timestamp(System.currentTimeMillis()));
        peliculaModificar.setProductor(pelicula.getProductor());
        peliculaModificar.setTipo(pelicula.getTipo());
        peliculaModificar.setTitulo(pelicula.getTitulo());
        peliculaModificar.setUnidades(pelicula.getUnidades());
        peliculaModificar.setUpdateBy(pelicula.getUpdateBy());
        return this.repository.save(peliculaModificar);
    }

    
}

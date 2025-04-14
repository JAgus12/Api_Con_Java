package api.rest.app.biblioteca.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Service;

import api.rest.app.biblioteca.excepcion.NotFoundExcepcion;
import api.rest.app.biblioteca.model.entity.Pelicula;
import api.rest.app.biblioteca.repositories.PeliculaRepository;

@Service
public class PeliculaServiceManager implements PeliculaService {

    private final PeliculaRepository peliculaRepository;

    public PeliculaServiceManager(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }

    @Override
    public Pelicula deleteById(Long producto_id) {
        Pelicula peliculaBorrada = this.peliculaRepository.findById(producto_id).get();
        this.peliculaRepository.deleteById(producto_id);
        return peliculaBorrada;
    }

    @Override
    public List<Pelicula> findAll() {
        return (List<Pelicula>) this.peliculaRepository.findAll();
    }

    @Override
    public Pelicula findById(Long producto_id) {
        return this.peliculaRepository.findById(producto_id).orElseThrow(()->new NotFoundExcepcion("No existe esa pelicula con ese id"));
    }

    @Override
    public Pelicula save(Pelicula pelicula) {
        return this.peliculaRepository.save(pelicula);
    }

    @Override
    public Pelicula update(Long producto_id, Pelicula pelicula) {
        Pelicula peliculaModificar = this.peliculaRepository.findById(producto_id).get();
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
        return this.peliculaRepository.save(peliculaModificar);
    }

    
}

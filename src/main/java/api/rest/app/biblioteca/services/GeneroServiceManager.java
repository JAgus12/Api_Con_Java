package api.rest.app.biblioteca.services;

import java.util.List;

import org.springframework.stereotype.Service;

import api.rest.app.biblioteca.excepcion.NotFoundExcepcion;
import api.rest.app.biblioteca.model.entity.Genero;
import api.rest.app.biblioteca.repositories.GeneroRepository;

@Service
public class GeneroServiceManager implements GeneroService {

    private final GeneroRepository generoRepository;


    public GeneroServiceManager(GeneroRepository generoRepository) {
        this.generoRepository = generoRepository;
    }

    @Override
    public Genero deleteById(Long id) {
        Genero generoBorrado = this.generoRepository.findById(id).orElseThrow(()->new NotFoundExcepcion("No existe ese genero"));
        this.generoRepository.deleteById(id);
        return generoBorrado;
    }

    @Override
    public List<Genero> findAll() {
        return (List<Genero>) this.generoRepository.findAll();
    }

    @Override
    public Genero findById(Long id) {
        return this.generoRepository.findById(id).orElseThrow(()->new NotFoundExcepcion("No existe este genero"));
    }

    @Override
    public Genero save(Genero genero) {
        return this.generoRepository.save(genero);
    }

    @Override
    public Genero update(Long id, Genero genero) {
        Genero generoModificar = this.generoRepository.findById(id).get();
        generoModificar.setNombre(genero.getNombre());
        return this.generoRepository.save(generoModificar);
    }

    
}

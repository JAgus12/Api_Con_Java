package api.rest.app.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.rest.app.biblioteca.model.entity.Alquiler;
import api.rest.app.biblioteca.repositories.AlquilerRepository;

@Service
public class AlquilerServiceManager implements AlquilerService {

    @Autowired
    private AlquilerRepository alquilerRepository;

    @Override
    public Alquiler deleteById(Long id) {
        Alquiler alquilerBorrado = this.alquilerRepository.findById(id).get();
        this.alquilerRepository.deleteById(id);
        return alquilerBorrado;
    }

    @Override
    public List<Alquiler> findAll() {
        return (List<Alquiler>) this.alquilerRepository.findAll();
    }

    @Override
    public Alquiler findById(Long id) {
        return this.alquilerRepository.findById(id).get();
    }

    @Override
    public Alquiler save(Alquiler alquiler) {
        return this.alquilerRepository.save(alquiler);
    }

    @Override
    public Alquiler update(Long id, Alquiler alquiler) {
        Alquiler alquilerModificar = this.alquilerRepository.findById(id).get();
        alquilerModificar.setFechaAlta(alquiler.getFechaAlta());
        alquilerModificar.setFechaFin(alquiler.getFechaFin());
        alquilerModificar.setProducto(alquiler.getProducto());
        return this.alquilerRepository.save(alquilerModificar);
    }

    
}

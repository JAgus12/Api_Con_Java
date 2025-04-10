package api.rest.app.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.rest.app.biblioteca.model.entity.Direccion;
import api.rest.app.biblioteca.repositories.DireccionRepository;

@Service
public class DireccionServiceManager implements DireccionService {

    @Autowired
    private DireccionRepository repository;

    @Override
    public Direccion deleteById(Long direccion_id) {
        Direccion direccionBorrada=this.repository.findById(direccion_id).get();
        this.repository.deleteById(direccion_id);
        return direccionBorrada;
    }

    @Override
    public List<Direccion> findAll() {
        return (List<Direccion>) this.repository.findAll();
    }

    @Override
    public Direccion findById(Long direccion_id) {
        return this.repository.findById(direccion_id).get();
    }

    @Override
    public Direccion save(Direccion direccion) {
        return this.repository.save(direccion);
    }

    @Override
    public Direccion update(Long direccion_id, Direccion direccion) {
        Direccion direccionModificar=this.repository.findById(direccion_id).get();
        direccionModificar.setCalle(direccion.getCalle());
        direccionModificar.setCcaa(direccion.getCcaa());
        direccionModificar.setCp(direccion.getCp());
        direccionModificar.setMunicipio(direccion.getMunicipio());
        direccionModificar.setNumero(direccion.getNumero());
        direccionModificar.setPais(direccion.getPais());
        direccionModificar.setProvincia(direccion.getProvincia());
        direccionModificar.setPuerta(direccion.getPuerta());
        return this.repository.save(direccionModificar);
    }


}

package api.rest.app.biblioteca.services;

import java.util.List;

import org.springframework.stereotype.Service;

import api.rest.app.biblioteca.model.entity.Direccion;
import api.rest.app.biblioteca.repositories.DireccionRepository;

@Service
public class DireccionServiceManager implements DireccionService {

    private final DireccionRepository direccionRepository;

    public DireccionServiceManager(DireccionRepository direccionRepository) {
        this.direccionRepository = direccionRepository;
    }

    
    @Override
    public Direccion deleteById(Long direccion_id) {
        Direccion direccionBorrada=this.direccionRepository.findById(direccion_id).get();
        this.direccionRepository.deleteById(direccion_id);
        return direccionBorrada;
    }

    @Override
    public List<Direccion> findAll() {
        return (List<Direccion>) this.direccionRepository.findAll();
    }

    @Override
    public Direccion findById(Long direccion_id) {
        return this.direccionRepository.findById(direccion_id).get();
    }

    @Override
    public Direccion save(Direccion direccion) {
        return this.direccionRepository.save(direccion);
    }

    @Override
    public Direccion update(Long direccion_id, Direccion direccion) {
        Direccion direccionModificar=this.direccionRepository.findById(direccion_id).get();
        direccionModificar.setCalle(direccion.getCalle());
        direccionModificar.setCcaa(direccion.getCcaa());
        direccionModificar.setCp(direccion.getCp());
        direccionModificar.setMunicipio(direccion.getMunicipio());
        direccionModificar.setNumero(direccion.getNumero());
        direccionModificar.setPais(direccion.getPais());
        direccionModificar.setProvincia(direccion.getProvincia());
        direccionModificar.setPuerta(direccion.getPuerta());
        return this.direccionRepository.save(direccionModificar);
    }


    @Override
    public Direccion buscarCasa(String calle, Integer numero, Integer cp) {
        return this.direccionRepository.findCasa(calle, numero, cp);
    }


    @Override
    public Direccion buscarPiso(String calle, Integer numero, Integer cp, String puerta) {
        return this.direccionRepository.findPiso(calle, numero, cp, puerta);
    }

    


}

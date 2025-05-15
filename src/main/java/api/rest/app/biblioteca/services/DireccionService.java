package api.rest.app.biblioteca.services;

import java.util.List;

import api.rest.app.biblioteca.model.entity.Direccion;

public interface DireccionService {

    List<Direccion> findAll();
    Direccion findById(Long direccion_id);
    Direccion save(Direccion direccion);
    Direccion deleteById(Long direccion_id);
    Direccion update(Long direccion_id,Direccion direccion);
    Direccion buscarCasa(String calle,Integer numero,Integer cp);
    Direccion buscarPiso(String calle,Integer numero,Integer cp,String puerta);
}

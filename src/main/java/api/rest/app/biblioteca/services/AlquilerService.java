package api.rest.app.biblioteca.services;

import java.util.List;

import api.rest.app.biblioteca.model.entity.Alquiler;

public interface AlquilerService {

    List<Alquiler> findAll();
    Alquiler findById(Long id);
    Alquiler save(Alquiler alquiler);
    Alquiler deleteById(Long id);
    Alquiler update(Long id,Alquiler alquiler);
    int countById(Long producto_id);
}

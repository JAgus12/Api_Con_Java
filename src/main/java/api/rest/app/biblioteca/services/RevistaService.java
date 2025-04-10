package api.rest.app.biblioteca.services;

import java.util.List;

import api.rest.app.biblioteca.model.entity.Revista;

public interface RevistaService {

    List<Revista> findAll();
    Revista findById(Long id);
    Revista save(Revista revista);
    Revista deleteById(Long id);
    Revista update(Long id,Revista revista);
}

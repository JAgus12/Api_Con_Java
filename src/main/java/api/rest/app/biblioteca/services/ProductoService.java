package api.rest.app.biblioteca.services;

import java.util.List;

import api.rest.app.biblioteca.model.entity.Producto;

public interface ProductoService {
    List<Producto> findAll();
    Producto findById(Long id);
}

package api.rest.app.biblioteca.services;

import java.util.List;

import org.springframework.stereotype.Service;

import api.rest.app.biblioteca.model.entity.Producto;
import api.rest.app.biblioteca.repositories.ProductoRepository;

@Service
public class ProductoServiceManager implements ProductoService {

    private ProductoRepository productoRepository;

    public ProductoServiceManager(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> findAll() {
        return (List<Producto>) this.productoRepository.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return this.productoRepository.findById(id).get();
    }

    
}

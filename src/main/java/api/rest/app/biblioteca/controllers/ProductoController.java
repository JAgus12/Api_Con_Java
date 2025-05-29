package api.rest.app.biblioteca.controllers;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.rest.app.biblioteca.model.entity.Producto;
import api.rest.app.biblioteca.services.ProductoServiceManager;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoServiceManager productoServiceManager;

    public ProductoController(ProductoServiceManager productoServiceManager) {
        this.productoServiceManager = productoServiceManager;
    }

    @GetMapping()
    @Transactional(readOnly = true)
    public List<Producto> findAll(){
        return this.productoServiceManager.findAll();
    }

    
}

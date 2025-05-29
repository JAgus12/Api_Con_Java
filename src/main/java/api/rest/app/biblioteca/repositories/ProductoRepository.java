package api.rest.app.biblioteca.repositories;


import org.springframework.data.repository.CrudRepository;


import api.rest.app.biblioteca.model.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto,Long> {
  
}

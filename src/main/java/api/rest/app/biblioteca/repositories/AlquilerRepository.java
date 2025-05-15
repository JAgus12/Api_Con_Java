package api.rest.app.biblioteca.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import api.rest.app.biblioteca.model.entity.Alquiler;


public interface AlquilerRepository extends CrudRepository<Alquiler,Long> {
    @Query( value = "SELECT COUNT(*) FROM Alquileres WHERE producto_id=?1",nativeQuery = true)
    int countByProductoId(Long producto_id);

    
}

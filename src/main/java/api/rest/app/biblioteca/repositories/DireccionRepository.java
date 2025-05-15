package api.rest.app.biblioteca.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import api.rest.app.biblioteca.model.entity.Direccion;

public interface DireccionRepository extends CrudRepository<Direccion,Long> {

   @Query(value = "select * from direcciones where calle like concat('%',?1,'%') and numero=?2 and cp=?3",nativeQuery = true)
   Direccion findCasa(String calle,Integer numero,Integer cp);
   @Query(value = "select * from direcciones where calle like concat('%',?1,'%') and numero=?2 and cp=?3 and puerta=?4",nativeQuery = true)
   Direccion findPiso(String calle,Integer numero,Integer cp,String puerta);

}

//select * from direcciones where calle like '%valleinclan% ' and numero like '%45%' and cp like '%28013%' and puerta is null
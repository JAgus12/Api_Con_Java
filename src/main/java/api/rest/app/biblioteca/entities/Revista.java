package api.rest.app.biblioteca.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "revistas")
public class Revista extends Producto {
    @Column(nullable = false)
    private String editorial;
    

    public Revista() {
    }



    public Revista(Long producto_id, String titulo, Integer unidades, String descripcion, String tipo,
            List<Alquiler> alquileres, String editorial) {
        super(producto_id, titulo, unidades, descripcion, tipo, alquileres);
        this.editorial = editorial;
    }



    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    
}

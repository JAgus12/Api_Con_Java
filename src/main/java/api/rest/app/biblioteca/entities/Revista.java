package api.rest.app.biblioteca.entities;



import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "revistas")
public class Revista extends Producto {
    @Column(nullable = false)
    private String editorial;
    

    public Revista() {
    }


    public Revista(String titulo, Integer unidades, String descripcion, String createdBy, String updateBy,
            Timestamp fechaAlta, Timestamp fechaModificacion, Long producto_id, String tipo, String editorial) {
        super(titulo, unidades, descripcion, createdBy, updateBy, fechaAlta, fechaModificacion, producto_id, tipo);
        this.editorial = editorial;
    }



    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    
}

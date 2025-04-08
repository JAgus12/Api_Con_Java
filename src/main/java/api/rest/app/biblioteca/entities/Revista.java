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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long revista_id;
    @Column(nullable = false)
    private String editorial;
    

    public Revista() {
    }

    public Revista(String titulo, Integer unidades, String descripcion, Timestamp fechaAlta,
            Timestamp fechaModificacion, Long revista_id, String editorial) {
        super(titulo, unidades, descripcion, fechaAlta, fechaModificacion);
        this.revista_id = revista_id;
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    public Long getRevista_id() {
        return revista_id;
    }


    public void setRevista_id(Long revista_id) {
        this.revista_id = revista_id;
    }

    
}

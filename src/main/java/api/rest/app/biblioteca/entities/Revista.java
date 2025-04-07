package api.rest.app.biblioteca.entities;

import jakarta.persistence.Entity;

@Entity
public class Revista extends Producto {

    private String editorial;

    public Revista() {
    }

    public Revista(Long id, String titulo, Integer unidades, String descripcion, String editorial) {
        super(id, titulo, unidades, descripcion);
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    
}

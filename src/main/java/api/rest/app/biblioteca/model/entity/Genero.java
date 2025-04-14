package api.rest.app.biblioteca.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "generos")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long genero_id;
    @Column(nullable = false,length = 30)
    private String nombre;
    
    public Genero() {
    }


    public Genero(Long genero_id, String nombre) {
        this.genero_id = genero_id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Long getGenero_id() {
        return genero_id;
    }


    public void setGenero_id(Long genero_id) {
        this.genero_id = genero_id;
    }

    
    


}

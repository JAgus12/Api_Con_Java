package api.rest.app.biblioteca.entities;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "peliculas")
public class Pelicula extends Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pelicula_id;
    @Column(nullable = false)
    private String director;
    @Column(nullable = false)
    private String duracion;
    @Column(nullable = false)
    private String productor;
    

    public Pelicula() {

    }

    public Pelicula(String titulo, Integer unidades, String descripcion, java.sql.Timestamp fechaAlta, Long pelicula_id,
            String director, String duracion, String productor) {
        super(titulo, unidades, descripcion, fechaAlta);
        this.pelicula_id = pelicula_id;
        this.director = director;
        this.duracion = duracion;
        this.productor = productor;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    

    

    



}

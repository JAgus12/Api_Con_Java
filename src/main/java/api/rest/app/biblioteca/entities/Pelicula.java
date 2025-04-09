package api.rest.app.biblioteca.entities;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "peliculas")
public class Pelicula extends Producto {

    @Column(nullable = false)
    private String director;
    @Column(nullable = false)
    private String duracion;
    @Column(nullable = false)
    private String productor;
    

    public Pelicula() {

    }


    public Pelicula(Long producto_id, String titulo, Integer unidades, String descripcion, String tipo,
            List<Alquiler> alquileres, String director, String duracion, String productor) {
        super(producto_id, titulo, unidades, descripcion, tipo, alquileres);
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

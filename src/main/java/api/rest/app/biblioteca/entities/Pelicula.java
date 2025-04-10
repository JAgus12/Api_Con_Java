package api.rest.app.biblioteca.entities;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "peliculas")
public class Pelicula extends Producto {

    @Column(nullable = false,length = 30)
    private String director;
    @Column(nullable = false,length = 20)
    private String duracion;
    @Column(nullable = false,length = 30)
    private String productor;
    @Column(nullable = false,length = 40)
    private String anho;
    

    public Pelicula() {

    }



    public Pelicula(Long producto_id, String titulo, Integer unidades, String descripcion, String tipo,
            List<Alquiler> alquileres, String director, String duracion, String productor, String anho) {
        super(producto_id, titulo, unidades, descripcion, tipo, alquileres);
        this.director = director;
        this.duracion = duracion;
        this.productor = productor;
        this.anho = anho;
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



    public String getAnho() {
        return anho;
    }



    public void setAnho(String anho) {
        this.anho = anho;
    }

    

    

    



}

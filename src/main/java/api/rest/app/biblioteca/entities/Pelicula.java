package api.rest.app.biblioteca.entities;

import jakarta.persistence.Entity;

@Entity
public class Pelicula extends Producto {

    private String director;
    private String duracion;
    private String productor;
    

    public Pelicula() {
    }

    public Pelicula(Long id, String titulo, Integer unidades, String descripcion, String director, String duracion,
            String productor) {
        super(id, titulo, unidades, descripcion);
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

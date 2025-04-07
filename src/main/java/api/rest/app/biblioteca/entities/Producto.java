package api.rest.app.biblioteca.entities;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Producto {

    @Id
    protected Long id;
    protected String titulo;
    protected Integer unidades;
    protected String descripcion;

    public Producto() {
    }

    public Producto(Long id, String titulo, Integer unidades, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.unidades = unidades;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    
}

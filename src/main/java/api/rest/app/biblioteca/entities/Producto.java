package api.rest.app.biblioteca.entities;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Producto {
    protected String titulo;
    protected Integer unidades;
    protected String descripcion;
    @CreationTimestamp
    protected Timestamp fechaAlta;

   
    public Producto() {
    }

    
    public Producto(String titulo, Integer unidades, String descripcion, Timestamp fechaAlta) {
        this.titulo = titulo;
        this.unidades = unidades;
        this.descripcion = descripcion;
        this.fechaAlta = fechaAlta;
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


    public Timestamp getFechaAlta() {
        return fechaAlta;
    }


    public void setFechaAlta(Timestamp fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    

    
    
}

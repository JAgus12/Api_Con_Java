package api.rest.app.biblioteca.entities;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseProducto {
    protected String titulo;
    protected Integer unidades;
    protected String descripcion;

    private String createdBy;
    private String updateBy;

    @CreationTimestamp
    @Column(updatable = false)
    protected Timestamp fechaAlta;
    @UpdateTimestamp
    protected Timestamp fechaModificacion;

   
    public BaseProducto() {
    }


    public BaseProducto(String titulo, Integer unidades, String descripcion, String createdBy, String updateBy,
            Timestamp fechaAlta, Timestamp fechaModificacion) {
        this.titulo = titulo;
        this.unidades = unidades;
        this.descripcion = descripcion;
        this.createdBy = createdBy;
        this.updateBy = updateBy;
        this.fechaAlta = fechaAlta;
        this.fechaModificacion = fechaModificacion;
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


    public Timestamp getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Timestamp fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }




    public String getCreatedBy() {
        return createdBy;
    }




    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }




    public String getUpdateBy() {
        return updateBy;
    }




    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
    
    

    
    
}

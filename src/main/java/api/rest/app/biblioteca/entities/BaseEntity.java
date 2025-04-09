package api.rest.app.biblioteca.entities;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {

    protected String createdBy;
    protected String updateBy;

    @CreationTimestamp
    @Column(updatable = false)
    protected Timestamp fechaAlta;
    @UpdateTimestamp
    protected Timestamp fechaModificacion;


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

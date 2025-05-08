package api.rest.app.biblioteca.model.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "alquileres")
public class Alquiler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alquiler_id;
    @CreationTimestamp
    private Timestamp fechaAlta;
    private Timestamp fechaFin;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    @OneToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;

    public Alquiler() {
    }

    public Alquiler(Long alquiler_id, Timestamp fechaAlta, Timestamp fechaFin) {
        this.alquiler_id = alquiler_id;
        this.fechaAlta = fechaAlta;
        this.fechaFin = fechaFin;
    }

    public Long getAlquiler_id() {
        return alquiler_id;
    }

    public void setAlquiler_id(Long alquiler_id) {
        this.alquiler_id = alquiler_id;
    }

    public Timestamp getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Timestamp fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Timestamp getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Timestamp fechaFin) {
        this.fechaFin = fechaFin;
    }

    
    @PrePersist
    public void prePersist(){
        if(fechaAlta==null){
            fechaAlta=new Timestamp(System.currentTimeMillis());
        }
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    
}

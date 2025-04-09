package api.rest.app.biblioteca.entities;

import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Producto extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long producto_id;
    protected String titulo;
    protected Integer unidades;
    protected String descripcion;

    private String tipo;
    @OneToMany(mappedBy = "producto")
    protected List<Alquiler> alquileres;


    public Producto() {
    }


    public Producto(Long producto_id, String titulo, Integer unidades, String descripcion, String tipo,
            List<Alquiler> alquileres) {
        this.producto_id = producto_id;
        this.titulo = titulo;
        this.unidades = unidades;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.alquileres = alquileres;
    }


    public Long getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Long producto_id) {
        this.producto_id = producto_id;
    }



    public String getTipo() {
        return tipo;
    }



    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public List<Alquiler> getAlquileres() {
        return alquileres;
    }


    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
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

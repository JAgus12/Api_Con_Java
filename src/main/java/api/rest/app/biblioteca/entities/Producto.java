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
public abstract class Producto extends BaseProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long producto_id;

    private String tipo;
    @OneToMany(mappedBy = "producto")
    private List<Alquiler> alquileres;


    public Producto() {
    }


    public Producto(String titulo, Integer unidades, String descripcion, String createdBy, String updateBy,
            Timestamp fechaAlta, Timestamp fechaModificacion, Long producto_id, String tipo) {
        super(titulo, unidades, descripcion, createdBy, updateBy, fechaAlta, fechaModificacion);
        this.producto_id = producto_id;
        this.tipo = tipo;
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

    

    
}

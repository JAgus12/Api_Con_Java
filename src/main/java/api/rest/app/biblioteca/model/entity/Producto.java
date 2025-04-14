package api.rest.app.biblioteca.model.entity;


import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Producto extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long producto_id;
    @Column(nullable = false,length = 40)
    protected String titulo;
    @Column(nullable = false,length = 15)
    protected Integer unidades;
    @Column(length = 60)
    protected String descripcion;

    @Column(nullable = false)
    private String tipo;

    @ManyToAny
    @JoinTable(
        name = "producto_genero",
        joinColumns = @JoinColumn(name = "producto_id"),
        inverseJoinColumns = @JoinColumn(name = "genero_id")
    )
    private List<Genero> generos;


    public Producto() {
    }


    public Producto(Long producto_id, String titulo, Integer unidades, String descripcion, String tipo) {
        this.producto_id = producto_id;
        this.titulo = titulo;
        this.unidades = unidades;
        this.descripcion = descripcion;
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

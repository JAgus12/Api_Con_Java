package api.rest.app.biblioteca.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "libros")
public class Libro extends Producto {
    private String isbn;
    @Column(nullable = false,length = 50)
    private String autor;
    @Column(nullable = false,length = 30)
    private String editorial;
    
    public Libro() {
    }



    public Libro(Long producto_id, String titulo, Integer unidades, String descripcion, String tipo, String isbn,
            String autor, String editorial) {
        super(producto_id, titulo, unidades, descripcion, tipo);
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }



    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    
    

    

    

    

    
}

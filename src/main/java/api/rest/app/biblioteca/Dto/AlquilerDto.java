package api.rest.app.biblioteca.Dto;

public class AlquilerDto {
    private Long productoId;
    private String usuario;

    public AlquilerDto(Long productoId, String usuario) {
        this.productoId = productoId;
        this.usuario = usuario;
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    
}

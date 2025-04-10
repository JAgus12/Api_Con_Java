package api.rest.app.biblioteca.excepcion;


public class NotFoundExcepcion extends RuntimeException {
   
    private final String mensaje;

    public NotFoundExcepcion(String mensaje){
        super(mensaje);
        this.mensaje=mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}

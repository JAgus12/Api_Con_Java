package api.rest.app.biblioteca.Jwt.model;

import java.sql.Timestamp;
import java.time.LocalDate;

import api.rest.app.biblioteca.model.entity.Direccion;

public class RegisterRequest {

    private String usuario;
    private String password;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    private String telefono;
    private LocalDate fechaNacimiento;
    private Direccion direccion;
    
    
    public RegisterRequest() {
    }


    


    public RegisterRequest(String usuario, String password, String nombre, String apellido1, String apellido2,
            String email, String telefono, LocalDate fechaNacimiento, Direccion direccion) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }





    public String getUsuario() {
        return usuario;
    }


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido1() {
        return apellido1;
    }


    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }


    public String getApellido2() {
        return apellido2;
    }


    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public Direccion getDireccion() {
        return direccion;
    }


    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    

    
    

    
}

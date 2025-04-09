package api.rest.app.biblioteca.entities;

import java.sql.Timestamp;
import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    private String usuario;
    @Column(nullable = false)
    @Size(min = 8,message = "La contraseña debe tener minimo 8 caracteres")
    private String password;
    @Column(nullable = false,length = 55)
    private String nombre;
    @Column(nullable = false, length = 65)
    private String apellido1;
    @Column(nullable = false,length = 65)
    private String apellido2;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false,length = 9)
    private String telefono;
    @Column(nullable = false)
    private LocalDate fechaNacimiento;
    @Column(nullable = false)
    @CreationTimestamp
    private Timestamp fechaAlta;
    private String rol="usuario";
    private boolean activo=true;

    @ManyToOne
    @JoinColumn(name = "direccion_id")
    private Direccion direccion;

    @OneToOne(mappedBy = "usuario")
    private Alquiler alquiler;

    public Usuario() {
    }

    public Usuario(String usuario, String contraseña, String nombre, String apellido1, String apellido2, String email,
            String telefono, LocalDate fechaNacimiento, Timestamp fechaAlta, String rol, boolean activo) {
        this.usuario = usuario;
        this.password = contraseña;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaAlta = fechaAlta;
        this.rol = rol;
        this.activo = activo;
    }


    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
    public Timestamp getFechaAlta() {
        return fechaAlta;
    }
    public void setFechaAlta(Timestamp fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    public boolean getActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

        
    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    
}

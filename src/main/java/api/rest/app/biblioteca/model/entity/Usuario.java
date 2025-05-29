package api.rest.app.biblioteca.model.entity;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "usuarios")
public class Usuario implements UserDetails {

    @Id
    private String usuario;
    @Column(nullable = false)
    @Size(min = 8,message = "La contraseña debe tener minimo 8 caracteres")
    @JsonIgnore
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
    @Enumerated(EnumType.STRING)
    private Rol rol;
    private boolean activo=true;

    @ManyToOne
    @JoinColumn(name = "direccion_id")
    private Direccion direccion;


    public Usuario() {
    }

    public Usuario(String usuario,
            @Size(min = 8, message = "La contraseña debe tener minimo 8 caracteres") String password, String nombre,
            String apellido1, String apellido2, String email, String telefono, LocalDate fechaNacimiento,
            Timestamp fechaAlta, Rol rol, boolean activo, Direccion direccion) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaAlta = fechaAlta;
        this.rol = rol;
        this.activo = activo;
        this.direccion = direccion;
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

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_"+rol.name()));
    }

    @Override
    public String getUsername() {
        return this.usuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }


    @Override
    public boolean isEnabled() {
        return this.activo;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }


    

    

    

    
}

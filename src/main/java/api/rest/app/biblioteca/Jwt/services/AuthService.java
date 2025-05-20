package api.rest.app.biblioteca.Jwt.services;

import java.sql.Timestamp;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import api.rest.app.biblioteca.Jwt.model.AuthResponse;
import api.rest.app.biblioteca.Jwt.model.LoginRequest;
import api.rest.app.biblioteca.Jwt.model.RegisterRequest;
import api.rest.app.biblioteca.excepcion.NotFoundExcepcion;
import api.rest.app.biblioteca.model.entity.Direccion;
import api.rest.app.biblioteca.model.entity.Rol;
import api.rest.app.biblioteca.model.entity.Usuario;
import api.rest.app.biblioteca.repositories.DireccionRepository;
import api.rest.app.biblioteca.repositories.UsuarioRepository;

@Service
public class AuthService {

    private final UsuarioRepository usuarioRepository;
    private final DireccionRepository direccionRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    
    public AuthService(UsuarioRepository usuarioRepository, DireccionRepository direccionRepository,
            JwtService jwtService, PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager) {
        this.usuarioRepository = usuarioRepository;
        this.direccionRepository = direccionRepository;
        this.jwtService = jwtService;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
    }

    public AuthResponse login(LoginRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsuario(), request.getPassword()));
        //UserDetails user=usuarioRepository.findById(request.getUsuario());
        Usuario user=usuarioRepository.findById(request.getUsuario()).get();
        return new AuthResponse(jwtService.getToken(user));

    }

    public AuthResponse register(RegisterRequest request) {
        Usuario user = new Usuario();
        user.setUsuario(request.getUsuario());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setNombre(request.getNombre());
        user.setApellido1(request.getApellido1());
        user.setApellido2(request.getApellido2());
        user.setEmail(request.getEmail());
        user.setActivo(true);
        user.setFechaNacimiento(request.getFechaNacimiento());
        user.setRol(Rol.USER);
        user.setTelefono(request.getTelefono());
        user.setFechaAlta(new Timestamp(System.currentTimeMillis()));
        // Direccion direccion;
        // if (request.getDireccion().getPuerta() == null) {
        //     direccion = this.direccionRepository.findCasa(request.getDireccion().getCalle(),
        //             request.getDireccion().getNumero(), request.getDireccion().getCp());
        // } else {
        //     direccion = this.direccionRepository.findPiso(request.getDireccion().getCalle(),
        //             request.getDireccion().getNumero(), request.getDireccion().getCp(),
        //             request.getDireccion().getPuerta());
        // }

        // if (direccion == null) {

        // }

        this.usuarioRepository.save(user);
        System.out.println(user.getUsername());
        return new AuthResponse(jwtService.getToken(user));
    }

}

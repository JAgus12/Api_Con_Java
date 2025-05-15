package api.rest.app.biblioteca.Jwt.services;

import java.sql.Timestamp;

import org.springframework.stereotype.Service;

import api.rest.app.biblioteca.Jwt.model.AuthResponse;
import api.rest.app.biblioteca.Jwt.model.LoginRequest;
import api.rest.app.biblioteca.Jwt.model.RegisterRequest;
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

    public AuthService(UsuarioRepository usuarioRepository, DireccionRepository direccionRepository,
            JwtService jwtService) {
        this.usuarioRepository = usuarioRepository;
        this.direccionRepository = null;
        this.jwtService = jwtService;
    }

    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public AuthResponse register(RegisterRequest request) {
        Usuario user = new Usuario();
        user.setUsuario(request.getUsuario());
        user.setPassword(request.getPassword());
        user.setNombre(request.getNombre());
        user.setApellido1(request.getApellido1());
        user.setApellido2(request.getApellido2());
        user.setEmail(request.getEmail());
        user.setActivo(true);
        user.setFechaNacimiento(request.getFechaNacimiento());
        user.setRol(Rol.USER);
        user.setTelefono(request.getTelefono());
        user.setFechaAlta(new Timestamp(System.currentTimeMillis()));;
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
        return new AuthResponse(jwtService.getToken(user));
    }

}

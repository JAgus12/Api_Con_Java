package api.rest.app.biblioteca.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Service;

import api.rest.app.biblioteca.Dto.AlquilerDto;
import api.rest.app.biblioteca.model.entity.Alquiler;
import api.rest.app.biblioteca.model.entity.Producto;
import api.rest.app.biblioteca.model.entity.Usuario;
import api.rest.app.biblioteca.repositories.AlquilerRepository;
import api.rest.app.biblioteca.repositories.ProductoRepository;
import api.rest.app.biblioteca.repositories.UsuarioRepository;

@Service
public class AlquilerServiceManager implements AlquilerService {

    private AlquilerRepository alquilerRepository;
    private ProductoRepository productoRepository;
    private UsuarioRepository usuarioRepository;

    
    public AlquilerServiceManager(AlquilerRepository alquilerRepository, ProductoRepository productoRepository,
            UsuarioRepository usuarioRepository) {
        this.alquilerRepository = alquilerRepository;
        this.productoRepository = productoRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Alquiler deleteById(Long id) {
        Alquiler alquilerBorrado = this.alquilerRepository.findById(id).get();
        this.alquilerRepository.deleteById(id);
        return alquilerBorrado;
    }

    @Override
    public List<Alquiler> findAll() {
        return (List<Alquiler>) this.alquilerRepository.findAll();
    }

    @Override
    public Alquiler findById(Long id) {
        return this.alquilerRepository.findById(id).get();
    }

    @Override
    public Alquiler save(AlquilerDto alquiler) {
        Producto producto=this.productoRepository.findById(alquiler.getProductoId()).get();
        Usuario usuario=this.usuarioRepository.findById(alquiler.getUsuario()).get();
        Alquiler newAlquiler=new Alquiler();
        newAlquiler.setProducto(producto);
        newAlquiler.setUsuario(usuario);
        newAlquiler.setFechaAlta(new Timestamp(System.currentTimeMillis()));
        newAlquiler.setFechaFin(newAlquiler.getFechaAlta());
        return this.alquilerRepository.save(newAlquiler);
    }

    @Override
    public Alquiler update(Long id, Alquiler alquiler) {
        Alquiler alquilerModificar = this.alquilerRepository.findById(id).get();
        alquilerModificar.setFechaAlta(alquiler.getFechaAlta());
        alquilerModificar.setFechaFin(alquiler.getFechaFin());
        alquilerModificar.setProducto(alquiler.getProducto());
        return this.alquilerRepository.save(alquilerModificar);
    }

    @Override
    public int countById(Long producto_id) {
        return this.alquilerRepository.countByProductoId(producto_id);
    }

    

   

    
}

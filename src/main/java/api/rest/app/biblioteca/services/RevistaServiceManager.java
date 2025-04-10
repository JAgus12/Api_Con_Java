package api.rest.app.biblioteca.services;

import java.sql.Timestamp;
import java.util.List;


import org.springframework.stereotype.Service;

import api.rest.app.biblioteca.model.entity.Revista;
import api.rest.app.biblioteca.repositories.RevistaRepository;

@Service
public class RevistaServiceManager implements RevistaService {

    private final RevistaRepository repository;


    public RevistaServiceManager(RevistaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Revista deleteById(Long id) {
        Revista revistaBorrada = this.repository.findById(id).get();
        this.repository.deleteById(id);
        return revistaBorrada;
    }

    @Override
    public List<Revista> findAll() {
        return (List<Revista>) this.repository.findAll();
    }

    @Override
    public Revista findById(Long id) {
        return this.repository.findById(id).get();
    }

    @Override
    public Revista save(Revista revista) {
        return this.repository.save(revista);
    }

    @Override
    public Revista update(Long id, Revista revista) {
        Revista revistaModificar = this.repository.findById(id).get();
        revistaModificar.setCreatedBy(revista.getCreatedBy());
        revistaModificar.setDescripcion(revista.getDescripcion());
        revistaModificar.setEditorial(revista.getEditorial());
        revistaModificar.setFechaAlta(revista.getFechaAlta());
        revistaModificar.setFechaModificacion(new Timestamp(System.currentTimeMillis()));
        revistaModificar.setTipo(revista.getTipo());
        revistaModificar.setTitulo(revista.getTitulo());
        revistaModificar.setUnidades(revista.getUnidades());
        revistaModificar.setUpdateBy(revista.getUpdateBy());
        return this.repository.save(revistaModificar);
    }

    
}

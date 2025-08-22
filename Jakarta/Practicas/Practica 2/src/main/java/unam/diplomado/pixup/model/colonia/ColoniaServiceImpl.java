package unam.diplomado.pixup.model.colonia;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.Optional;

@Stateless
public class ColoniaServiceImpl implements ColoniaService {

    @Inject
    private ColoniaRepository coloniaRepository;

    //TODO repository layers (municipio)

    @Override
    public Colonia obtenerColoniaPoId(Integer id) {
        Optional<Colonia> colonia = coloniaRepository.findById(id);
        if (colonia.isPresent()) {
            return colonia.get();
        }
        //TODO ColoniaNotFoundException
        throw new RuntimeException();
    }

    @Override
    public Colonia crearColonia(Colonia colonia) {
        return coloniaRepository.saveOrUpdate(colonia);
    }

    @Override
    public Colonia actualizarColonia(Colonia colonia) {
        return coloniaRepository.saveOrUpdate(colonia);
    }

    @Override
    public void eliminarColoniaPorId(Integer id) {
        coloniaRepository.findById(id).ifPresent(colonia -> {
            coloniaRepository.delete(colonia);
        });

    }


}

package unam.diplomado.pixup.model.colonia;

import jakarta.inject.Inject;
import unam.diplomado.pixup.model.colonia.ColoniaRepository;

import java.util.Collection;
import java.util.Optional;

public class ColoniaResource implements ColoniaApi {

    @Inject
    private ColoniaRepository coloniaRepository;

    @Override
    public Colonia getColoniaById(Integer id) {
        Optional<Colonia> colonia = coloniaRepository.findById(id);
        return colonia.orElse(null);

    }

    @Override
    public Collection<Colonia> getColoniasByCp(String cp) {
        return coloniaRepository.findByCp(cp);
    }


}

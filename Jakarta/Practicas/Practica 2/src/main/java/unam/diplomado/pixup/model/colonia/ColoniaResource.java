package unam.diplomado.pixup.model.colonia;

import jakarta.inject.Inject;


import java.util.Collection;
import java.util.Optional;
import jakarta.ws.rs.core.Response;

public class ColoniaResource implements ColoniaApi {

    @Inject
    private ColoniaRepository coloniaRepository;

    @Override
    public Response getColoniaById(Integer id) {
        Optional<Colonia> colonia = coloniaRepository.findById(id);
        if (colonia.isPresent()) {
            return Response
                    .status(Response.Status.OK)
                    .entity(colonia.get())
                    .build();
        }

        return Response
                .status(Response.Status.NOT_FOUND)
                .entity(null)
                .build();
    }

    @Override
    public Collection<Colonia> getColoniasByCp(String cp) {
        return coloniaRepository.findByCp(cp);
    }


}

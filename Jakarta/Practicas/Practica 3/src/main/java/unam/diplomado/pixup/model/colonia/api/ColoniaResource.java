package unam.diplomado.pixup.model.colonia.api;

import jakarta.inject.Inject;


import java.util.Collection;
import java.util.Optional;
import jakarta.ws.rs.core.Response;
import unam.diplomado.pixup.model.colonia.Colonia;
import unam.diplomado.pixup.model.colonia.ColoniaRepository;
import unam.diplomado.pixup.model.colonia.ColoniaService;

public class ColoniaResource implements ColoniaApi {

    @Inject
    private ColoniaRepository coloniaRepository;

    @Inject
    private ColoniaService coloniaService;

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

    @Override
    public Response deleteColoniaById(Integer id) {
        Optional<Colonia> colonia = coloniaRepository.findById(id);
        if (colonia.isPresent()) {
            coloniaRepository.delete(colonia.get());
            return Response.ok().build();

        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @Override
    public Response createColonia(Colonia colonia) {
        try {
        Colonia coloniaCreada = coloniaService.crearColonia(colonia);
        return Response
                .status(Response.Status.CREATED)
                .entity(coloniaCreada)
                .build();
    } catch (Exception e) {
        if (e.getCause() != null) {
            return Response
                    .status(Response.Status.CONFLICT)
                    .entity(e.getCause().getMessage())
                    .build();
        }   return Response
                    .status(Response.Status.PRECONDITION_REQUIRED)
                    .entity(e.getCause().getMessage())
                    .build();
    }}

    @Override
    public Response updateColonia(Integer id, Colonia colonia) {
        Optional<Colonia> coloniaActualizada = coloniaRepository.findById(id);
        if (coloniaActualizada.isPresent()) {
            coloniaService.actualizarColonia(colonia);
            return Response.ok().build();

        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}




package unam.diplomado.pixup.model.disco.api;

import jakarta.inject.Inject;

import jakarta.ws.rs.core.Response;

import unam.diplomado.pixup.model.disco.Disco;
import unam.diplomado.pixup.model.disco.DiscoService;

public class DiscoResource implements DiscoApi {

    @Inject
    private DiscoService discoService;

    @Override
    public Response altaDisco(Disco disco) {
        try {
            discoService.registrarDisco(disco);
            return Response
                    .status(Response.Status.CREATED)
                    .entity(disco)
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
        }
    }
}



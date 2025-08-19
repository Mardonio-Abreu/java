package unam.diplomado.pixup.model.disco.api;

import jakarta.inject.Inject;

import jakarta.ws.rs.core.Response;

import unam.diplomado.pixup.model.disco.Disco;
import unam.diplomado.pixup.model.disco.api.dto.DiscoRequestDTO;
import unam.diplomado.pixup.model.disco.api.dto.DiscoResponseDTO;
import unam.diplomado.pixup.model.disco.DiscoService;
import unam.diplomado.pixup.model.disco.api.dto.DiscoMapper;

public class DiscoResource implements DiscoApi {

    @Inject
    private DiscoService discoService;
    @Inject
    private DiscoMapper discoMapper;


    @Override
    public Response altaDisco(DiscoRequestDTO discoRequestDTO) {
        Disco discToSave = discoMapper.toEntity(discoRequestDTO);
        Disco discSaved = discoService.registrarDisco(discToSave);
        DiscoResponseDTO discoResponseDTO = discoMapper.toDiscoResponseDTO(discSaved);

        return Response
                .status(Response.Status.CREATED)
                .entity(discoResponseDTO)
                .build();
    }
}



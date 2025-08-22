package unam.diplomado.pixup.model.colonia.api;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import unam.diplomado.pixup.model.colonia.Colonia;

import java.util.Collection;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("colonias")
public interface ColoniaApi {

    @GET
    @Path("{id}")
    Response getColoniaById(@PathParam("id") Integer id);

    @GET
    Collection<Colonia> getColoniasByCp(
            @NotBlank @QueryParam("cp") String cp);

    @DELETE
    @Path("{id}")
    Response deleteColoniaById(@PathParam("id") Integer id);

    @POST
    Response createColonia(@NotNull @Valid Colonia colonia);

    @PUT
    @Path("{id}")
    Response updateColonia(@PathParam("id") Integer id, @NotNull @Valid Colonia colonia);

}



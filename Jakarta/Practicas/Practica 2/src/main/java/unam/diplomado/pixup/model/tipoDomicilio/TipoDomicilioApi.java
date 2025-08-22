package unam.diplomado.pixup.model.tipoDomicilio;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import unam.diplomado.pixup.model.TipoDomicilio;

import java.util.Collection;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("tiposDomicilio")
public interface TipoDomicilioApi {
    @GET
    Collection<TipoDomicilio> getAll();
}

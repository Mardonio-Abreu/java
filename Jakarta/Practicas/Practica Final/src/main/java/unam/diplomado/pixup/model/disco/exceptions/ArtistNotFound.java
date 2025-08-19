package unam.diplomado.pixup.model.disco.exceptions;



public class ArtistNotFound extends RuntimeException {

    public ArtistNotFound(Integer id) {
        super("ID no encontrado" + id);
    }

}

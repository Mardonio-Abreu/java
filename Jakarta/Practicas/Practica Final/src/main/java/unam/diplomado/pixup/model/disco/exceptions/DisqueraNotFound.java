package unam.diplomado.pixup.model.disco.exceptions;

public class DisqueraNotFound extends RuntimeException {

    public DisqueraNotFound(Integer id) {
        super("Disquera no existe ");
    }

}
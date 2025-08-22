package unam.diplomado.pixup.model.disco.exceptions;

public class GeneroMusicalNotFound extends RuntimeException {

    public GeneroMusicalNotFound(Integer id) {
        super("Genero musical inexistente");
    }

}
package unam.diplomado.pixup.model.disco.exceptions;

public class DiscAlreadyExists extends RuntimeException {

    public DiscAlreadyExists(String title) {
        super("Disco ya existe " + title);
    }

}

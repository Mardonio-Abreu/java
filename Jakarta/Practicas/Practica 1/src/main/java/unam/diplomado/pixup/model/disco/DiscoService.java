package unam.diplomado.pixup.model.disco;

import jakarta.ejb.Local;

@Local
public interface DiscoService {
    Disco registrarDisco(Disco disco);
}

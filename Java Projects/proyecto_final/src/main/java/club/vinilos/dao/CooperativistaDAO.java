package club.vinilos.dao;

import club.vinilos.model.Cooperativista;
import java.util.List;

public interface CooperativistaDAO {
    Cooperativista getCooperativistaById(int id);
    List<Cooperativista> getAllCooperativistas();
    void addCooperativista(Cooperativista cooperativista);
    void updateCooperativista(Cooperativista cooperativista, int id);
    void deleteCooperativista(int id);
}

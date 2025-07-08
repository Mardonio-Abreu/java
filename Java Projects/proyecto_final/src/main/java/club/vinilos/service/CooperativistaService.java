package club.vinilos.service;

import club.vinilos.model.Cooperativista;

import java.util.List;

public interface CooperativistaService {
    Cooperativista findCooperativistaById(int id);
    List<Cooperativista> findAllCooperativistas();
    void saveCooperativista(Cooperativista cooperativista);
    void deleteCooperativistaById(int id);
    void updateCooperativistaById(Cooperativista cooperativista, int id);
}

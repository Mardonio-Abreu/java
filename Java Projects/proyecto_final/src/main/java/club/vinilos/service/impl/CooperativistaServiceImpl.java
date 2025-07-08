package club.vinilos.service.impl;

import club.vinilos.model.Cooperativista;
import club.vinilos.dao.CooperativistaDAO;
import club.vinilos.dao.impl.CooperativistaDAOImpl;
import club.vinilos.service.CooperativistaService;

import java.util.List;

public class CooperativistaServiceImpl implements CooperativistaService {

    private static CooperativistaServiceImpl instance;
    private static final CooperativistaDAO cooperativistaDAO = CooperativistaDAOImpl.getInstance();

    private CooperativistaServiceImpl() {}

    public static CooperativistaServiceImpl getInstance() {
        if (instance == null) {
            instance = new CooperativistaServiceImpl();
        }
        return instance;
    }

    public Cooperativista findCooperativistaById(int id) {
        return cooperativistaDAO.getCooperativistaById(id);
    }

    public List<Cooperativista> findAllCooperativistas() {
        return cooperativistaDAO.getAllCooperativistas();
    }

    public void saveCooperativista(Cooperativista cooperativista) {
        cooperativistaDAO.addCooperativista(cooperativista);
    }

    public void deleteCooperativistaById(int id) {
        cooperativistaDAO.deleteCooperativista(id);
    }

    public void updateCooperativistaById(Cooperativista cooperativista, int id) {
        cooperativistaDAO.updateCooperativista(cooperativista, id);
    }


}

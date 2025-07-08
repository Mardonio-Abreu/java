package club.vinilos.dao.impl;

import club.vinilos.hibernate.HibernateUtil;
import club.vinilos.model.Cooperativista;
import club.vinilos.dao.CooperativistaDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class CooperativistaDAOImpl implements CooperativistaDAO {

    private static CooperativistaDAOImpl instance;

    private CooperativistaDAOImpl() {
    }

    public static CooperativistaDAOImpl getInstance() {
        if (instance == null) {
            instance = new CooperativistaDAOImpl();
        }
        return instance;
    }

    @Override
    public Cooperativista getCooperativistaById(int id) {
        Cooperativista cooperativista = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            cooperativista = session.find(Cooperativista.class, id);
        } catch (Exception e) {
            e.printStackTrace(); // Replace with logger in production
        }
        return cooperativista;
    }

    @Override
    public List<Cooperativista> getAllCooperativistas() {
        List<Cooperativista> cooperativistaList = new ArrayList<>();
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Cooperativista> query = session.createQuery("FROM Cooperativista", Cooperativista.class);
            cooperativistaList = query.list();
        } catch (Exception e) {
            e.printStackTrace(); // Replace with logger in production
        }
        return cooperativistaList;
    }

    @Override
    public void addCooperativista(Cooperativista cooperativista) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(cooperativista);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace(); // Replace with logger
        }
    }

    @Override
    public void updateCooperativista(Cooperativista cooperativista, int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Cooperativista oldCooperativista = session.find(Cooperativista.class, id);
            if (oldCooperativista != null) {
                oldCooperativista.setNombre(cooperativista.getNombre());
                oldCooperativista.setNumeroCooperativista(cooperativista.getNumeroCooperativista());
                oldCooperativista.setApellidoPaterno(cooperativista.getApellidoPaterno());
                oldCooperativista.setApellidoMaterno(cooperativista.getApellidoMaterno());
                oldCooperativista.setCorreoElectronico(cooperativista.getCorreoElectronico());
                oldCooperativista.setTelefono(cooperativista.getTelefono());
                // Add more fields as needed
                transaction.commit();
            } else {
                System.out.println("Cooperativista with ID " + id + " not found.");
            }
        } catch (Exception e) {
            e.printStackTrace(); // Replace with logger
        }
    }

    @Override
    public void deleteCooperativista(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Cooperativista cooperativista = session.find(Cooperativista.class, id);
            if (cooperativista != null) {
                session.remove(cooperativista);
                transaction.commit();
            } else {
                System.out.println("Cooperativista with ID " + id + " not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

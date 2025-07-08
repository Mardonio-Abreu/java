package club.vinilos.dao.impl;

import club.vinilos.hibernate.HibernateUtil;
import club.vinilos.model.Inventario;
import club.vinilos.dao.InventarioDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;


public class InventarioDAOImpl implements InventarioDAO {

    private static InventarioDAOImpl instance;

    private InventarioDAOImpl() {
    }

    public static InventarioDAOImpl getInstance() {
        if (instance == null)
            instance = new InventarioDAOImpl();
        return instance;
    }

    public Inventario getInventarioById(int id) {
        Inventario inventario = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            inventario = session.find(Inventario.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return inventario;
    }

    public List<Inventario> getAllInventarios() {
        List<Inventario> inventarioList = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Inventario> query = session.createQuery("FROM Inventario", Inventario.class);
            inventarioList = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return inventarioList;
    }

    public void addInventario(Inventario inventario) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(inventario);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateInventario(Inventario inventario, int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Inventario oldInventario = new Inventario();
            oldInventario = session.find(Inventario.class, id);
            if (oldInventario != null) {
                // Update fields one by one

                oldInventario.setNumeroInventario(inventario.getNumeroInventario());
                oldInventario.setNumeroArticulo(inventario.getNumeroArticulo());
                oldInventario.setArticulosDisponibles(inventario.getArticulosDisponibles());
                // etc. (don't set the ID again)
                // Uso la AI para entender mejor y mejorar el código
                // No need to call merge here; Hibernate will track changes
            } else {
                System.out.println("Inventario with ID " + id + " not found.");
            }
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public void deleteInventario(int id) {
        Inventario inventario = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            inventario = session.find(Inventario.class, id);
            if (inventario != null) {
                session.remove(inventario); // proper way to delete
            } else {
                System.out.println("Inventario with ID " + id + " not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

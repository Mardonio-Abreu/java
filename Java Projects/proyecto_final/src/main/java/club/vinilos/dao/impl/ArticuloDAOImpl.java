package club.vinilos.dao.impl;

import club.vinilos.hibernate.HibernateUtil;
import club.vinilos.model.Articulo;
import club.vinilos.dao.ArticuloDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class ArticuloDAOImpl implements ArticuloDAO {

    private static ArticuloDAOImpl instance;

    private ArticuloDAOImpl() {
    }

    public static ArticuloDAOImpl getInstance() {
        if (instance == null) {
            instance = new ArticuloDAOImpl();
        }
        return instance;
    }

    @Override
    public Articulo getArticuloById(int id) {
        Articulo articulo = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            articulo = session.find(Articulo.class, id);
        } catch (Exception e) {
            e.printStackTrace(); // Use a logger in production
        }
        return articulo;
    }

    @Override
    public List<Articulo> getAllArticulos() {
        List<Articulo> articuloList = new ArrayList<>();
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Articulo> query = session.createQuery("FROM Articulo", Articulo.class);
            articuloList = query.list();
        } catch (Exception e) {
            e.printStackTrace(); // Use a logger in production
        }
        return articuloList;
    }

    @Override
    public void addArticulo(Articulo articulo) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(articulo);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace(); // Use a logger in production
        }
    }

    @Override
    public void updateArticulo(Articulo articulo, int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Articulo oldArticulo = session.find(Articulo.class, id);
            if (oldArticulo != null) {
                oldArticulo.setNumeroCooperativista(articulo.getNumeroCooperativista());
                oldArticulo.setCategoria(articulo.getCategoria());
                oldArticulo.setNombre(articulo.getNombre());
                oldArticulo.setDescripcion(articulo.getDescripcion());
                oldArticulo.setFotografias(articulo.getFotografias());
                oldArticulo.setPrecio(articulo.getPrecio());
                transaction.commit(); // Ensure transaction is committed
            } else {
                System.out.println("Articulo with ID " + id + " not found.");
            }
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace(); // Use a logger in production
        }
    }

    @Override
    public void deleteArticulo(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Articulo articulo = session.find(Articulo.class, id);
            if (articulo != null) {
                session.remove(articulo);
                transaction.commit();
            } else {
                System.out.println("Articulo with ID " + id + " not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

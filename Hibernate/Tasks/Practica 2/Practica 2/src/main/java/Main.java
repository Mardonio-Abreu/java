
import model.Tabla;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;


public class Main {
    private SessionFactory sessionFactory;
    private StandardServiceRegistry serviceRegistry;

    public static void main(String[] args) {
        Main app = new Main();
        app.initializeHibernate();
        app.displayRecords();
    }


    private void displayRecords() {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            List<Tabla> records = session.createQuery("FROM Tabla", Tabla.class).getResultList();

            if (records.isEmpty()) {
                System.out.println("No se encontraron registros.");
            } else {
                System.out.println("--- Registros encontrados ---");
                for (Tabla record : records) {
                    System.out.println("Dato: " + record.getNombre());
                }
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer los registros.");
            e.printStackTrace();
            StandardServiceRegistryBuilder.destroy(serviceRegistry);
        }
    }

    private void initializeHibernate() {
        serviceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();

        try {
            sessionFactory = new MetadataSources(serviceRegistry)
                    .buildMetadata()
                    .buildSessionFactory();
        } catch (Exception e) {
            System.out.println("Error al inicializar Hibernate.");
            e.printStackTrace();
            StandardServiceRegistryBuilder.destroy(serviceRegistry);
        }
    }
}

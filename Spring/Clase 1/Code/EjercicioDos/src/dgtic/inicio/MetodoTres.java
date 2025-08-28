package dgtic.inicio;

import dgtic.modelo.*;

public class MetodoTres {
    public static void main(String[] args) {

        Profesor profesor = new Profesor();
        profesor.setNombre("Pedro");

        ExplicaClases explicaClases = new ExplicaClases();
        Calificar califica = new Calificar();

        Reportes reporta = new Reportes();

        profesor.getResponsabilidad().add(explicaClases);
        profesor.getResponsabilidad().add(califica);
        profesor.getResponsabilidad().add(reporta);

        System.out.println(profesor.getNombre());

        for (Responsabilidades responsabilidadi : profesor.getResponsabilidad()) {
            System.out.println("---");
            responsabilidadi.realizar();
        }
    }
}

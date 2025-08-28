package dgtic.modelo;

import java.util.ArrayList;

public class Profesor {
    private String nombre;
    private ArrayList<Responsabilidades> responsabilidad = new ArrayList<>();

    public Profesor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Responsabilidades> getResponsabilidad() {
        return responsabilidad;
    }

    public void setResponsabilidad(ArrayList<Responsabilidades> responsabilidad) {
        this.responsabilidad = responsabilidad;
    }
}

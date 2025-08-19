package dgtic.core.model;

import dgtic.core.exception.CreditosMenores;

import java.util.Objects;


public class Materia {
    private String nombre;
    private Integer creditos;

    public Materia(String nombre, Integer creditos) {
        super();
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        if (creditos < 0) {
            throw new CreditosMenores("No creditos negativos");
        } else {
            this.creditos = creditos;
        }

    }

    @Override
    public String toString() {
        return "Materia [nombre=" + nombre + ", creditos=" + creditos + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Materia materia = (Materia) o;
        return Objects.equals(getNombre(), materia.getNombre()) && Objects.equals(getCreditos(), materia.getCreditos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getCreditos());
    }
}


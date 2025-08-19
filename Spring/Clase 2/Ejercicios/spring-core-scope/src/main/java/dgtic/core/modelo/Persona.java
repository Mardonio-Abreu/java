package dgtic.core.modelo;

public class Persona {
    private String nombre;
    private FabricaCoches coches;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public FabricaCoches getCoche() {
        return coches;
    }

    public void setCoche(FabricaCoches coches) {
        this.coches = coches;
    }
}
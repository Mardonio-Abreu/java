public class Departamento extends Inmueble {
    private int piso;
    private boolean elevador;
    private boolean seguridad;

    public Departamento(int userID, String direccion, int precio, String color, int piso, boolean elevador, boolean seguridad) {
        super(userID, direccion, precio, color);
        this.piso = piso;
        this.elevador = elevador;
        this.seguridad = seguridad;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public boolean isElevador() {
        return elevador;
    }

    public void setElevador(boolean elevador) {
        this.elevador = elevador;
    }

    public boolean isSeguridad() {
        return seguridad;
    }

    public void setSeguridad(boolean seguridad) {
        this.seguridad = seguridad;
    }

    @Override
    public String toString() {
        return "Departamento {" +
                "piso=" + piso +
                ", elevador=" + elevador +
                ", seguridad=" + seguridad +
                "} " + super.toString();
    }


}

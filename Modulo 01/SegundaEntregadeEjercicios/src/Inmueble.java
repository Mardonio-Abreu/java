import java.util.Objects;

public class Inmueble {

    private int userID;
    private String direccion;
    private int precio;
    private String color;

    public Inmueble (int userID, String direccion, int precio, String color) {
        this.userID = userID;
        this.direccion = direccion;
        this.precio = precio;
        this.color = color;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "userID=" + userID +
                ", direccion='" + direccion + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Inmueble inmueble = (Inmueble) o;
        return getUserID() == inmueble.getUserID() && Objects.equals(getDireccion(), inmueble.getDireccion());
    }

    public String isVendida(boolean vendida) {
        this.setUserID(0);
        this.setPrecio(0);
        this.setDireccion("Vendida " + this.getDireccion());
        return "Inmueble vendido";
    }

}


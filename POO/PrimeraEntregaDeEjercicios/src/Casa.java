public class Casa {
    int id;
    String direccion;
    String status;
    String precio;
    String color;
    boolean limpia;

    public Casa (int id, String direccion, String status, String precio, String color, boolean limpia) {
        this.id = id;
        this.direccion = direccion;
        this.status = status;
        this.precio = precio;
        this.color = color;
        this.limpia = limpia;
    }

    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLimpia(boolean limpia) {
        this.limpia = limpia;
    }

    //Getters

    public int getId() {
        return id;
    }

    public String getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getStatus() {
        return status;
    }

    public boolean isLimpia() {
        return limpia;
    }

    // Methods

    public void datosCasa( ) {
        System.out.printf("El número de expediente de la casa es %d%n", getId());
        System.out.printf("El status de la casa es: %s%n", getStatus());
        System.out.printf("El precio de la casa es: %s%n", getPrecio());
        System.out.printf("La dirección de la casa es: %s%n", getDireccion());
        System.out.printf("La casa es de color: %s%n", getColor());
    }


}

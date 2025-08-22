package pojos;

public class Cliente {
    private int numero_cliente;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String correo_electronico;

    //Constructores
    public Cliente(int numero_cliente, String nombre, String apellido_paterno, String apellido_materno, String correo_electronico) {
        this.numero_cliente = numero_cliente;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.correo_electronico = correo_electronico;
    }

    public Cliente() {
        this.numero_cliente = -1;
        this.nombre = "nombre";
        this.apellido_paterno = "apellido_paterno";
        this.apellido_materno = "apellido_materno";
        this.correo_electronico = "correo_electronico";
    }

    //Getters & Setters
    public int getNumero_cliente() {
        return numero_cliente;
    }

    public void setNumero_cliente(int numero_cliente) {
        this.numero_cliente = numero_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    //toString


    @Override
    public String toString() {
        return "Cliente :" +
                "numero_cliente: " + numero_cliente +
                ", nombre: '" + nombre + '\'' +
                ", apellido_paterno: '" + apellido_paterno + '\'' +
                ", apellido_materno: '" + apellido_materno + '\'' +
                ", correo_electronico: '" + correo_electronico;
    }
}

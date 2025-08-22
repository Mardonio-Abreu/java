package pojos;

public class Cooperativista {
    private int numero_cooperativista;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String correo_electronico;

    //Constructores
    public Cooperativista(int numero_cooperativista, String nombre, String apellido_paterno, String apellido_materno, String correo_electronico) {
        this.numero_cooperativista = numero_cooperativista;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.correo_electronico = correo_electronico;
    }

    public Cooperativista() {
        this.numero_cooperativista = -1;
        this.nombre = "nombre";
        this.apellido_paterno = "apellido_paterno";
        this.apellido_materno = "apellido_materno";
        this.correo_electronico = "correo_electronico";
    }

    //Geters & Setters

    public int getNumero_cooperativista() {
        return numero_cooperativista;
    }

    public void setNumero_cooperativista(int numero_cooperativista) {
        this.numero_cooperativista = numero_cooperativista;
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
        return "Cooperativista:" +
                "numero_cooperativista: " + numero_cooperativista +
                ", nombre: '" + nombre + '\'' +
                ", apellido_paterno: '" + apellido_paterno + '\'' +
                ", apellido_materno: '" + apellido_materno + '\'' +
                ", correo_electronico: '" + correo_electronico;
    }
}

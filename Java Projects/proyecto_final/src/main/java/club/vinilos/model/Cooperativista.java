package club.vinilos.model;

import jakarta.persistence.*;

@Entity
@Table (name = "Cooperativistas")
public class Cooperativista {
    private int numeroCooperativista;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correoElectronico;
    private String telefono;


    public Cooperativista() {
    }

    public Cooperativista(int numeroCooperativista, String nombre, String apellidoPaterno, String apellidoMaterno, String correoElectronico, String telefono) {
        this.numeroCooperativista = numeroCooperativista;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getNumeroCooperativista() {
        return numeroCooperativista;
    }

    public void setNumeroCooperativista(int numeroCooperativista) {
        this.numeroCooperativista = numeroCooperativista;
    }

    @Column(name = "nombre", length = 100)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column (name = "apellido_paterno", length = 100)
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellido_paterno) {
        this.apellidoPaterno = apellido_paterno;
    }

    @Column (name = "apellido_materno", length = 100)
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellido_materno) {
        this.apellidoMaterno = apellido_materno;
    }

    @Column (name = "correo_electronico", length = 150)
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correo_electronico) {
        this.correoElectronico = correo_electronico;
    }

    @Column (name = "telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "cooperativista{" +
                "numero_cooperativista=" + numeroCooperativista +
                ", nombre='" + nombre + '\'' +
                ", apellido_paterno='" + apellidoPaterno + '\'' +
                ", apellido_materno='" + apellidoMaterno + '\'' +
                ", correo_electronico='" + correoElectronico + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}

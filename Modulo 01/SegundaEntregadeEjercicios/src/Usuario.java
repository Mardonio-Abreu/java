import java.util.Objects;

public class Usuario {

    private int llaveID;
    private String name;
    private int edad;
    private String usuario;
    private String contraseña;
    private String correoElectronico;

    //Constructor
    public Usuario(int llaveID, String name, int edad, String usuario, String contraseña, String correoElectronico) {
        this.llaveID = llaveID;
        this.name = name;
        this.edad = edad;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correoElectronico = correoElectronico;
    }

    public Usuario() {
        this.llaveID = -1;
        this.name = "usuario prueba";
        this.edad = -1;
        this.usuario = "usuarioPrueba";
        this.contraseña = "contraseña";
        this.correoElectronico = "usuario@prueba.com";
    }

    //Getters & Setters
    public int getLlaveID() {
        return llaveID;
    }

    public void setLlaveID(int llaveID) {
        this.llaveID = llaveID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    //toString()
    @Override
    public String toString() {
        return "Usuario{" +
                "name='" + name + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Usuario usuario)) return false;
        return getLlaveID() == usuario.getLlaveID() && Objects.equals(getName(), usuario.getName()) && Objects.equals(getCorreoElectronico(), usuario.getCorreoElectronico());
    }

    //Métodos
    public  String comprar(int productoID) {
        return "Implementame en los hijos" + productoID;
    }

}

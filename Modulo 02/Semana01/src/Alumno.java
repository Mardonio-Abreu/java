public class Alumno {
    private int numeroCuenta;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    //Constructor
    public Alumno(int numeroCuenta, String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    //Getters & Setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numero_cuenta) {
        this.numeroCuenta = numero_cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    //toString
    @Override
    public String toString() {
        return "Alumnos {" +
                "numero_cuenta:" + numeroCuenta +
                ", nombre:'" + nombre + '\'' +
                ", apellidoPaterno:'" + apellidoPaterno + '\'' +
                ", apellidoMaterno:'" + apellidoMaterno + '\'' +
                '}';
    }
}

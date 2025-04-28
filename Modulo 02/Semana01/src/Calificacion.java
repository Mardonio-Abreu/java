public class Calificacion {

    // INSERT INTO calificaciones VALUES (1, 31312, 'Calculo', 80);

    private int idCalificacion;
    private int numeroCuenta;
    private String materia;
    private int calificacion;

    //Constructor

    public Calificacion(int idCalificacion, int numeroCuenta, String materia, int calificacion) {
        this.idCalificacion = idCalificacion;
        this.numeroCuenta = numeroCuenta;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    //Getters & Setters

    public int getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    //toString

    @Override
    public String toString() {
        return "Calificacion {" +
                "idCalificacion: " + idCalificacion +
                ", numeroCuenta: " + numeroCuenta +
                ", materia: " + materia + '\'' +
                ", calificacion: -" + calificacion +
                '}';
    }
}

public class Propietario extends Usuario {
    private int numeroDeCooperativista;

    public Propietario(int llaveID, String name, int edad, String usuario, String contraseña, String correoElectronico, int numeroDeCooperativista) {
        super(llaveID, name, edad, usuario, contraseña, correoElectronico);
        this.numeroDeCooperativista = numeroDeCooperativista;
    }

    public Propietario () {
        super();
        this.numeroDeCooperativista = -1;
    }

    //Setters & Getters
        public int getNumeroDeCooperativista() {
        return numeroDeCooperativista;
    }

    public void setNumeroDeCooperativista(int numeroDeCooperativista) {
        this.numeroDeCooperativista = numeroDeCooperativista;
    }

    //toString
    @Override
    public String toString() {
        return "Propietario {" +
                "numeroDeCooperativista=" + numeroDeCooperativista +
                "} " + super.toString();
    }

    //Metodo
    @Override
    public  String comprar(int productoID) {
        return "Producto agregado al almacen: " + productoID;
    }

}

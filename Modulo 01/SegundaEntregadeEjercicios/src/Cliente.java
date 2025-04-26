public class Cliente extends Usuario {
    private int numeroDeCliente;

    public Cliente(int llaveID, String name, int edad, String usuario, String contraseña, String correoElectronico, int numeroDeCliente) {
        super(llaveID, name, edad, usuario, contraseña, correoElectronico);
        this.numeroDeCliente = numeroDeCliente;
    }

    public Cliente () {
        super();
        this.numeroDeCliente = -1;
    }

    //Getters & Setters
    public int getNumeroDeCliente() {
        return numeroDeCliente;
    }

    public void setNumeroDeCliente(int numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }

    //toString()

    @Override
    public String toString() {
        return "Cliente {" +
                "numeroDeCliente=" + numeroDeCliente +
                "} " + super.toString();
    }

    //Metodo
    @Override
    public  String comprar(int productoID) {
        return "Producto agregado al carrito: " + productoID;
    }
}

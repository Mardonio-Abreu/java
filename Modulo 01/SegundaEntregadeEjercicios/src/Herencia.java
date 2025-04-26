public class Herencia {
    public static void main (String[] args) {

        Propietario propietario01 = new Propietario(1, "Aaron Alvaréz", 35, "aaalva", "contraseñaPropietario", "propietario@correo.com", 002);
        Cliente cliente01 = new Cliente(9, "Carlos Vanegas", 35, "carva", "contraseñaCliente", "cliente@correo.com", 654);

        System.out.println(propietario01.comprar(01));
        System.out.println(cliente01.comprar(03));
    }

}

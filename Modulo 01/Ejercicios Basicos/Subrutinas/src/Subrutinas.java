//Ejemplos y definición y uso:
//

public class Subrutinas {

    public static  int suma (int numero1, int numero2) {

        int resultado;
        resultado = numero1 + numero2;
        return resultado;

    }

    public static void hola () {
        System.out.println("Hola mundo");
    }

    public static void saluda (String persona) {

        System.out.println("Hola " + persona);

    }

    public static void main (String[] args) {
        System.out.println("Subrutinas");
        hola();// llamado a una subrutina
        saluda("Laura");
        saluda("Hector");
        System.out.println(suma(4,5));
        System.out.println("Fin de la ejecución");
    }
}

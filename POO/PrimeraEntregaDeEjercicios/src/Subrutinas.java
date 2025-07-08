//Ejemplos y definición y uso:
//

public class Subrutinas {

    public static  int suma (int numero1, int numero2) {

        int resultado;
        resultado = numero1 + numero2;
        System.out.println("Yo trabajo con enteros");
        return resultado;

    }

    public static  double suma (double numero1, double numero2) {

        double resultado;
        System.out.println("Yo trabajo con dobles");
        resultado = numero1 + numero2;
        return resultado;

    }

    public static  long suma (long numero1, long numero2) {

        long resultado;
        System.out.println("Yo trabajo con largos");
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

        int numIntA = 10;
        int numIntB = 100;

        double numDoubleA = 10;
        double numDoubleB = 1000;

        long numLongA = 10;
        long numLongB = 100;



        System.out.println("Subrutinas");
        hola();// llamado a una subrutina
        saluda("Laura");
        saluda("Hector");

        // sobrecarga
        System.out.println(suma(numIntA, numIntB));
        System.out.println(suma(numDoubleA, numDoubleB));
        System.out.println(suma(numLongA, numLongB));

        System.out.println("Fin de la ejecución");
    }
}

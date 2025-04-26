//Recibir dos valores numericos y decir si el primero es multiplo del segundo
import java.util.Scanner;
public class EsMultiplo {
    public static String esMultiplo (int numA, int numB) {

        if ( numA % numB == 0) {
            return "Es múltiplo";
        } else {
            return "No es múltiplo";
        }

    }

    public static void main (String[] args) {

        int numA, numB;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el primer número entero: ");
        numA = keyboard.nextInt();

        System.out.println("Ingrese el segundo número entero: ");
        numB = keyboard.nextInt();

        System.out.println(esMultiplo(numA, numB));

    }
}


//Recibiendo un valor numerico desplegar si es par o impar.

import java.util.Scanner;

public class OddOrPair {

    public static String oddOrPair(int num) {
        if (num % 2 == 0) {
            return "Es par";
        } else {
            return "Es impar";
        }
    }

    public static void main (String[] args) {

        int num;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        num = keyboard.nextInt();

        System.out.println(oddOrPair(num));

    }
}



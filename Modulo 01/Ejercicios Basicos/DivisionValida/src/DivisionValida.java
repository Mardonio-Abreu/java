//Recibir dos números y dividir  el primero entre el segundo siempre y cuando el segundo sea diferente de cero

import java.util.Scanner;

public class DivisionValida {

    public static String divisionValida (int numA, int numB) {
        if (numB != 0) {
            return String.valueOf(numA/numB);
        } else {
            return "No es valida la división entre cero!";
        }
    }

        public static void main (String[] args) {

            int numA, numB;

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Ingrese el primer número a dividir: ");
            numA = keyboard.nextInt();

            System.out.println("Ingrese el segundo número a dividir: ");
            numB = keyboard.nextInt();

            System.out.println(divisionValida(numA, numB));

        }


}

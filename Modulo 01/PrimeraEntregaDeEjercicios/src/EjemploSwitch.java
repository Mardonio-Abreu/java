/* Pedir dos valores, presentar un menu de operaciones, (+, -, /, *) , validar qué el segundo valor no sea cero */

import java.util.Scanner;

public class EjemploSwitch {

    public static String operaciones() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        double numA = scanner.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double numB = scanner.nextDouble();

        System.out.println("Ingrese la operación a realizar: (+, -, /, *)");
        String operation = scanner.next();

        switch (operation) {

            case "+":
                return Double.toString(numA + numB);

            case "-":
                return Double.toString( numA - numB);

            case "*":
                return Double.toString(numA * numB);

            case "/":
                if (numB == 0) {
                    return "No es posible la división entre cero";
                } else {
                    return Double.toString(numA / numB);
                }

            default:
                return "¡No es una opción valida!";

        }



    }

    public static void main (String[] args) {
        System.out.println(operaciones());
    }

}

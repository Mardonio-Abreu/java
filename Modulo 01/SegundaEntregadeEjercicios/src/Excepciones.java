/*  Autor Mardonio Abreu
    Uso de try-catch para manejar excepciones. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {
    public static int division(int numA, int numB) {
        int division = numA / numB;
        return division;
    }

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingresa el primer número entero a dividir: ");
            int numA = scanner.nextInt();
            System.out.println("Ingresa el segundo número entero a dividir: ");
            int numB = scanner.nextInt();

            System.out.println(division(numA, numB));
        }

        catch (ArithmeticException e) {
            System.out.println("No es posible dividir entre cero!");
            e.printStackTrace();
        }

        catch (InputMismatchException e) {
            System.out.println("Sólo se aceptan números enteros");
            e.printStackTrace();
        }

        catch (Exception e) {
            System.out.println("Error inesperado");
            e.printStackTrace();
        }

        finally {
            System.out.println("Fin del programa");
        }
    }
}

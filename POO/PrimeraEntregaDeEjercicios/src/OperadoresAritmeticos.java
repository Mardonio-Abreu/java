public class OperadoresAritmeticos {

    public static void operadoresAritmeticos (double numA, double numB ) {
        System.out.println("Operadores Aritmeticos");
        System.out.printf("Suma: %.2f + %.2f = %.2f%n", numA, numB, numA + numB );
        System.out.printf("Resta: %.2f - %.2f = %.2f%n", numA, numB, numA - numB );
        System.out.printf("Operador unario: -(%.2f) = %.2f%n",numA, -numA );
        System.out.printf("Multiplicación: %.2f * %.2f = %.2f%n", numA, numB, numA * numB );
        System.out.printf("Módulo: %.2f %% %.2f = %.2f%n", numA, numB, numA % numB );

        if (numB == 0) {
            System.out.println("No es posible la división entre cero");
        } else {
            System.out.printf("División: %.2f / %.2f = %.2f%n", numA, numB, numA / numB );
        }
    }

    public static void operadoresAritmeticosContinuacion (double numA, int numB) {
        System.out.println("Operadores Aritmeticos Continuación");
        for (int i = 0; i <= numB; i++) {
            System.out.printf("+=: %.2f + 1 = %.2f%n", numA, numA += 1);
        }

        for (int i = 0; i <= numB; i++) {
            System.out.printf("-=: %.2f - 1 = %.2f%n", numA, numA -= 1);
        }

        for (int i = 0; i <= numB; i++) {
            System.out.printf("*=: %.2f * 2 = %.2f%n", numA, numA *= 2);
        }

        for (int i = 0; i <= numB; i++) {
            System.out.printf("/=: %.2f / 2 = %.2f%n", numA, numA /= 2);
        }

        for (int i = 0; i <= numB; i++) {
            System.out.printf("%%=: %.2f * 2 = %.2f%n", numA, numA %= 2);
        }
    }

    public static void operadoresBitwise (byte byteA, byte byteB) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(byteA &= byteB);
            System.out.println(byteA |= byteB);
        }
    }

    public static void main (String[] args){

        byte a = 1;
        byte b = 1;
        operadoresAritmeticos(3, 5);
        operadoresAritmeticosContinuacion(5, 5);
        operadoresBitwise(a, b);
    }
}

public class OperadoresDeComparacion {
    public static void operaadoresDeComparacion (int numA, int numB) {
        System.out.println("Operadores de Comparación");
        System.out.printf("Operador > : %d > %d : %b%n", numA, numB, numA > numB);
        System.out.printf("Operador >= : %d >= %d : %b%n", numA, numB, numA >= numB);
        System.out.printf("Operador < : %d < %d : %b%n", numA, numB, numA < numB);
        System.out.printf("Operador <= : %d <= %d : %b%n", numA, numB, numA <= numB);
        System.out.printf("Operador == : %d == %d : %b%n", numA, numB, numA == numB);
        System.out.printf("Operador != : %d != %d : %b%n", numA, numB, numA != numB);
    }

    public static void main (String[] args) {
        operaadoresDeComparacion(5, 3);
    }
}


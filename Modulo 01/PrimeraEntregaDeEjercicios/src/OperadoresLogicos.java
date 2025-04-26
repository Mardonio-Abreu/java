public class OperadoresLogicos {
    public static void operadoresLogicos (boolean boolA, boolean boolB) {
        System.out.println("Operadores Lógicos");
        System.out.printf("Operador %b && %b: %b%n", boolA, boolB, boolA && boolB);
        System.out.printf("Operador %b & %b: %b%n", boolA, boolB, boolA & boolB);
        System.out.printf("Operador %b || %b: %b%n", boolA, boolB, boolA || boolB);
        System.out.printf("Operador %b | %b: %b%n", boolA, boolB, boolA | boolB);
        System.out.printf("Operador ! %b: %b%n", boolA, !boolA);

    }

    public static void main (String[] args) {
        operadoresLogicos(true, true);
    }


}

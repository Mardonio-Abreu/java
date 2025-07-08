public class Arreglos {

    public static double[] promedio (double[][] calificaciones ) {

        double[] promedios = new double[5];
        double suma = 0;


        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 3; j++) {
                promedios[i] += calificaciones[i][j];
            }
        }
        return promedios;
    }

    public static void main (String[] args) {

        double[][] calificaciones = {{ 10, 10, 9}, {9, 8, 7}, { 6, 7, 8}, {9, 8, 7}, { 6, 7, 8}};

        double[] promedioMain = promedio(calificaciones);
        double promedioTotal = 0;


        for ( int i = 0; i < 5; i++) {
            System.out.printf("El promedio es: %.2f%n", promedioMain[i]/3);
            promedioTotal += promedioMain[i];
        }

        System.out.printf("El promedio final es: %.2f%n", promedioTotal/15);

    }

}


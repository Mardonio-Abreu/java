public class Promedio {

    public static double[] promedio (double[][] calificaciones ) {

        double[] promedios = new double[6];
        double suma = 0;
        double promedioGeneral = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                promedios[i] += calificaciones[i][j];
            }
            promedioGeneral += promedios[i];
        }

        promedios[5] = promedioGeneral;
        return promedios;
    }

    public static void main (String[] args) {

        double[][] calificaciones = {{ 10, 10, 9}, {9, 8, 7}, { 6, 7, 8}, {9, 8, 7}, { 6, 7, 8}};

        double[] promedioMain = promedio(calificaciones);

        for ( int i = 0; i < 5; i++) {
            System.out.println(promedioMain[i]/3);
        }
        System.out.println(promedioMain[5]/5);
    }

}

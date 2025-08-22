/* Simulacro de elecciones:
Muestra un menu de 5 candidatos y dentro de un ciclo registra los votos e imprime en pantalla al ganador
Muestra resultados usando una barra

Author Mardonio Abreu
 */

import java.util.Scanner;


public class CicloDoWhile {

    public static int menu(String[] candidatos) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("SIMULACRO DE ELECCIONES 2025");
        System.out.println("1. " + candidatos[0]);
        System.out.println("2. " + candidatos[1]);
        System.out.println("3. " + candidatos[2]);
        System.out.println("4. Ninguno (voto nulo)");
        System.out.println("9. Terminar");
        System.out.println("Por quién vas a votar? (9 para terminar)");

        int opcion = scanner.nextInt();

        return opcion;


    }

    public static void simulacro ( ) {

        int opcion;
        int[] arrayVotos = {0, 0, 0, 0};

        String[] arrayCandidatos = {"Mardonio", "Abel", "Roberto", "Votos nulos"};

        do {

            opcion = menu(arrayCandidatos);

            if (opcion == 1){
                arrayVotos[0]++;

            } else if (opcion == 2){
                arrayVotos[1]++;

            } else if (opcion == 3){
                arrayVotos[2]++;

            } else if (opcion == 4) {
                arrayVotos[3]++;
            } else {
                System.out.println("Opción invalida");
            }

        } while (opcion != 9);

        for (int i = 0; i < 4; i++) {
            System.out.println(arrayCandidatos[i] + " votos: " + arrayVotos[i]);
        }

    }

    public static void main(String[] args) {
        simulacro();
    }
}
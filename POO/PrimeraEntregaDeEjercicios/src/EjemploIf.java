//Saludar de acuerdo a la hora

import java.util.Scanner;

public class EjemploIf {

    public static String saludos () {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("¿Qué hora es? : ");

        keyboard.useDelimiter(":");

        String hora = keyboard.next();

        int horaNum = Integer.parseInt(hora);

        if (horaNum >= 6 && horaNum < 12) {
            return "Buenos dias!";
        } else if(horaNum >= 6 && horaNum < 18 ) {
            return "Buenas tardes!";
        } else {
            return "Buenas noches!";
        }

    }

    public static void main (String[] args) {

        System.out.println(saludos());
    }
}

//Recibir un nombre, compararlo y si es igual desplegar "Bienvenido MI_NOMBRE", en otro caso decir solo "Hola Bienvenido!

import java.util.Objects;
import java.util.Scanner;

public class Bienvenido {

    public static String bienvenido() {

        String MI_NOMBRE = "Juan";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre por favor: ");
        String nombreUsuario = scanner.next();

        if (Objects.equals(nombreUsuario, MI_NOMBRE)) {
            return "Binvenido " + MI_NOMBRE;
        } else {
            return "¡Hola Bienvenido!";
        }

    }



    public static void main (String[] args) {

        System.out.println(bienvenido());

    }

}



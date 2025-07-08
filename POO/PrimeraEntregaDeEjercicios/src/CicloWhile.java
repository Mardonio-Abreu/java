import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        boolean flag = true;
        int opcion = 0;

        while(flag){
            System.out.println("Banco de la Ilusión");
            System.out.println("Qué operación desea realizar?");

            System.out.println("1 Retirar");
            System.out.println("2 Depositar");
            System.out.println("3 Transferir");
            System.out.println("9 Salir ");

            opcion = keyboard.nextInt();

            if (opcion == 1 || opcion == 2 || opcion == 3) {
                System.out.println("___________________________________________");
                System.out.println("No hay sistema!");
                System.out.println("___________________________________________");
            } else {
                flag = false;
            }
       }
    }
}

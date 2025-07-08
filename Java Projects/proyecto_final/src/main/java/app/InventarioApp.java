package app;

import club.vinilos.model.Inventario;

import java.util.List;
import java.util.Scanner;
import club.vinilos.service.impl.InventarioServiceImpl;

public class InventarioApp {

    Scanner scanner=new Scanner(System.in);
    InventarioServiceImpl service = InventarioServiceImpl.getInstance();

    public InventarioApp() {}

    public void app() {
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("1 Agregar inventario");
        System.out.println("2 Consultar información del inventario");
        System.out.println("3 Consultar información de todos los inventarios");
        System.out.println("4 Modificar inventario");
        System.out.println("5 Eliminar inventario");
        System.out.println("6 Salir");
        int opcion = scanner.nextInt();

        Inventario inventario = new Inventario();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el número del nuevo inventario: ");
                inventario.setNumeroInventario(Integer.parseInt(scanner.next()));
                System.out.print("Ingrese el número de artículos disponibles: ");
                inventario.setArticulosDisponibles(Integer.parseInt(scanner.next()));

                service.saveInventario(inventario);
                break;
            case 2:
                System.out.print("Ingrese el número del inventario: ");
                int id = scanner.nextInt();

                inventario = service.findInventarioById(id);
                System.out.println(inventario);
                break;

            case 3:
                List<Inventario> inventarios = service.findAllInventarios();
                System.out.println(inventarios);
                break;

            case 4:
                System.out.print("Ingrese el número del inventario a modificar: ");
                int numero = scanner.nextInt();
                System.out.print("Ingrese el número de artículos disponibles: ");
                inventario.setArticulosDisponibles(Integer.parseInt(scanner.next()));

                service.updateInventarioById(inventario, numero);
                break;

            case 5:
                System.out.print("Ingrese el número del inventario a eliminar: ");
                int idInventario = scanner.nextInt();

                service.deleteInventarioById(idInventario);
                break;

            default:
                System.out.println("Opción INVALIDA");
                break;
        }
    }
}




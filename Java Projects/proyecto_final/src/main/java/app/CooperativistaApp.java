package app;

import club.vinilos.model.Cooperativista;

import java.util.List;
import java.util.Scanner;
import club.vinilos.service.impl.CooperativistaServiceImpl;

public class CooperativistaApp {

    Scanner scanner=new Scanner(System.in);
    CooperativistaServiceImpl service = CooperativistaServiceImpl.getInstance();

    public CooperativistaApp() {}

    public void app() {
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("1 Agregar cooperativista");
        System.out.println("2 Consultar información del cooperativista");
        System.out.println("3 Consultar información de todos los cooperativistas");
        System.out.println("4 Modificar cooperativista");
        System.out.println("5 Eliminar cooperativista");
        System.out.println("6 Salir");
        int opcion = scanner.nextInt();

        Cooperativista cooperativista = new Cooperativista();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el número del nuevo cooperativista: ");
                cooperativista.setNumeroCooperativista(Integer.parseInt(scanner.next()));
                System.out.print("Ingrese el nombre del cooperativista: ");
                cooperativista.setNombre(scanner.next());
                System.out.print("Ingrese el apellido paterno del cooperativista: ");
                cooperativista.setApellidoPaterno(scanner.next());
                System.out.println("Ingrese el apellido materno del cooperativista: ");
                cooperativista.setApellidoMaterno(scanner.next());
                System.out.print("Ingrese el correo electrónico del cooperativista: ");
                cooperativista.setCorreoElectronico(scanner.next());
                System.out.print("Ingrese el teléfono del cooperativista: ");
                cooperativista.setTelefono(scanner.next());

                service.saveCooperativista(cooperativista);
                break;
            case 2:
                System.out.print("Ingrese el número del cooperativista: ");
                int id = scanner.nextInt();

                cooperativista = service.findCooperativistaById(id);
                System.out.println(cooperativista);
                break;

            case 3:
                List<Cooperativista> cooperativistas = service.findAllCooperativistas();
                System.out.println(cooperativistas);
                break;

            case 4:
                System.out.print("Ingrese el número del cooperativista a modificar: ");
                int numero = scanner.nextInt();
                System.out.print("Ingrese el nombre del cooperativista: ");
                cooperativista.setNombre(scanner.next());
                System.out.print("Ingrese el apellido paterno del cooperativista: ");
                cooperativista.setApellidoPaterno(scanner.next());
                System.out.println("Ingrese el apellido materno del cooperativista: ");
                cooperativista.setApellidoMaterno(scanner.next());
                System.out.print("Ingrese el correo electrónico del cooperativista: ");
                cooperativista.setCorreoElectronico(scanner.next());
                System.out.print("Ingrese el teléfono del cooperativista: ");
                cooperativista.setTelefono(scanner.next());

                service.updateCooperativistaById(cooperativista, numero);
                break;

            case 5:
                System.out.print("Ingrese el número del cooperativista a eliminar: ");
                int idCooperativista = scanner.nextInt();

                service.deleteCooperativistaById(idCooperativista);
                break;

            default:
                System.out.println("Opción INVALIDA");
                break;
        }
    }
}



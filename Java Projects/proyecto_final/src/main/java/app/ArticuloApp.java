package app;

import club.vinilos.model.Articulo;

import java.util.List;
import java.util.Scanner;
import club.vinilos.service.impl.ArticuloServiceImpl;

public class ArticuloApp {


    Scanner scanner=new Scanner(System.in);
    ArticuloServiceImpl service = ArticuloServiceImpl.getInstance();

    public ArticuloApp() {}

    public void app() {
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("1 Agregar artículo");
        System.out.println("2 Consultar información del artículo");
        System.out.println("3 Consultar información de todos los artículos");
        System.out.println("4 Modificar artículo");
        System.out.println("5 Eliminar artículo");
        System.out.println("6 Salir");
        int opcion = scanner.nextInt();

        Articulo articulo = new Articulo();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el número del nuevo articulo: ");
                articulo.setNumeroArticulo(Integer.parseInt(scanner.next()));
                System.out.print("Ingrese el nombre del articulo: ");
                articulo.setNombre(scanner.next());
                System.out.print("Ingrese la categoria del articulo: ");
                articulo.setCategoria(scanner.next());
                System.out.println("Ingrese la descripción del articulo: ");
                articulo.setDescripcion(scanner.next());
                System.out.print("Ingrese el precio del articulo: ");
                articulo.setPrecio(scanner.nextInt());
                System.out.print("Ingrese el path de las fotografias del articulo: ");
                articulo.setFotografias(scanner.next());

                service.saveArticulo(articulo);
                break;
            case 2:
                System.out.print("Ingrese el número del articulo: ");
                int id = scanner.nextInt();

                articulo = service.findArticuloById(id);
                System.out.println(articulo);
                break;

            case 3:
                List<Articulo> articulos = service.findAllArticulos();
                System.out.println(articulos);
                break;

            case 4:
                System.out.print("Ingrese el número del articulo a modificar: ");
                int numero = scanner.nextInt();
                System.out.print("Ingrese el nombre del articulo: ");
                articulo.setNombre(scanner.next());
                System.out.print("Ingrese la categoria del articulo: ");
                articulo.setCategoria(scanner.next());
                System.out.println("Ingrese la descripción del articulo: ");
                articulo.setDescripcion(scanner.next());
                System.out.print("Ingrese el precio del articulo: ");
                articulo.setPrecio(scanner.nextInt());
                System.out.print("Ingrese el path de las fotografias del articulo: ");
                articulo.setFotografias(scanner.next());

                service.updateArticuloById(articulo, numero);
                break;

            case 5:
                System.out.print("Ingrese el número del articulo a eliminar: ");
                int idArticulo = scanner.nextInt();

                service.deleteArticuloById(idArticulo);
                break;

            default:
                System.out.println("Opción INVALIDA");
                break;
        }
    }
}



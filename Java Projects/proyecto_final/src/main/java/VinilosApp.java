import club.vinilos.model.*;

import app.*;

import club.vinilos.service.impl.*;

import java.util.List;
import java.util.Scanner;

public class VinilosApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArticuloServiceImpl articuloService = ArticuloServiceImpl.getInstance();
        CooperativistaServiceImpl cooperativistaService = CooperativistaServiceImpl.getInstance();
        InventarioServiceImpl inventarioService = InventarioServiceImpl.getInstance();

        //Test entities
        Cooperativista cooperativista = new Cooperativista(1, "Aaron", "Alvarez", "Archundia", "correo@email.com", "55258564");
        Articulo articulo = new Articulo(2, 5, "Punk", "Disco 3", "Vinil, excelente condicion", 100, "sin fotos");
        Inventario inventario = new Inventario(3, articulo, 25);

        Cooperativista cooperativista01 = new Cooperativista(10, "Aaron", "Alvarez", "Archundia", "correo@email.com", "55258564");
        Articulo articulo01 = new Articulo(20, 5, "Punk", "Disco 3", "Vinil, excelente condicion", 100, "sin fotos");
        Inventario inventario01 = new Inventario(30, articulo, 25);

        Cooperativista cooperativista02 = new Cooperativista(1, "Bert", "Alvarez", "Archundia", "correo@email.com", "55258564");
        Articulo articulo02 = new Articulo(2, 5, "Rock", "Disco 3", "Vinil, excelente condicion", 100, "sin fotos");
        Inventario inventario02 = new Inventario(3, articulo, 52);


        //Create
        articuloService.saveArticulo(articulo);
        cooperativistaService.saveCooperativista(cooperativista);
        inventarioService.saveInventario(inventario);

        articuloService.saveArticulo(articulo01);
        cooperativistaService.saveCooperativista(cooperativista01);
        inventarioService.saveInventario(inventario01);

        //Read by ID
        Articulo nuevoArticulo = new Articulo();
        Cooperativista nuevoCooperativista = new Cooperativista();
        Inventario nuevoInventario = new Inventario();

        nuevoArticulo = articuloService.findArticuloById(2);
        nuevoCooperativista = cooperativistaService.findCooperativistaById(1);
        nuevoInventario = inventarioService.findInventarioById(3);

        System.out.println("Inventario: " + nuevoInventario);
        System.out.println("Cooperativista: " + nuevoCooperativista);
        System.out.println("Articulo: " + nuevoArticulo);

        //Read all
        List<Articulo> articulos = null;
        List<Cooperativista> cooperativistas = null;
        List<Inventario> inventarios = null;

        articulos = articuloService.findAllArticulos();
        cooperativistas = cooperativistaService.findAllCooperativistas();
        inventarios = inventarioService.findAllInventarios();

        System.out.println("Articulos: " + articulos);
        System.out.println("Cooperativistas: " + cooperativistas);
        System.out.println("Inventarios: " + inventarios);

        //Update
        articuloService.updateArticuloById(articulo02, 2);
        cooperativistaService.updateCooperativistaById(cooperativista02, 1);
        inventarioService.updateInventarioById(inventario02, 3);

        Articulo nuevoArticulo01= new Articulo();
        Cooperativista nuevoCooperativista01 = new Cooperativista();
        Inventario nuevoInventario01 = new Inventario();

        nuevoArticulo01 = articuloService.findArticuloById(2);
        nuevoCooperativista01 = cooperativistaService.findCooperativistaById(1);
        nuevoInventario01 = inventarioService.findInventarioById(3);

        System.out.println("Inventario: " + nuevoInventario01);
        System.out.println("Cooperativista: " + nuevoCooperativista01);
        System.out.println("Articulo: " + nuevoArticulo01);

        //Delete
        articuloService.deleteArticuloById(2);
        cooperativistaService.deleteCooperativistaById(1);
        inventarioService.deleteInventarioById(3);



        ArticuloApp articuloApp = new ArticuloApp();
        CooperativistaApp cooperativistaApp = new CooperativistaApp();
        InventarioApp inventarioApp = new InventarioApp();

//        System.out.println("¿Qué tabla desea utilizar?");
//        System.out.println("1. Inventario");
//        System.out.println("2. Artículo");
//        System.out.println("3. Cooperativista");
//        System.out.println("4. Salir");
//
//        int opcion = scanner.nextInt();
//
//        while(opcion != 4){
//            switch (opcion){
//                case 1:
//                    opcion = 4;
//                    inventarioApp.app();
//                    break;
//                case  2:
//                    opcion = 4;
//                    articuloApp.app();
//                    break;
//                case 3:
//                    opcion = 4;
//                    cooperativistaApp.app();
//                default:
//                    opcion = 4;
//                    System.out.println("Opción INVALIDA");
//            }
//        }
    }
}

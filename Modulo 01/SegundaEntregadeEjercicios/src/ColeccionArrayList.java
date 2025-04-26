import java.util.ArrayList;
import java.util.List;

public class ColeccionArrayList {
    public static void main(String[] args) {

        //Declaracion de arraylist
        ArrayList<String> punkRock = new ArrayList<>();

        //Agregar elementos
        punkRock.add("The Clash");
        punkRock.add("Sex Pistols");
        punkRock.add("The Ramones");
        punkRock.add("Sex Pistols");

        System.out.println(punkRock);

        //Accesa a un elemento
        System.out.println("El elemento cero es: " + punkRock.get(0));

        //Regresa la posición de un elemento
        System.out.println("El indice de The Clash es: " + punkRock.indexOf("The Clash"));

        //Nos muestra la ultima posicion del elemento
        System.out.println("La última posición del elemento Sex Pistols es: " + punkRock.lastIndexOf("Sex Pistols"));

        //Agrega un elemento
        punkRock.add(4, "NOFX");
        System.out.println(punkRock);

        //Elimina un elemento
        punkRock.remove(3);
        System.out.println(punkRock);
    }
}

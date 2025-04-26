import java.util.HashMap;

public class ColeccionHashMap {
    public static void main (String[] args){
        HashMap<Integer, String> alumnos = new HashMap<Integer, String>();

        //Agregar
        alumnos.put(1, "Aaron");
        alumnos.put(2, "Bobby");
        alumnos.put(3, "Carlos");
        System.out.println("Alummos: " + alumnos);

        //Extraer
        System.out.println(alumnos.get(1));
        System.out.println(alumnos.get(2));
        System.out.println(alumnos.get(3));

        //Existencia de llave o valor
        System.out.println(alumnos.containsKey(1));
        System.out.println(alumnos.containsKey(4));
        System.out.println(alumnos.containsValue("Aaron"));
        System.out.println(alumnos.containsValue("Daniel"));
        System.out.println("Alummos: " + alumnos);

        //Cambiar valor
        System.out.println(alumnos.put(3, "Daniel"));
        System.out.println("Alummos: " + alumnos);

        //Agregar nuevo registro
        System.out.println(alumnos.put(4, "Estela"));
        System.out.println("Alummos: " + alumnos);
    }
}

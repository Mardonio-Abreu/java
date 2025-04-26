public class ClaseConEstaticos {
    //Atributos
    private String nombre;

    //Atributo estatico y publico
    public static String saludo = "Hola";

    //Clase estatica
    public static class Saludo {

        public static String saludar (String nombre) {
            return saludo + " " + nombre ;
        }
    }
}

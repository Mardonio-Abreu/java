public class PruebaConEstaticos {
    public static void main(String[] args) {

        //ClaseConEstaticos.Saludo saludo01 = new ClaseConEstaticos.Saludo();

        //Llamada a un atributo estatico y publico
        System.out.println(ClaseConEstaticos.saludo);

        //Instanciación
        System.out.println(ClaseConEstaticos.Saludo.saludar("Carlos"));

    }
}

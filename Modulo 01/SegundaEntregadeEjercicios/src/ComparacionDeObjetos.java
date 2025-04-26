public class ComparacionDeObjetos {
    public static void main (String[] args) {

        //Instanciacion
        Casa casa01 = new Casa(01, "calle falsa #23", 1234567, "azul", true, true);
        Casa casa02 = new Casa(01, "calle falsa #23", 1234567, "azul", true, true);

        Departamento dpto01 = new Departamento(02, "calle cerrada #12", 1894561, "verde", 5, false, true);

        System.out.println(casa01.toString());
        System.out.println(casa01.isVendida(true));
        System.out.println(casa01.toString());
        System.out.println(" ");

        System.out.println(casa02.toString());
        System.out.println(casa02.isVendida(true));
        System.out.println(casa02.toString());
        System.out.println(" ");

        System.out.println(dpto01.toString());
        System.out.println(dpto01.isVendida(true));
        System.out.println(dpto01.toString());
        System.out.println(" ");

        //Comparación de objetos
        System.out.println("Los inmuebles son iguales: " + casa01.equals(dpto01));
        System.out.println("Los inmuebles son iguales: " + dpto01.equals(casa01));
        System.out.println(" ");

        System.out.println("Los inmuebles son iguales: " + casa01.equals(casa02));


    }
}

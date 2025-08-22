
public class Inmobiliaria {

    public static void inmobiliaria () {
        System.out.println("Inmobiliaria Casita Amarilla");
    }

    public static void main (String[] args) {

        inmobiliaria();

        Casa casa001 = new Casa( 123, "Manzanita 22", "Venta", "1234567", "Blanca", true  );
        Casa casa002 = new Casa( 456, "Bicicletas 45", "Venta", "4567892", "Azul", false  );
        Casa casa003 = new Casa( 789, "Aguilas 73", "Renta", "45000", "Verde", true  );

        casa001.datosCasa();
        casa002.datosCasa();
        casa003.datosCasa();

        casa001.setColor("Gris");
        System.out.println(casa001.getColor());
        casa002.setLimpia(true);
        System.out.println(casa002.isLimpia());
        casa003.setStatus("venta");
        System.out.println(casa003.getStatus());

        casa001.datosCasa();
        casa002.datosCasa();
        casa003.datosCasa();
    }

}

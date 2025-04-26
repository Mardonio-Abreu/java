import java.util.Arrays;
import java.util.Objects;

public class ImplementacionIcrud implements Icrud {
    //Atributos de clase
    private String[] almacen = new String[5];

    //Constructores
    public ImplementacionIcrud(String[] almacen) {
        this.almacen = almacen;
    }

    public ImplementacionIcrud() {
        this.almacen[0] = "Estoy vacio";
    }

    //Getters & setters
    public String getAlmacen(int indice) {
        String value;
        value = this.almacen[indice];
        return value;
    }

    public void setAlmacen(int indice, String value) {
        this.almacen[indice] = value;
    }

   //toString
    @Override
    public String toString() {
        return "ImplementacionIcrud {" +
                "almacen=" + Arrays.toString(almacen) +
                '}';
    }

    @Override
    public String create(int indice, String producto) {
        this.setAlmacen(indice, producto);
        return "Producto creado en almacen " + producto + " ";
    }

    @Override
    public String read(int indice) {
        return "Producto: " + this.getAlmacen(indice);
    }

    @Override
    public String update(int indice, String nuevoProducto) {
        this.setAlmacen(indice, nuevoProducto);
        return "Producto actualizado";
    }

    @Override
    public String delete(int indice) {
        this.setAlmacen(indice, "Estoy vacio");
        return "Producto eliminado";
    }

    public static void main (String[] args) {

        ImplementacionIcrud productosEnAlmacen = new ImplementacionIcrud();


        System.out.println("Create");
        System.out.println(
        productosEnAlmacen.create(0, "pluma") +
        productosEnAlmacen.create(1, "lapiz") +
        productosEnAlmacen.create(2, "goma") +
        productosEnAlmacen.create(3, "sacapuntas") +
        productosEnAlmacen.create(4, "cuaderno"));

        System.out.println(productosEnAlmacen);

        System.out.println("Read");
        System.out.println(productosEnAlmacen.read(0));
        System.out.println(productosEnAlmacen);

        System.out.println("Delete");
        System.out.println(productosEnAlmacen.delete(0));
        System.out.println(productosEnAlmacen);

        System.out.println("Update");
        System.out.println(productosEnAlmacen.update(3, "agenda"));
        System.out.println(productosEnAlmacen);
    }
}

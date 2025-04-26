public class ClaseGenerica <T> {

    //Atributo
    private T value;

    //Constructor
    public ClaseGenerica(T value) {
        this.value = value;
    }

    public ClaseGenerica() {
        this.value = null;
    }

    //Getter & Setter
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
    //toSring
    @Override
    public String toString() {
        return "ClaseGenerica {" +
                "value=" + value +
                '}';
    }

    //Metodo
    public void suma(T objeto1, T objeto2) {
        System.out.println("Yo trabajo con: " + objeto1.getClass());
        System.out.println(objeto1);
        System.out.println(objeto2);
    }


}

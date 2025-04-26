public class PruebaGenericos {
    public static void main (String[] args) {

        ClaseGenerica <String> stringClaseGenerica = new ClaseGenerica<>();
        stringClaseGenerica.suma("Joe ", "Karl");

        ClaseGenerica <Integer> integerClaseGenerica0 = new ClaseGenerica<>();
        integerClaseGenerica0.suma(3, 2);


    }
}

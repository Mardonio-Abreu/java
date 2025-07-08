public class CalculaIMC {
    public static String imc(double masa, double altura ) {

        double im = 0;
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("Cuál es tu peso? (kg): ");
//        masa = keyboard.nextDouble();
//
//        System.out.println("Cuál es tu altura? (m): ");
//        altura = keyboard.nextDouble();

        im = masa / (altura * altura);
        System.out.println("Masa :" + masa + " Altura: " + altura);
        System.out.println("El IMC es:" + im);

        if (im <= 18.5) {
            return("Bajo peso");
        } else if (im > 18.5 && im <= 24.9) {
            return("Peso ideal");
        } else if (im > 24.9 && im <= 29.9) {
            return("Sobrepeso");
        } else if ( im > 29.9 && im <= 34.9) {
            return("Obesidad leve");
        } else if (im > 34.9 && im <= 39.9) {
            return("Obesidad moderada");
        } else {
            return("Obesidad morbida");
        }
    }

    public static void main (String[] args) {
        for ( int i = 0; i <= 450; i++ ) {
            System.out.println(imc(i, 2));
        }
    }
}

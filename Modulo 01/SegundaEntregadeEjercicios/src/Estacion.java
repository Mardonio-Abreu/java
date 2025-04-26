enum Estacion {UNIVERSAL(107), STEREO100(100), UNIVERSIDAD(86), EDUCACION(106);

    private float frecuencia;

    //Constructor

    private Estacion(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    private Estacion () {
        this.frecuencia = -1;
    }

    //Getter
    public float getFrecuencia() {
        return frecuencia;
    }
}

class Ejemplo {
    public static void main (String[] args) {
        Estacion estacion01 = Estacion.EDUCACION;
        System.out.println("Estación: " + estacion01);
        System.out.println("Frecuencia: " + estacion01.getFrecuencia());

    }
}

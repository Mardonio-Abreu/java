package dgtic.core.modelo;

import java.util.ArrayList;

public class CSV implements SalidaReporte {

    @Override
    public void generar(ArrayList<String> datos) {
        System.out.println("Generando CSV");
    }

}

package dgtic.core.servicio;

import dgtic.core.modelo.TiposCarro;

public class FabricaCoches {
    private static FabricaCoches fabricaCoches=new FabricaCoches();

    public static FabricaCoches getInstance(){
        return fabricaCoches;
    }

    public ModeloCoche getModeloCoche(TiposCarro tipo) throws IllegalAccessException {
        if(tipo.equals(TiposCarro.DEPORTIVO)){
            return new Deportivo();
        }else if(tipo.equals(TiposCarro.FAMILIAR)){
            return new Familiar();
        }else if(tipo.equals(TiposCarro.TODOTERRENO)){
            return new TodoTerreno();
        }
        throw new IllegalAccessException("No existe ese tipo de carro");
    }
}
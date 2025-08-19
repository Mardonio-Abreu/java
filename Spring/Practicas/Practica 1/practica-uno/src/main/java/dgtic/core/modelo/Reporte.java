package dgtic.core.modelo;

public class Reporte {
    private String nombreReporte;
    private Integer numeroReporte;

    public Reporte(String nombreReporte) {
        this.nombreReporte = nombreReporte;
    }

    public Reporte(Integer numeroReporte) {
        this.numeroReporte = numeroReporte;
    }

    public String getNombreReporte() {
        return nombreReporte;
    }

    public void setNombreReporte(String nombreReporte) {
        this.nombreReporte = nombreReporte;
    }

    public Integer getNumeroReporte() {
        return numeroReporte;
    }

    public void setNumeroReporte(Integer numeroReporte) {
        this.numeroReporte = numeroReporte;
    }

    @Override
    public String toString() {
        return "Reporte: " +
                "nombreReporte: " + nombreReporte +
                ", numeroReporte: " + numeroReporte;
    }
}

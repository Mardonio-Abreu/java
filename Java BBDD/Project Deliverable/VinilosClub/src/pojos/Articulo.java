package pojos;

import java.sql.Array;
import java.util.Arrays;

public class Articulo {
    private int numero_articulo;
    private String categoria;
    private String nombre;
    private String descripcion;
    private double precio;
    private String[] fotografias;
    private int numero_cooperativista;

//Constructores

    public Articulo(int numero_articulo, String categoria, String nombre, String descripcion, double precio, String[] fotografias, int numero_cooperativista) {
        this.numero_articulo = numero_articulo;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fotografias = fotografias;
        this.numero_cooperativista = numero_cooperativista;
    }

    public Articulo( ) {
        this.numero_articulo = -1;
        this.categoria = "categoria";
        this.nombre = "nombre";
        this.descripcion = "descripcion";
        this.precio = -1.0;
        this.fotografias = new String[]{"fotografia01", "fotografias02", "fotografias03"};
        this.numero_cooperativista = -1;
    }

    //Getters & Setters
    public int getNumero_articulo() {
        return numero_articulo;
    }

    public void setNumero_articulo(int numero_articulo) {
        this.numero_articulo = numero_articulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Array getFotografias() {
        return fotografias;
    }

    public void setFotografias(Array fotografias) {
        this.fotografias = fotografias;
    }

    public int getNumero_cooperativista() {
        return numero_cooperativista;
    }

    public void setNumero_cooperativista(int numero_cooperativista) {
        this.numero_cooperativista = numero_cooperativista;
    }

//ToString

    @Override
    public String toString() {
        return "Articulo: " +
                "numero_articulo: " + numero_articulo +
                ", categoria: '" + categoria + '\'' +
                ", nombre: '" + nombre + '\'' +
                ", descripcion: '" + descripcion + '\'' +
                ", precio: " + precio +
                ", fotografias: " + Arrays.toString(fotografias) +
                ", numero_cooperativista: " + numero_cooperativista;
    }
}




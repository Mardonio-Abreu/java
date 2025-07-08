package club.vinilos.model;

import club.vinilos.model.Cooperativista;

import jakarta.persistence.*;

@Entity
@Table (name = "articulos")
public class Articulo {

       private int numeroArticulo;
    private String categoria;
    private String nombre;
    private String descripcion;
    private int precio;
    private String fotografias;
    private int numeroCooperativista;

    public Articulo() {
    }

    public Articulo(int numeroArticulo, int numeroCooperativista, String categoria, String nombre, String descripcion, int precio, String fotografias) {
        this.numeroArticulo = numeroArticulo;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fotografias = fotografias;
        this.numeroCooperativista = numeroCooperativista;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getNumeroArticulo() {
        return numeroArticulo;
    }

    public void setNumeroArticulo(int numeroArticulo) {
        this.numeroArticulo = numeroArticulo;
    }

    @Column(name = "numero_cooperativista", length = 100)
    public int getNumeroCooperativista() {
        return numeroCooperativista;
    }

    public void setNumeroCooperativista(int numeroCooperativista) {
        this.numeroCooperativista = numeroCooperativista;
    }

    @Column (name = "categoria",  length = 100)
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Column (name = "nombre", length = 100)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column (name = "descripcion", length = 100)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Column (name = "precio",  length = 10)
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Column (name = "fotografias", length = 50)
    public String getFotografias() {
        return fotografias;
    }

    public void setFotografias(String imagenes) {
        this.fotografias = imagenes;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "numeroArticulo=" + numeroArticulo +
                ", categoria='" + categoria + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", fotografias='" + fotografias + '\'' +
                '}';
    }
}

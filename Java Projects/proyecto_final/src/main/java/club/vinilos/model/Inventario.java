package club.vinilos.model;

import club.vinilos.model.Articulo;

import jakarta.persistence.*;

    @Entity
    @Table (name = "inventario")
    public class Inventario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int numeroInventario;

        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn (name = "numero_articulo")
        private Articulo articulo;

        @Column (name = "articulos_disponibles")
        private int articulosDisponibles;

        private int numeroArticulo;

        public Inventario() {
        }

        public Inventario(int numeroInventario, Articulo articulo, int articulosDisponibles) {
            this.numeroInventario = numeroInventario;
            this.articulo = articulo;
            this.articulosDisponibles = articulosDisponibles;
            this.numeroArticulo = articulo.getNumeroArticulo();
        }

        public int getNumeroInventario() {
            return numeroInventario;
        }

        public void setNumeroInventario(int numeroInventario) {
            this.numeroInventario = numeroInventario;
        }

        public int getNumeroArticulo() {
            return numeroArticulo;
        }

        public void setNumeroArticulo(int numeroArticulo) {
            this.numeroArticulo = numeroArticulo;
        }

        public int getArticulosDisponibles() {
            return articulosDisponibles;
        }

        public void setArticulosDisponibles(int articulosDisponibles) {
            this.articulosDisponibles = articulosDisponibles;
        }

        public Articulo getArticulo() {
            return articulo;
        }

        public void setArticulo(Articulo articulo) {
            this.articulo = articulo;
        }
    }

public class Casa extends Inmueble {
    private boolean jardin;
    private boolean alberca;

    //Constructor
    public Casa(int userID, String direccion, int precio, String color, boolean jardin, boolean alberca) {
        super(userID, direccion, precio, color);
        this.jardin = jardin;
        this.alberca = alberca;
    }

    //Setters & getters
    public boolean isJardin() {
        return jardin;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    public boolean isAlberca() {
        return alberca;
    }

    public void setAlberca(boolean alberca) {
        this.alberca = alberca;
    }

    //toString
    @Override
    public String toString() {
        return "Casa {" +
                "jardin=" + jardin +
                ", alberca=" + alberca +
                "} " + super.toString();
    }


}

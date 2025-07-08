public class Cliente {

    //Datos del cliente
    String name;
    String email;
    String gender;
    String phoneNumber;
    int age;


    //Constructor
    private Cliente (String name, String email, String gender, String phoneNumber, int age) {

        this.name = name;
        this.email = email;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    //Getters
    public String getName () {
        return name;
    }

    public String getEmail () {
        return email;
    }

    public String getGender () {
        return gender;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public int getAge () {
        return age;
    }

    //Setters
    public String setName (String name) {
        this.name = name;
        return "name updated";
    }

    public String setEmail (String email) {
        this.email = email;
        return "email updated";
    }

    public String setGender (String gender) {
        this.gender = gender;
        return "gender updated";
    }

    public String setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return "phoneNumber updated";
    }

    public String setAge (int age) {
        this.age = age;
        return "age updated";
    }

    //Methods
    public void datosCliente () {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
        System.out.println(this.phoneNumber);
        System.out.println(this.email);
    }

    public static void main (String[] args) {

        Cliente nuevoCliente = new Cliente("Joe", "joe@correo.mx", "masculino", "55258745", 27);

        nuevoCliente.datosCliente();

        nuevoCliente.setName("Joe Jhons");
        nuevoCliente.setAge(30);

        System.out.println(nuevoCliente.getName());
        System.out.println(nuevoCliente.getAge());

        nuevoCliente.datosCliente();

        Cliente[] nuevosClientes = new Cliente[3];

        nuevosClientes[0] = new Cliente("Joe", "joe@correo.mx", "masculino", "55258745", 27);
        nuevosClientes[1] = new Cliente("Joe", "bob@correo.mx", "masculino", "55258746", 28);
        nuevosClientes[2] = new Cliente("Joe", "carlos@correo.mx", "masculino", "55258747", 29);

        System.out.println(nuevosClientes[1].setName("Bob"));
        System.out.println(nuevosClientes[2].setName("Carlos"));

        for (int i = 0; i < 3; i++) {
            nuevosClientes[i].datosCliente();
        }

    }
}

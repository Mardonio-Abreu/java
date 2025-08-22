package edu.unam.agenda.model;

import jakarta.persistence.*;


@Entity
@Table(name = "contact")
public class Contact {
    private String name;
    private String last_name;
    private int age;
    private String address;
    private int contact_type_id;
    private int contact_id;


    public Contact() {
    }
    public Contact(String name, String last_name, int age, String address, int contact_type_id, int contact_id) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
        this.address = address;
        this.contact_type_id = contact_type_id;
        this.contact_id = contact_id;
    }

    public void setContact_id(int contact_id) {
        this.contact_id = contact_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getContact_id() {
        return contact_id;
    }

    @Column (name = "name", length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column ( name = "last_name", length = 200 )
    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Column ( name = "age", length = 50 )
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column ( name = "address", length = 200 )
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column ( name = "contact_type_id")
    public int getContact_type_id() {
        return contact_type_id;
    }

    public void setContact_type_id(int contact_type_id) {
        this.contact_type_id = contact_type_id;
    }

    @Override
    public String toString() {
        return "Contact         {" +
                "name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", contact_type_id=" + contact_type_id +
                ", contact_id=" + contact_id +
                '}';
    }
}

package edu.unam.agenda.model;

import jakarta.persistence.*;

@Entity
@Table ( name = "contact_type")
public class ContactType {
    private String name;
    private String status;
    private int contact_type_id;


    public ContactType() {
    }

    public ContactType(String name, String status, int contact_type_id) {
        this.name = name;
        this.status = status;
        this.contact_type_id = contact_type_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getContact_type_id() {
        return contact_type_id;
    }

    public void setContact_type_id(int contact_type_id) {
        this.contact_type_id = contact_type_id;
    }

    @Column ( name = "name", length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column (name = "status", length = 50)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ContactType     " +
                "{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", contact_type_id=" + contact_type_id +
                '}';
    }
}

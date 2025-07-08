package edu.unam.agenda.model;

import jakarta.persistence.*;

@Entity
@Table (name = "means_contact")
public class MeansContact {
    private String value;
    private int contact_id;
    private int phone_type_id;
    private int means_contact_id;


    public MeansContact() {
    }

    public MeansContact(String value, int contact_id, int phone_type_id, int means_contact_id) {
        this.value = value;
        this.contact_id = contact_id;
        this.phone_type_id = phone_type_id;
        this.means_contact_id = means_contact_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMeans_contact_id() {
        return means_contact_id;
    }

    public void setMeans_contact_id(int means_contact_id) {
        this.means_contact_id = means_contact_id;
    }

    @Column (name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Column (name = "contact_id")
    public int getContact_id() {
        return contact_id;
    }

    public void setContact_id(int contact_id) {
        this.contact_id = contact_id;
    }

    @Column (name = "phone_type_id")
    public int getPhone_type_id() {
        return phone_type_id;
    }

    public void setPhone_type_id(int phone_type_id) {
        this.phone_type_id = phone_type_id;
    }

    @Override
    public String toString() {
        return "MeansContact {" +
                "value='" + value + '\'' +
                ", contact_id=" + contact_id +
                ", phone_type_id=" + phone_type_id +
                ", means_contact=" + means_contact_id +
                '}';
    }
}

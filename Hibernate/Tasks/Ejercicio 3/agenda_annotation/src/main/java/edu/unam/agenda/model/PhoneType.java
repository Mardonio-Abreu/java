package edu.unam.agenda.model;

import jakarta.persistence.*;

@Entity
@Table (name = "phone_type")
public class PhoneType {
    private String name;
    private String status;
    private int phone_type_id;


    public PhoneType() {
    }

    public PhoneType(String name, String status, int phone_type_id) {
        this.name = name;
        this.status = status;
        this.phone_type_id = phone_type_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getPhone_type_id() {
        return phone_type_id;
    }

    public void setPhone_type_id(int phone_type_id) {
        this.phone_type_id = phone_type_id;
    }

    @Column (name = "name", length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column (name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PhoneType {" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", phone_type_id=" + phone_type_id +
                '}';
    }
}

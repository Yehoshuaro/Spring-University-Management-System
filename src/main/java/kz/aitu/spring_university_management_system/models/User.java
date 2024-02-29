package kz.aitu.spring_university_management_system.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "//name of the tables")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private boolean gender;
    private int age;
    private String password;
    public User(String name, String surname, int age, String password, int id, boolean gender){
        this.name = name;
        this.surname = surname;
        this.age = this.age;
        this.password = password;
        this.id = this.id;
        this.gender = gender;
    }

    public User() {

    }
}

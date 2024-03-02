package kz.aitu.spring_university_management_system.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="student_table")
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;
    private String student_name;
    private String student_surname;
    private double gpa;
    private int attendance;
    private boolean retake;
    public final double scholarship = 41898.00;
    public final double increased_scholarship = 48_000.00;



}

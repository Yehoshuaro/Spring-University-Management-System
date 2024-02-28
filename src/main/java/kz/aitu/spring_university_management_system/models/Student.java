package kz.aitu.spring_university_management_system.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="student_table")
public class Student extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private double gpa;
    private int attendance;
    private int percentage = 70;
    private boolean retake;
    public final double Scholarship = 41898.00;
    public final double IncreasedScholarship = 48000.00;



}

package kz.aitu.spring_university_management_system.services.interfaces;

import kz.aitu.spring_university_management_system.models.Student;

import java.util.List;

public interface StudentServiceInterface {
    List<Student> getAllStudent(); // to get all students
    Student getStudentByID(int studentId);
    boolean DeadSouls(int studentId); // To check if Attendance less than 70% and show if u have a retake or no
    double Hungergames(int studentId); // to check if the student has a Scholarship,
                                            // IncreasedScholarship or No Scholarship
    double GPA(int studentId); // to get GPA of a student
    Student add(Student student);
}

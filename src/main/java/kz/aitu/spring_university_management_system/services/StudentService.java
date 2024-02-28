package kz.aitu.spring_university_management_system.services;

import kz.aitu.spring_university_management_system.models.Student;
import kz.aitu.spring_university_management_system.repositories.StudentRepositoryInterface;
import kz.aitu.spring_university_management_system.services.interfaces.StudentServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentServiceInterface {
    private final StudentRepositoryInterface repo;

    public StudentService(StudentRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Student> getAllStudent() {
        return repo.findAll();
    }

    @Override
    public boolean DeadSouls(int studentId) {
        Student student = repo.findById(studentId).orElse(null);
        if(student != null && student.getAttendance() < student.getPercentage()){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public double Hungergames(int studentId) {
        Student student = repo.findById(studentId).orElse(null);
        if(student != null && DeadSouls(studentId)){
            return 0.0;
        }
        else{
            double gpa;
            if(student != null) {gpa = student.getGpa();}

            else{gpa = 0.0;}

            if(gpa >= 2.67 && gpa < 3.67){return student.getScholarship();}

            else if (gpa >= 3.67 && gpa < 4.0) {return student.getIncreasedScholarship();}

            else{return 0.0;}
        }
    }

    @Override
    public double GPA(int studentId) {
        Student student = repo.findById(studentId).orElse(null);
        return student != null ? student.getGpa() : 0.0;
    }




}

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
    public Student getStudentByID(int student_id) {
        return repo.findById(student_id).orElse(null);
    }

    @Override
    public boolean DeadSouls(int student_id) {
        Student student = repo.findById(student_id).orElse(null);
        if((student != null) && (student.getAttendance() < 70))
            return true;
        return false;

    }
    @Override
    public double Hungergames(int student_id) {
        Student student = repo.findById(student_id).orElse(null);
        if(student != null && DeadSouls(student_id)){
            return 0.0;
        }
        else{
            double gpa;
            if(student != null) {gpa = student.getGpa();}

            else{gpa = 0.0;}

            if(gpa >= 2.67 && gpa < 3.67){return student.getScholarship();}

            else if (gpa >= 3.67 && gpa < 4.0) {return student.getIncreased_scholarship();}

            else{return 0.0;}
        }
    }

    @Override
    public double GPA(int student_id) {
        Student student = repo.findById(student_id).orElse(null);
        return student != null ? student.getGpa() : 0.0;
    }

    @Override
    public Student add(Student student) {
        return repo.save(student);
    }
}

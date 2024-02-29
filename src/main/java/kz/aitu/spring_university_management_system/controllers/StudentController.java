package kz.aitu.spring_university_management_system.controllers;

import kz.aitu.spring_university_management_system.models.Student;
import kz.aitu.spring_university_management_system.services.interfaces.StudentServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student_table")
public class StudentController {
    private final StudentServiceInterface service;
    public StudentController(StudentServiceInterface service) {
        this.service = service;
    }
    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        return service.getAllStudent();
    }
    @GetMapping("/students/{studentId}/deadSouls")
    public boolean DeadSouls(@PathVariable int studentId) {
        return service.DeadSouls(studentId);
    }

    @GetMapping("/students/{studentId}/hungergames")
    public double getHungergames(@PathVariable int studentId) {
        return service.Hungergames(studentId);
    }
    @GetMapping("/students/{studentId}/gpa")
    public double getGPA(@PathVariable int studentId){
        return service.GPA(studentId);
    }

}

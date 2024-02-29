package kz.aitu.spring_university_management_system.controllers;

import kz.aitu.spring_university_management_system.models.Student;
import kz.aitu.spring_university_management_system.services.interfaces.StudentServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable("studentId") int studentId){
        Student student = service.getStudentByID(studentId);
        if(student != null)
            return new ResponseEntity<>(HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/students/{studentId}/hungergames")
    public double getHungergames(@PathVariable int studentId) {
        return service.Hungergames(studentId);
    }
    @GetMapping("/students/{studentId}/gpa")
    public double getGPA(@PathVariable int studentId){
        return service.GPA(studentId);
    }

    @PostMapping("/add")
    public ResponseEntity<Student> add(@RequestBody Student student){
        Student addStudent = service.add(student);
        if(addStudent != null)
            return new ResponseEntity<>(HttpStatus.CREATED);
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}

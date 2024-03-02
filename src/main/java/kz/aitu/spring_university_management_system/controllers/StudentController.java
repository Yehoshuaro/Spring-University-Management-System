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
    public List<Student> getAllStudents(){
        return service.getAllStudent();
    }
    @GetMapping("/students/{student_id}/deadSouls")
    public boolean DeadSouls(@PathVariable int student_id) {
        return service.DeadSouls(student_id);
    }
    @GetMapping("/{student_id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("student_id") int student_id){
        Student student = service.getStudentByID(student_id);
        if(student != null)
            return new ResponseEntity<>(HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/students/{studentId}/hungergames")
    public double getHungergames(@PathVariable int student_id) {
        return service.Hungergames(student_id);
    }
    @GetMapping("/students/{studentId}/gpa")
    public double getGPA(@PathVariable int student_id){
        return service.GPA(student_id);
    }

    @PostMapping("/add")
    public ResponseEntity<Student> add(@RequestBody Student student){
        Student addStudent = service.add(student);
        if(addStudent != null)
            return new ResponseEntity<>(HttpStatus.CREATED);
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}

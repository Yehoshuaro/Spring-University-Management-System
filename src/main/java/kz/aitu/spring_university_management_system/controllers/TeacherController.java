package kz.aitu.spring_university_management_system.controllers;
import kz.aitu.spring_university_management_system.models.Teacher;
import kz.aitu.spring_university_management_system.services.interfaces.TeacherServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("teacher_table")
public class TeacherController {
    private final TeacherServiceInterface service;
    public TeacherController(TeacherServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/teacher_table/getCurrentTeacher")
    public List<Teacher> getCurrentTeacher() {
        // Возвращает текущего учителя из сервиса
        return service.getCurrentTeacher();
    }
    @GetMapping("/teacher_table/{teacher_id}")
    public ResponseEntity<Teacher> currentTeacherById(@PathVariable("teacher_id") int teacher_id){
        Teacher teacher = service.currentTeacherById(teacher_id);
        if(teacher != null)
            return new ResponseEntity<>(teacher,HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

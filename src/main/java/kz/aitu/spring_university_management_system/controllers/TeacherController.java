//package kz.aitu.spring_university_management_system.controllers;
//
//import kz.aitu.spring_university_management_system.models.Teacher;
//import kz.aitu.spring_university_management_system.services.TeacherService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//@Controller
//@RequestMapping("/teacher")
////@SessionAttributes("teacher")
//public class TeacherController {
//
//    private final TeacherService teacherService;
//
//    @Autowired
//    public TeacherController(TeacherService teacherService) {
//        this.teacherService = teacherService;
//    }
//
//    @ModelAttribute("teacher")
//    public Teacher getTeacher() {
//        // Возвращает текущего учителя из сервиса
//        return teacherService.getCurrentTeacher();
//    }
//
//    @GetMapping("/operations")
//    public String teacherOperations(Model model) {
//        return "teacher/operations";
//    }
//
//    @GetMapping("/courseInformation")
//    public String viewCourseInformation(Model model) {
//        Teacher currentTeacher = teacherService.getCurrentTeacher();
//        model.addAttribute("course", currentTeacher.getCourse());
//        return "teacher/courseInformation";
//    }
//
//    @PostMapping("/updateCourse")
//    public String updateCourseInformation(@RequestParam String newCourse) {
//        teacherService.updateCourse(newCourse);
//        return "redirect:/teacher/operations";
//    }
//
//    @PostMapping("/addAssignment")
//    public String addAssignment(@RequestParam String title,
//                                @RequestParam String description,
//                                @RequestParam String dueDate) {
//        teacherService.addAssignment(title, description, dueDate);
//        return "redirect:/teacher/operations";
//    }
//
//    @PostMapping("/gradeAssignment")
//    public String gradeAssignment(@RequestParam int studentScore, Model model) {
//        char grade = teacherService.calculateGrade(studentScore);
//        model.addAttribute("grade", grade);
//        return "teacher/gradeAssignment";
//    }
//}

package kz.aitu.spring_university_management_system.services;

import kz.aitu.spring_university_management_system.models.Teacher;
import kz.aitu.spring_university_management_system.repositories.TeacherRepositoryInterface;
import kz.aitu.spring_university_management_system.services.interfaces.TeacherServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService implements TeacherServiceInterface {

    private final TeacherRepositoryInterface repo;

    public TeacherService(TeacherRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Teacher> getCurrentTeacher() {
        return repo.findAll();
    }

    @Override
    public Teacher currentTeacherById(int teacher_id) {
        return repo.findById(teacher_id).orElse(null);
    }

//    public void updateCourse(String newCourse) {
//        currentTeacher.setCourse(newCourse);
//    }
//
//    public void addAssignment(String title, String description, String dueDate) {
//        Assignment assignment = new Assignment(title, description, dueDate);
//        currentTeacher.addAssignment(assignment);
//    }
//
//    public char calculateGrade(int studentScore) {
//
//        if (studentScore >= 90) {
//            return 'A';
//        } else if (studentScore >= 80) {
//            return 'B';
//        } else if (studentScore >= 70) {
//            return 'C';
//        } else if (studentScore >= 60) {
//            return 'D';
//        } else {
//            return 'F';
//        }
//    }
}

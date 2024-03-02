package kz.aitu.spring_university_management_system.services;

import kz.aitu.spring_university_management_system.models.Assignment;
import kz.aitu.spring_university_management_system.models.Teacher;
import kz.aitu.spring_university_management_system.services.interfaces.TeacherServiceInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService implements TeacherServiceInterface {


    private Teacher currentTeacher;

    @Override
    public Teacher getCurrentTeacher() {
        return currentTeacher;
    }

    @Override
    public void setCurrentTeacher(Teacher teacher) {
        this.currentTeacher = teacher;
    }

    @Override
    public void updateCourse(String newCourse) {
        if (currentTeacher != null) {
            currentTeacher.setCourse(newCourse);
        }
    }

    @Override
    public void addAssignment(String title, String description, String dueDate) {
        if (currentTeacher != null) {
            Assignment assignment = new Assignment(title, description, dueDate);
            currentTeacher.addAssignment(assignment);
        }
    }

    @Override
    public char calculateGrade(int studentScore) {
        if (studentScore >= 90) {
            return 'A';
        } else if (studentScore >= 80) {
            return 'B';
        } else if (studentScore >= 70) {
            return 'C';
        } else if (studentScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

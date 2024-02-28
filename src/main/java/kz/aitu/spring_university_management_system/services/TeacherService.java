package kz.aitu.spring_university_management_system.services;

import kz.aitu.spring_university_management_system.models.Assignment;
import kz.aitu.spring_university_management_system.models.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {

    private Teacher currentTeacher;

    public Teacher getCurrentTeacher() {
        return currentTeacher;
    }

    public void setCurrentTeacher(Teacher teacher) {
        this.currentTeacher = teacher;
    }

    public void updateCourse(String newCourse) {
        currentTeacher.setCourse(newCourse);
    }

    public void addAssignment(String title, String description, String dueDate) {
        // Создаем новое задание
        Assignment assignment = new Assignment(title, description, dueDate);
        // Добавляем задание в список заданий текущего учителя
        currentTeacher.addAssignment(assignment);
    }

    public char calculateGrade(int studentScore) {
        // Пример простой логики выставления оценки
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

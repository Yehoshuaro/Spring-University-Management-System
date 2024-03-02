package kz.aitu.spring_university_management_system.services;

import kz.aitu.spring_university_management_system.models.Assignment;
import kz.aitu.spring_university_management_system.models.Teacher;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;


@Setter
@Getter
@Service
public class TeacherService {
    private Teacher currentTeacher;

    public void updateCourse(String newCourse) {
        currentTeacher.setCourse(newCourse);
    }

    public void addAssignment(String title, String description, String dueDate) {
        Assignment assignment = new Assignment(title, description, dueDate);
        currentTeacher.addAssignment(assignment);
    }

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

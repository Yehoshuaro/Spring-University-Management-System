package kz.aitu.spring_university_management_system.services.interfaces;

import kz.aitu.spring_university_management_system.models.Teacher;

import java.util.List;

public interface TeacherServiceInterface {
    List<Teacher> getCurrentTeacher();
    Teacher currentTeacherById(int teacher_id);
}

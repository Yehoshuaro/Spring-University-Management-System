package kz.aitu.spring_university_management_system.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Teacher extends User {
    private String course;

    public Teacher(String name, String surname, int age, String course, String password, boolean gender, int id) {
        super(name, surname, age, password, id, gender);
        setCourse(course);
    }
}
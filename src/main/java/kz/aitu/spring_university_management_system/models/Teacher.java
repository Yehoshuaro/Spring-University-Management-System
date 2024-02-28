package kz.aitu.spring_university_management_system.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Teacher extends User {

    private String course;
    private List<Assignment> assignments;

    public Teacher(String name, String surname, int age, String course, String password, boolean gender, int id) {
        super(name, surname, age, password, id, gender);
        this.course = course;
        this.assignments = new ArrayList<>();
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }
}

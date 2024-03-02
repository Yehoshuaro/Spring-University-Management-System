//package kz.aitu.spring_university_management_system.models;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Getter
//@Setter
//@NoArgsConstructor
//public class Teacher extends User {
//
//    private String course;
//    private List<Assignment> assignments;
//
//    public Teacher(String name, String surname, int age, String course, String password, boolean gender) {
//        super(name, surname, age, password, gender);
//        this.course = course;
//        this.assignments = new ArrayList<>();
//    }
//
//    public void addAssignment(Assignment assignment) {
//        assignments.add(assignment);
//    }
//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("Teacher Details:\n");
//        stringBuilder.append("Name: ").append(getName()).append("\n");
//        stringBuilder.append("Surname: ").append(getSurname()).append("\n");
//        stringBuilder.append("Age: ").append(getAge()).append("\n");
//        stringBuilder.append("Course: ").append(course).append("\n");
//        stringBuilder.append("Assignments:\n");
//
//        for (Assignment assignment : assignments) {
//            stringBuilder.append("- Title: ").append(assignment.getTitle())
//                    .append(", Description: ").append(assignment.getDescription())
//                    .append(", Due Date: ").append(assignment.getDueDate())
//                    .append("\n");
//        }
//        return stringBuilder.toString();
//    }
//}

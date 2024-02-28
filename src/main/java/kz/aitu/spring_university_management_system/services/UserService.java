package kz.aitu.spring_university_management_system.services;
import kz.aitu.spring_university_management_system.models.Teacher;
import kz.aitu.spring_university_management_system.models.User;
import kz.aitu.spring_university_management_system.repositories.UserRepositoryInterface;
import kz.aitu.spring_university_management_system.services.interfaces.UserServiceInterface;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;
import java.util.List;
@Service

public class UserService implements UserServiceInterface {

    private final UserRepositoryInterface repo;
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public UserService(UserRepositoryInterface repo, JdbcTemplate jdbcTemplate) {
        this.repo = repo;
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<User> getAll() {
        return repo.findAll();
    }

    @Override
    public User getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public User create(User user) {
        return repo.save(user);
    }

    @Override
    public List<User> getBySurname(String surname) {
        return repo.findBySurname(surname);
    }

    public void registerUser() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter Surname:");
            String surname = scanner.nextLine();

            System.out.println("Enter Name:");
            String name = scanner.nextLine();

            System.out.println("Enter Password:");
            String password = scanner.nextLine();

            System.out.println("Enter Age:");
            int age = scanner.nextInt();

            System.out.println("Enter Gender: ");
            boolean gender = scanner.nextBoolean();

            System.out.println("Enter Position (false for Student, true for Teacher):");
            boolean position = scanner.nextBoolean();

            scanner.close();

            String sql = "INSERT INTO user_table (name, surname, password, gender, age, position, groups) VALUES (?, ?, ?, ?, ?, ?, ?)";
            jdbcTemplate.update(sql, name, surname, password, gender, age, position, position);

            System.out.println("User registered successfully!");

            if (position) {
                // Teacher
                System.out.println("You registered as a Teacher ");
                System.out.println("Enter Course:");
                String course = scanner.next();
                Teacher teacher = new Teacher(name, surname, age, course, password, gender, 0);
                System.out.println("Enter teacher operation");
                teacher.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

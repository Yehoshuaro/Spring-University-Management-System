package kz.aitu.spring_university_management_system.services;
//import kz.aitu.spring_university_management_system.models.Teacher;
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

    public UserService(UserRepositoryInterface repo) {
        this.repo = repo;
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


}

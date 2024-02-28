package kz.aitu.spring_university_management_system.services.interfaces;

import kz.aitu.spring_university_management_system.models.User;

import java.util.List;

public interface UserServiceInterface {
    List<User> getAll();
    User getById(int id);
    User create(User user);
    List<User> getBySurname(String surname);

}
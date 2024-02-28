package kz.aitu.spring_university_management_system.repositories;

import kz.aitu.spring_university_management_system.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepositoryInterface extends JpaRepository<User,Integer> {
    List<User> findBySurname(String surname);
}

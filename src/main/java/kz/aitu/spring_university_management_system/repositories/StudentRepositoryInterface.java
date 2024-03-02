package kz.aitu.spring_university_management_system.repositories;

import kz.aitu.spring_university_management_system.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface StudentRepositoryInterface extends JpaRepository<Student, Integer>{
    //List<Student> FindStudentBySurname(String surname);

}

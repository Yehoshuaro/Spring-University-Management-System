package kz.aitu.spring_university_management_system.repositories;
import kz.aitu.spring_university_management_system.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepositoryInterface extends JpaRepository<Teacher, Integer>{
}

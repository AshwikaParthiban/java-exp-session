package Myproject.SpringBoot;
import Myproject.SpringBoot.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository
        <Student, Long> {
}

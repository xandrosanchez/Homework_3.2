package ru.hogwarts.school.repositorise;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
}

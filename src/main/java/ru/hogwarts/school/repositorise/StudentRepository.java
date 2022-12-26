package ru.hogwarts.school.repositorise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;

import java.util.Collection;

public interface StudentRepository extends JpaRepository<Student,Long> {

    Collection<Student> findByAge(int age);
    Collection<Student> findAllByAgeBetween(int age1, int age2);

    Collection<Student> findAllByFaculty_Id(long faculty_id);

}

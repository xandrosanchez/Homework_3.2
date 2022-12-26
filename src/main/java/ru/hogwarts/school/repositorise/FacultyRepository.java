package ru.hogwarts.school.repositorise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;

import java.util.Collection;
public interface FacultyRepository extends JpaRepository<Faculty,Long> {

    Collection<Faculty> findFacultiesByColor(String color);
    Collection<Faculty> findAllByColorIgnoreCaseOrNameIgnoreCase(String color,String name);

}

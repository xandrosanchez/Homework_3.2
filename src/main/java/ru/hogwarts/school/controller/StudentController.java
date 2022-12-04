package ru.hogwarts.school.controller;

import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.FacultyService;
import ru.hogwarts.school.service.StudentService;

import java.util.Collection;

@RestController
@RequestMapping("/student/")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("{ID}")
    public Student getStudent(@PathVariable Long ID) {
        return studentService.getStudent(ID);
    }

    @PostMapping
    public Student createStudent(String name, int age) {
        return studentService.createStudent(name, age);
    }

    @PutMapping
    public Student updateStudent(long ID, String name, int age) {
        return studentService.updateStudent(ID, name, age);
    }

    @DeleteMapping
    public Student deleteFaculty(long ID) {
        return studentService.deleteStudent(ID);
    }

    @GetMapping("{age}")
    public Collection<Student> getFilterStudents(@PathVariable int age){
        return studentService.getFilterStudent(age);
    }
}

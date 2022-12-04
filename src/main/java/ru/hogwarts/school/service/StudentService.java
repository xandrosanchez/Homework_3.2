package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Student;

import java.util.*;

@Service
public class StudentService {

    private long ID = 0;
    private final Map<Long, Student> studentMap = new HashMap<>();

    public Student createStudent(String name, int age) {
        Student student = new Student(ID, name, age);
        studentMap.put(ID, student);
        ID++;
        return student;
    }

    public Student getStudent(long ID) {
        return studentMap.get(ID);
    }

    public Student updateStudent(long ID, String name, int age) {
        Student student = new Student(ID, name, age);
        studentMap.put(ID, student);
        return student;
    }

    public Student deleteStudent(long ID) {
        return studentMap.remove(ID);
    }

    public Collection<Student> getFilterStudent(int age) {
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < studentMap.size(); i++) {
            if (studentMap.get(i).getAge() == age) {
                studentList.add(studentMap.get(i));
            }
        }
        return studentList;
    }
}

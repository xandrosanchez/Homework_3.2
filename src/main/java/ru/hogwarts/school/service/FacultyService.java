package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;

import java.util.*;

@Service
public class FacultyService {

    private long ID = 0;
    private final Map<Long, Faculty> facultyMap = new HashMap<>();

    public Faculty createFaculty(String name, String color) {
        Faculty faculty = new Faculty(ID, name, color);
        facultyMap.put(ID, faculty);
        ID++;
        return faculty;
    }

    public Faculty getFaculty(long ID) {
        return facultyMap.get(ID);
    }

    public Faculty updateFaculty(long ID, String name, String color) {
        Faculty faculty = new Faculty(ID, name, color);
        facultyMap.put(ID, faculty);
        return faculty;
    }

    public Faculty deleteFaculty(long ID) {
        return facultyMap.remove(ID);
    }

    public Collection<Faculty> getFacultyFilter(String color) {
        List<Faculty> facultyList = new ArrayList<>();
        for (int i = 0; i < facultyMap.size(); i++) {
            if (Objects.equals(facultyMap.get(i).getColor(), color)) {
                facultyList.add(facultyMap.get(i));
            }
        }
        return facultyList;
    }
}

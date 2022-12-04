package ru.hogwarts.school.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.service.FacultyService;

import java.util.Collection;

@RestController
@RequestMapping("/faculty/")
public class FacultyController {

    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @GetMapping("{ID}")
    public Faculty getFaculty(@PathVariable Long ID) {
        return facultyService.getFaculty(ID);
    }

    @PostMapping
    public Faculty createFaculty(String name,String color){
        return facultyService.createFaculty(name,color);
    }

    @PutMapping
    public Faculty updateFaculty(long ID,String name, String color){
        return facultyService.updateFaculty(ID,name,color);
    }

    @DeleteMapping
    public Faculty deleteFaculty(long ID){
        return facultyService.deleteFaculty(ID);
    }

    @GetMapping
    public Collection<Faculty> getFilterFaculties(@PathVariable String color){
        return facultyService.getFacultyFilter(color);
    }
}

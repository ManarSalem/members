package com.example.address.endpoints.controller;


import com.example.address.entity.Course;
import com.example.address.repo.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("course")
public class CourseController {

    private final CoursesRepository coursesRepository;

    @Autowired
    public CourseController(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    @GetMapping("/all")
    public List<Course> getAllCourses(){
        return coursesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Course> getCourse(@PathVariable("id") Integer id){
        return coursesRepository.findById(id);
    }

    @PostMapping()
    public Course addCourse(@RequestBody  Course course){


        return coursesRepository.save(course);
    }

   // public Course update
}

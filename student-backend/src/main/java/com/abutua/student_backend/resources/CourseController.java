package com.abutua.student_backend.resources;

import java.util.Arrays;
import java.util.List;

import com.abutua.student_backend.models.Course;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@CrossOrigin
public class CourseController {

    private List<Course> listCourses = Arrays.asList(
        new Course(1, "Python"),
        new Course(2, "Java"),
        new Course(3, "Rubi")
    );

    @GetMapping("courses/{id}")
    public ResponseEntity<Course> getCourse(@PathVariable int id) {

        Course course = listCourses.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Course not found!"));

        return ResponseEntity.ok(course);
    }

    @GetMapping("courses")
    public List<Course> getCourses() {
        return listCourses;
    }
}

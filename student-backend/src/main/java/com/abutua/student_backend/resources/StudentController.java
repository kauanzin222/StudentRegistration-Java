package com.abutua.student_backend.resources;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.abutua.student_backend.models.Student;

public class StudentController {

    private List<Student> listStudents = new ArrayList<>();

    // cadastrar um novo estudante
    @PostMapping("students") // ao acessar esse caminho com objetivo de POST, faça:

    // RequestBody serve para requisitar um conteúdo ao fazer o método POST
    public ResponseEntity<Student> save(@RequestBody Student student) {
        student.setId(listStudents.size() + 1);
        listStudents.add(student);

        // cria uma localização
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(student.getId())
                .toUri();

        return ResponseEntity.created(location).body(student);
    }

    @GetMapping("students/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable int id) {

        Student student = listStudents.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Student not found!"));

        return ResponseEntity.ok(student);
    }

    @GetMapping("students")
    public List<Student> getStudents() {
        return listStudents;
    }
}

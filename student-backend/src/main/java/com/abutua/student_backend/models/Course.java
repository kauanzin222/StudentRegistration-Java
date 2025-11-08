package com.abutua.student_backend.models;

public class Course {

    private int id;
    private String name;

    // constructor method
    public Course(int id, String name) {
        System.out.println("Construindo um curso!");

        this.id = id;
        this.name = name;
    } 

    // getting and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

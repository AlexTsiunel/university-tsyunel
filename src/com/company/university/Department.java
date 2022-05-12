package com.company.university;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private static long countId = 1;
    private long id;
    private String name;
    private List<Teacher> teachers;
    private List<Faculty> faculties;

    public Department(long id, String name) {
        this.id = countId++;
        this.name = name;
        teachers = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

}

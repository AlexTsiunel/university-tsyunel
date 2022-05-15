package com.company.university;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private static long countId = 1;
    private Long id;
    private String name;
    private List<Teacher> teachers;
    private Faculty faculty;

    public Department(String name) {
        this.id = countId++;
        this.name = name;
        teachers = new ArrayList<>();
    }

    public Long getId() {
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

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void addTeacherToDepartment(Teacher teacher) {
        if (teacher != null) {
            if (!teachers.contains(teacher)) {
                teachers.add(teacher);
            }
        }
    }
    
    public void deleteTeacherFromDepartment(Teacher teacher) {
        teachers.remove(teacher);
    }
}

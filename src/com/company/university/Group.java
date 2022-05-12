package com.company.university;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private static long countId = 1;
    private long id;
    private String name;
    private Faculty faculty;
    private Teacher curator;
    private List<Student> students;

    public Group(long id, String name, Faculty faculty) {
        this.id = countId++;
        this.name = name;
        this.faculty = faculty;
        students = new ArrayList<>();
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

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Teacher getCurator() {
        return curator;
    }

    public void setCurator(Teacher curator) {
        this.curator = curator;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}

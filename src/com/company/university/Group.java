package com.company.university;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group {
    private static long countId = 1;
    private Long id;
    private String name;
    private Faculty faculty;
    private Teacher curator;
    private List<Student> students;
    private int groupCapacity = 8;

    public Group(String name) {
        this.id = countId++;
        this.name = name;
        students = new ArrayList<>();
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
        curator.setGroup(this);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getCapacity() {
        return groupCapacity;
    }

    public void setCapacity(int capacity) {
        this.groupCapacity = capacity;
    }

    public void addStudent(Student student) {
        if (student != null) {
            if (!students.contains(student) && students.size() < groupCapacity && student.isInGroup() == false)
                students.add(student);
            student.setInGroup(true);
        }
    }

    public void deleteStudent(Student student) {
        students.remove(student);
    }

    public void deleteStudentById(long id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
                student.setInGroup(false);
            }
        }
    }
}

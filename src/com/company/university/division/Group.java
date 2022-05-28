package com.company.university.division;

import java.util.ArrayList;
import java.util.List;

import com.company.university.person.Student;
import com.company.university.person.Teacher;
import com.company.university.util.datastructures.DynamicArray;
import com.company.university.util.datastructures.MyDynamicArray;

public class Group extends DivisionUnit {
    private static long countId = 1;
    private Faculty faculty;
    private Teacher curator;
    private DynamicArray students;
    private int groupCapacity = 8;

    public Group(String name) {
        super(name);
        super.setId(countId++);
        students = new MyDynamicArray();
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
    
    

//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }

    public DynamicArray getStudents() {
        return students;
    }

    public void setStudents(DynamicArray students) {
        this.students = students;
    }

    public int getCapacity() {
        return groupCapacity;
    }

    public void setCapacity(int capacity) {
        this.groupCapacity = capacity;
    }

    @Override
    public String toString() {
        String groupName = (super.getName() == null ? "NOT ASSIGNED" : super.getName());
        String facultyName = (faculty == null ? "NOT ASSIGNED" : faculty.getName());
        String curatorName = (curator == null ? "NOT ASSIGNED" : curator.getFirstName() + " " + curator.getLastName());
        int numberOfStudents = (students == null ? 0 : students.size());

        return String.format(
                "Group name: %s\n   id: %d.\n   faculty name: %s\n   curator name: %s.\n   number of students in a groupe: %d.",
                groupName, super.getId(), facultyName, curatorName, numberOfStudents);
    }
}

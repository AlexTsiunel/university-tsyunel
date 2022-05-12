package com.company.university;

import java.util.List;

public class Faculty {
    private static long countId = 1;
    private long id;
    private String name;
    private Department department;
    private List<Group> groups;

    public Faculty(long id, String name, Department department, List<Group> groups) {
        this.id = countId++;
        this.name = name;
        this.department = department;
        this.groups = groups;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

}

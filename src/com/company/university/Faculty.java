package com.company.university;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private static long countId = 1;
    private Long id;
    private String name;
    private List<Department> departments;
    private List<Group> groups;

    public Faculty(String name) {
        this.id = countId++;
        this.name = name;
        this.groups = new ArrayList<>();
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

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public void addGroupe(Group group) {
        if (group != null) {
            if (!groups.contains(group)) {
                groups.add(group);
            }
        }
    }

    public void deleteGroupe(Group group) {
        if (group != null) {
            groups.remove(group);
        }
    }
    
    public void addDepartment(Department department) {
        if (department != null) {
            if (!departments.contains(department)) {
                departments.add(department);
            }
        }
    }

    public void deleteDepartment(Department department) {
        if (department != null) {
            departments.remove(department);
        }
    }
}

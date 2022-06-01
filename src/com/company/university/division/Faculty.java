package com.company.university.division;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends DivisionUnit {
    private static long countId = 1;
    private List<Department> departments;
    private List<Group> groups;

    public Faculty(String name) {
        super(name);
        super.setId(countId++);
        this.groups = new ArrayList<>();
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

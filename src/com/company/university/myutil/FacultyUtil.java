package com.company.university.myutil;

import com.company.university.division.Department;
import com.company.university.division.Faculty;
import com.company.university.division.Group;

public class FacultyUtil {
    public static void addGroupe(Group group, Faculty faculty) {
        if (group != null && faculty != null) {
            if (!faculty.getGroups().contains(group)) {
                faculty.getGroups().add(group);
            }
        }
    }

    public static void deleteGroupe(Group group, Faculty faculty) {
        if (group != null && faculty != null) {
            faculty.getGroups().remove(group);
        }
    }

    public static void addDepartment(Department department, Faculty faculty) {
        if (department != null && faculty != null) {
            if (!faculty.getDepartments().contains(department)) {
                faculty.getDepartments().add(department);
            }
        }
    }

    public static void deleteDepartment(Department department, Faculty faculty) {
        if (department != null && faculty != null) {
            faculty.getDepartments().remove(department);
        }
    }
}

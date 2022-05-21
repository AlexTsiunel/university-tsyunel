package com.company.university.myutill;

import com.company.university.division.Faculty;
import com.company.university.division.Group;
import com.company.university.person.Student;
import com.company.university.person.Teacher;

public class GroupUtill {

    public static void addFaculty(Faculty faculty, Group group) {
        if (faculty != null && group != null && group.isUsed() == false) {
            group.setFaculty(faculty);
            faculty.getGroups().add(group);
            group.setUsed(true);
        }
    }

    public static void removeFaculty(Group group) {
        if (group != null) {
            Faculty faculty = group.getFaculty();
            if (faculty != null) {
                group.setUsed(true);
                group.setFaculty(null);
            }
        }
    }

    public static void addStudent(Student student, Group groupe) {
        if (student != null && groupe != null && student.isUsed() == false
                && groupe.getStudents().size() < groupe.getCapacity()) {
            groupe.getStudents().add(student);
            student.setUsed(true);
        }
    }

    public static void removeStudent(Student student, Group groupe) {
        if (student != null && groupe != null && groupe.getStudents().contains(student)) {
            groupe.getStudents().remove(student);
            student.setUsed(false);
        }
    }

    public static boolean isContainsStudents(Student student, Group groupe) {
        if (student != null && groupe != null && groupe.getStudents().contains(student)) {
            return true;
        }
        return false;
    }

    public static void addCurator(Teacher teacher, Group groupe) {
        if (teacher != null && groupe != null) {
            groupe.setCurator(teacher);
        }
    }

    public static void removeCurator(Group group) {
        if (group != null) {
            group.setCurator(null);
        }
    }
}

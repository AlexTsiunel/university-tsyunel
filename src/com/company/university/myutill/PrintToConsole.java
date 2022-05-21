package com.company.university.myutill;

import java.util.List;

import com.company.university.division.Department;
import com.company.university.division.Group;
import com.company.university.person.Student;
import com.company.university.person.Teacher;

public class PrintToConsole {

    public static void numberOfStydents(Group group) {
        if (group != null) {
            String groupName = group.getName();
            int numberOfStudents = Calculator.getNumberOfStydents(group);
            String message = String.format("Number of students in a group '%s': %d", groupName, numberOfStudents);
            System.out.println(message);
        }
    }

    public static void averageScoreGroup(Group group) {
        if (group != null) {
            String groupName = group.getName();
            double averageScore = Calculator.averageScoreStudentsOfGroup(group);
            String message = String.format("Average score of students in the group '%s': %.2f", groupName,
                    averageScore);
            System.out.println(message);
        }
    }

    public static void group(Group group, boolean showStudents) {
        if (group != null) {
            System.out.println(group.toString());
        }
        if (showStudents == true && group.getStudents() != null) {
            System.out.println("Group students info:");
            for (Student student : group.getStudents()) {
                System.out.println(student.toString());
            }
        }
    }

    public static void teacher(Teacher teacher) {
        if (teacher != null) {
            System.out.println(teacher.toString());
        }
    }

    public static void department(Department department, boolean showTeachers) {
        if (department != null) {
            System.out.println(department.toString());
            if (showTeachers == true && department.getOrdinaryTeachers() != null) {
                System.out.println("Department teachers info:");
                for (Teacher teacher : department.getOrdinaryTeachers()) {
                    System.out.println(teacher.toString());
                }
            }
        }
        System.out.println();
    }
}

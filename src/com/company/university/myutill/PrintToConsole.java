package com.company.university.myutill;

import java.util.List;

import com.company.university.Group;
import com.company.university.Student;
import com.company.university.Teacher;

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

    public static void group(Group group) {
        if (group != null) {
            System.out.println("Group name: " + group.getName());
            Teacher curator = group.getCurator();
            List<Student> students = group.getStudents();
            if (curator != null)
                System.out.println(curator.toString());
            for (Student student : students) {
                if (student != null)
                    System.out.println(student.toString());
            }
            System.out.println("____________");
        }

    }
}

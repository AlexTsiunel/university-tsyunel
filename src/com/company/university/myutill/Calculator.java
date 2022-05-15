package com.company.university.myutill;

import java.util.List;

import com.company.university.Group;
import com.company.university.Student;

public class Calculator {
    public static double averageScoreStudentsOfGroup(Group group) {
        double ratingSum = 0;
        int numberStudents = 0;
        if (group != null) {
            numberStudents = getNumberOfStydents(group);
            List<Student> students = group.getStudents();
            for (Student student : students) {
                if (student != null) {
                    ratingSum += student.getAverageRating();
                }
            }
        }
        return (numberStudents == 0 ? 0 : ratingSum / numberStudents);
    }

    public static int getNumberOfStydents(Group group) {
        int result = 0;
        if (group != null) {
            result = group.getStudents().size();
        }
        return result;
    }
}

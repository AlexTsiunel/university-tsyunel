package com.company.university.myutil;

import java.util.List;

import com.company.university.division.Group;
import com.company.university.person.Student;
import com.company.university.util.datastructures.DynamicArray;
import com.company.university.util.datastructures.MyDynamicArray;

public class Calculator {
    public static double averageScoreStudentsOfGroup(Group group) {
        double ratingSum = 0;
        int numberStudents = 0;
        if (group != null) {
            numberStudents = getNumberOfStydents(group);
            DynamicArray students = group.getStudents();
            for (Object student : students.toArray()) {
                if (student != null) {
                    ratingSum += ((Student) student).getAverageRating();
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

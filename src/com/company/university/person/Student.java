package com.company.university.person;

import java.util.Date;

import com.company.university.division.Group;

public class Student extends Person {
    private static long countId = 1;
    private Group group;
    private double currentAvgRating;
    private boolean isInGroup;

    public Student(String firstName, String lastName, Sex sex, Date dateOfBirth) {
        super(firstName, lastName, sex, dateOfBirth);
        super.setId(countId++);
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public double getAverageRating() {
        return currentAvgRating;
    }

    public void setAverageRating(double averageRating) {
        this.currentAvgRating = averageRating;
    }

    public boolean isInGroup() {
        return isInGroup;
    }

    public void setInGroup(boolean isInGroup) {
        this.isInGroup = isInGroup;
    }

    @Override
    public String introduceYourself() {
        String name = (super.getFirstName() == null ? "NOT ASSIGNED" : super.getFirstName());
        String facultyName = "NOT ASSIGNED";
        if (group != null && group.getFaculty() != null && group.getFaculty().getName() != null)
            facultyName = group.getFaculty().getName();
        return String.format("My name is %s, I’m a student of the 2nd  year of the %s", name, facultyName);
    }

    @Override
    public String toString() {
        String currentAvg = (currentAvgRating == 0 ? "NOT ASSIGNED" : Double.toString(currentAvgRating));

        return String.format("Student [id: %3d| name: %-12s %-12s| currentAvgRating: %-4s ]", super.getId(),
                super.getFirstName(), super.getLastName(), currentAvg);
    }
}

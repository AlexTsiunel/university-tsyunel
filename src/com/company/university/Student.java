package com.company.university;

/**
 * @author Alex_Tsyunel
 *
 */
public class Student {
    private static long countId = 1;
    private Long id;
    private String firstName;
    private String lastName;
    private Group group;
    private double currentAvgRating;
    private boolean isInGroup;

    public Student(String firstName, String lastName) {
        this.id = countId++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    public String toString() {
        String currentAvg = (currentAvgRating == 0 ? "NOT ASSIGNED" : Double.toString(currentAvgRating));

        return String.format("Student [id: %3d, firstName: %10s, lastName: %10s, currentAvgRating: %4s ]", id, firstName,
                lastName, currentAvg);
    }
}

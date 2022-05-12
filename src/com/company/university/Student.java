package com.company.university;

public class Student {
    private static long countId = 1;
    private long id;
    private String firstName;
    private String lastName;
    private Group group;

    public Student(long id, String firstName, String lastName, Group group) {
        this.id = countId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public long getId() {
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

}

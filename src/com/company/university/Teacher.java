package com.company.university;

public class Teacher {
    private static long countId = 1;
    private long id;
    private String firstName;
    private String lastName;
    private Department department;
    private Group group;

    public Teacher(String firstName, String lastName, Department department) {
        this.id = countId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

}

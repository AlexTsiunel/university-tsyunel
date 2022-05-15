package com.company.university;

public class Teacher {
    private static long countId = 1;
    private Long id;
    private String firstName;
    private String lastName;
    private Department department;
    private Group group;

    public Teacher(String firstName, String lastName) {
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
//        group.setCurator(this);
        //StackOverflowError
    }

    @Override
    public String toString() {
        String departmentName = (department == null ? "NOT ASSIGNED" : department.getName());
        String groupName = (group == null ? "NOT ASSIGNED" : group.getName());

        return String.format("Teacher [id: %3d, firstName: %10s, lastName: %10s, department: %s, group: %s ]", id, firstName,
                lastName, departmentName, groupName);
    }
}

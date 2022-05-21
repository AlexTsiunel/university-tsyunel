package com.company.university.person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.company.university.division.Department;
import com.company.university.division.Group;

public class Teacher extends Employee {

    public enum Subject {
        subject1, subject2, subject3, subject4
    }

    public enum AcademicDegree {
        ASSISTANT, BACHELOR, MASTER, DOCTOR
    }

    public enum Position {
        MANAGER, ASSISTANTMANAGER, TEACHER
    }

    private static long countId = 1;
    private Department department;
    private AcademicDegree academicDegree;
    private Position position;
    private List<Subject> subjects;
    private Group group;

    public Teacher(String firstName, String lastName, Sex sex, Date dateOfBirth) {
        super(firstName, lastName, sex, dateOfBirth);
        super.setId(countId++);
        subjects = new ArrayList<>();
        academicDegree = AcademicDegree.ASSISTANT;
        position = Position.TEACHER;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public AcademicDegree getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(AcademicDegree academicDegree) {
        this.academicDegree = academicDegree;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
    
    
    

    @Override
    public String toString() {
        String departmentName = (department == null ? "NOT ASSIGNED" : department.getName());
        String groupName = (group == null ? "NOT ASSIGNED" : group.getName());
        String academicDegree = (this.academicDegree == null ? "NOT ASSIGNED" : this.academicDegree.toString());
        String position = (this.position == null ? "NOT ASSIGNED" :this.position.toString());

        return String.format("Teacher [id: %3d| name: %-8s %-8s| department: %-12s| academic degree: %-12s| position: %-12s| group: %-12s ]",
                super.getId(), super.getFirstName(), super.getLastName(), departmentName, academicDegree, position, groupName);
    }
}

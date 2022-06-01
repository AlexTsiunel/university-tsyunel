package com.company.university.division;

import java.util.ArrayList;
import java.util.List;

import com.company.university.person.Cleaner;
import com.company.university.person.Teacher;
import com.company.university.person.Teacher.Position;

public class Department extends DivisionUnit {
    private static long countId = 1;
    private Teacher manager;
    private Teacher assistantManager;
    private List<Teacher> ordinaryTeachers;
    private Cleaner cleaner;
    private Faculty faculty;
    private int maxNumberOfTeacher = 8;

    public Department(String name) {
        super(name);
        super.setId(countId++);
        ordinaryTeachers = new ArrayList<>();
    }

    public Teacher getManager() {
        return manager;
    }

    public void setManager(Teacher manager) {
        this.manager = manager;
        manager.setPosition(Position.MANAGER);
        ;
    }

    public Teacher getAssistantManager() {
        return assistantManager;
    }

    public void setAssistantManager(Teacher assistantManager) {
        this.assistantManager = assistantManager;
    }

    public List<Teacher> getOrdinaryTeachers() {
        return ordinaryTeachers;
    }

    public void setOrdinaryTeachers(List<Teacher> ordinaryTeachers) {
        this.ordinaryTeachers = ordinaryTeachers;
    }

    public Cleaner getCleaner() {
        return cleaner;
    }

    public void setCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getMaxNumberOfTeacher() {
        return maxNumberOfTeacher;
    }

    public void setMaxNumberOfTeacher(int maxNumberOfTeacher) {
        this.maxNumberOfTeacher = maxNumberOfTeacher;
    }

    @Override
    public String toString() {
        String stringView = "Department name: %s.\n   id: %d.\n   manager name: %s.\n"
                + "   assistant manager name: %s.\n" + "   number of teachers at the department: %d.";

        String managerName = (manager == null ? "NOT ASSIGNED"
                : (manager.getLastName() + " " + manager.getFirstName()));
        String assistManagerName = (assistantManager == null ? "NOT ASSIGNED"
                : (assistantManager.getLastName() + " " + assistantManager.getFirstName()));
        int numberOfTeacher = ordinaryTeachers.size();

        return String.format(stringView, super.getName(), super.getId(), managerName, assistManagerName,
                numberOfTeacher);
    }

}

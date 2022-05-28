package com.company.university.myutil;

import com.company.university.division.Department;
import com.company.university.division.Group;
import com.company.university.person.Teacher;

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

    public static void group(Group group, boolean showStudents) {
        if (group != null) {
            System.out.println(group.toString());
        }
        if (showStudents == true && group.getStudents() != null) {
            System.out.println("Group students info:");
            for (Object student : group.getStudents().toArray()) {
                System.out.println(student.toString());
            }
        }
    }

    public static void teacher(Teacher teacher) {
        if (teacher != null) {
            System.out.println(teacher.toString());
        }
    }

    public static void department(Department department, boolean showTeachers, boolean showWorkers) {
        if (department != null) {
            System.out.println(department.toString());
            if (showTeachers == true && department.getOrdinaryTeachers() != null) {
                System.out.println("Department teachers info:");
                for (Object teacher : department.getOrdinaryTeachers().toArray()) {
                    System.out.println(teacher.toString());
                }
            }
            if (showWorkers == true && department.getCleaner() != null) {
                System.out.println("Department workers info:");
                System.out.println(department.getCleaner().toString());
            }
        }
        System.out.println();
    }

    public static void showDepartmentPayroll(Department department) {
        if (department != null) {
            System.out.printf("Department payroll '%s':\n", department.getName());
            String message = "Employee name: %s %s. Position: %s\n";

            if (department.getManager() != null && department.getManager().getSalary() != null) {
                System.out.printf(message, department.getManager().getFirstName(),
                        department.getManager().getLastName(), department.getManager().getPosition());
                System.out.println(department.getManager().getSalary().toString());
            }
            if (department.getAssistantManager() != null && department.getAssistantManager().getSalary() != null) {
                System.out.printf(message, department.getAssistantManager().getFirstName(),
                        department.getAssistantManager().getLastName(), department.getAssistantManager().getPosition());
                System.out.println(department.getAssistantManager().getSalary().toString());
            }

            if (department.getOrdinaryTeachers() != null) {
                for (Object teacher : department.getOrdinaryTeachers().toArray())
                    if (teacher != null && ((Teacher) teacher).getSalary() != null && ((Teacher) teacher).getSalary() != null) {
                        System.out.printf(message, ((Teacher) teacher).getFirstName(), ((Teacher) teacher).getLastName(),
                                ((Teacher) teacher).getPosition());
                        System.out.println(((Teacher) teacher).getSalary().toString());
                    }
            }
            if (department.getCleaner() != null && department.getCleaner().getSalary() != null) {
                System.out.printf(message, department.getCleaner().getFirstName(), department.getCleaner().getLastName(),
                        "Cleaner");
                System.out.println(department.getCleaner().getSalary().toString());
            }

        }
        System.out.printf("Department's salary total: %103.2f\n", AccountantUtil.getDepartmentsSalary(department));
    }
}

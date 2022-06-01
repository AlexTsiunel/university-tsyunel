package com.company.university.myutil;

import com.company.university.division.Department;
import com.company.university.person.Cleaner;
import com.company.university.person.Teacher;
import com.company.university.person.Teacher.Position;
import com.company.university.util.datastructures.DynamicArray;

public class DepartmentUtil {
    public static void addManager(Teacher newManager, Department department) {
        if (newManager != null && department != null && newManager.isUsed() == false) {

            Teacher oldManager = department.getManager();
            if (oldManager != null) {
                if (oldManager.equals(newManager)) {
                    return;
                } else {
                    oldManager.setPosition(Position.TEACHER);
                }
            } else {
                department.setManager(newManager);
                newManager.setPosition(Position.MANAGER);
                newManager.setUsed(true);
            }
        }
    }

    public static void addAssistantManager(Teacher newAssistManager, Department department) {
        if (newAssistManager != null && department != null && newAssistManager.isUsed() == false) {

            Teacher oldAssistManager = department.getAssistantManager();
            if (oldAssistManager != null) {
                if (oldAssistManager.equals(newAssistManager)) {
                    return;
                } else {
                    oldAssistManager.setPosition(Position.TEACHER);
                }
            } else {
                department.setAssistantManager(newAssistManager);
                newAssistManager.setPosition(Position.ASSISTANTMANAGER);
                newAssistManager.setUsed(true);
            }
        }
    }

    public static void addTeacher(Teacher newTeacher, Department department) {
        if (newTeacher != null && department != null && newTeacher.isUsed() == false) {
            DynamicArray teachers = department.getOrdinaryTeachers();
            if (teachers != null && newTeacher.getPosition() == Position.TEACHER) {
                if (teachers.contains(newTeacher) || teachers.size() >= department.getMaxNumberOfTeacher()) {
                    return;
                } else {
                    teachers.add(newTeacher);
                    newTeacher.setDepartment(department);
                    newTeacher.setUsed(true);
                }
            }
        }
    }

    public static void removeTeacher(Teacher teacher, Department department) {
        if (teacher != null && department != null) {
            DynamicArray teachers = department.getOrdinaryTeachers();
            if (teachers != null && teachers.contains(teacher)) {
                teachers.remove(teacher);
                teacher.setUsed(false);
            }
        }
    }
    
    public static void addCleaner (Cleaner cleaner, Department department) {
        if (cleaner != null && department != null && cleaner.isUsed() == false) {
            department.setCleaner(cleaner);
            cleaner.setUsed(true);
        }
    }

    public static boolean isContainsTeacher(Teacher teacher, Department department) {
        if (teacher != null && department != null) {
            if (teacher.equals(department.getManager()) || teacher.equals(department.getAssistantManager())
                    || department.getOrdinaryTeachers().contains(teacher))
                return true;

        }
        return false;
    }
}

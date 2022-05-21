package com.company.university;

import java.util.Date;

import com.company.university.division.Department;
import com.company.university.division.Group;
import com.company.university.division.Faculty;
import com.company.university.division.StructuralSubdivision;
import com.company.university.myutill.AccountantUtil;
import com.company.university.myutill.DepartmentUtill;
import com.company.university.myutill.GroupUtill;
import com.company.university.myutill.PrintToConsole;
import com.company.university.person.Student;
import com.company.university.person.Teacher;
import com.company.university.person.Teacher.AcademicDegree;
import com.company.university.person.Teacher.Position;
import com.company.university.person.Cleaner;
import com.company.university.person.Person.Sex;;

public class App {

    public static void main(String[] args) {

        StructuralSubdivision structuralSubdivision1 = new StructuralSubdivision("Subdivision1");

        Department department1 = new Department("Department of Information Technology");
        Department department2 = new Department("Department of Banking");
        Department department3 = new Department("Department of Economics and Management");

        Faculty faculty1 = new Faculty("Faculty of Finance and Banking");
        Faculty faculty2 = new Faculty("Faculty of Economics and Management");
        Faculty faculty3 = new Faculty("Faculty of Marketing and Logistics");

        Group group1 = new Group("Group1");
        Group group2 = new Group("Group2");
        Group group3 = new Group("Group3");
        
        System.out.println(group1.toString());

        Student student1 = new Student("Alexander", "Hunold", Sex.male, new Date());
        Student student2 = new Student("Bruce", "Ernst", Sex.male, new Date());
        Student student3 = new Student("David", "Austin", Sex.male, new Date());
        Student student4 = new Student("Valli", "Pataballa", Sex.male, new Date());
        Student student5 = new Student("Diana", "Lorentz", Sex.female, new Date());
        Student student6 = new Student("Daniel", "Faviet", Sex.male, new Date());
        Student student7 = new Student("John", "Chen", Sex.male, new Date());
        Student student8 = new Student("Ismael", "Sciarra", Sex.male, new Date());
        Student student9 = new Student("Jose Manuel", "Urman", Sex.male, new Date());
        Student student10 = new Student("Luis", "Popp", Sex.male, new Date());
        Student student11 = new Student("Alexander", "Khoo", Sex.male, new Date());
        Student student12 = new Student("Nick", "Khoo", Sex.male, new Date());
        
        Teacher teacher1 = new Teacher("Anthony", "Cabrio", Sex.male, new Date());
        Teacher teacher2 = new Teacher("Alberto", "Aerrazur", Sex.male, new Date());
        Teacher teacher3 = new Teacher("Anthony", "Cabrio", Sex.male, new Date());
        Teacher teacher4 = new Teacher("Britney", "Everett", Sex.female, new Date());
        Teacher teacher5 = new Teacher("Adam", "Fripp", Sex.male, new Date());
        Teacher teacher6 = new Teacher("Alyssa", "Hutton", Sex.female, new Date());
        Teacher teacher7 = new Teacher("Allan", "McEwen", Sex.male, new Date());
        Teacher teacher8 = new Teacher("Alana", "Walsh", Sex.female, new Date());
        Teacher teacher9 = new Teacher("John", "Russell", Sex.male, new Date());
        Teacher teacher10 = new Teacher("Karen", "Partners", Sex.female, new Date());
        Teacher teacher11 = new Teacher("Alberto", "Errazuriz", Sex.male, new Date());
        Teacher teacher12 = new Teacher("Gerald", "Cambrault", Sex.male, new Date());

        student1.setAverageRating(7.0);
        student2.setAverageRating(8.5);
        student3.setAverageRating(8.5);
        student4.setAverageRating(9.3);
        student5.setAverageRating(8.0);
        student6.setAverageRating(7.0);
        student7.setAverageRating(8.5);
        student8.setAverageRating(7.0);
        student9.setAverageRating(7.0);
        student10.setAverageRating(10.0);
        student11.setAverageRating(7.0);
        student12.setAverageRating(7.0);

        

//        PrintToConsole.department(department1);
        DepartmentUtill.addTeacher(teacher1, department1);
        DepartmentUtill.addTeacher(teacher1, department1);
        DepartmentUtill.addTeacher(teacher2, department1);
        DepartmentUtill.addTeacher(teacher3, department1);
        DepartmentUtill.addTeacher(teacher4, department1);
        DepartmentUtill.addTeacher(teacher5, department1);
        DepartmentUtill.addTeacher(teacher6, department1);
        DepartmentUtill.addTeacher(teacher7, department1);
        DepartmentUtill.addTeacher(teacher8, department1);
        DepartmentUtill.addTeacher(teacher9, department1);
        DepartmentUtill.addTeacher(teacher11, department1);
//        PrintToConsole.department(department1);
        DepartmentUtill.addManager(teacher1, department1);
//        PrintToConsole.department(department1);
        DepartmentUtill.addAssistantManager(teacher12, department1);
        DepartmentUtill.addManager(teacher10, department1);
        PrintToConsole.department(department1, true);
        DepartmentUtill.removeTeacher(teacher6, department1);
        PrintToConsole.department(department1, true);

        System.out.println(DepartmentUtill.isContainsTeacher(teacher12, department1));
        
        GroupUtill.addStudent(student1, group1);
        GroupUtill.addStudent(student1, group1);
        GroupUtill.addStudent(student2, group1);
        GroupUtill.addStudent(student3, group1);
        GroupUtill.addStudent(student4, group1);
        GroupUtill.addStudent(student5, group1);
        GroupUtill.addStudent(student6, group1);
        GroupUtill.addStudent(student7, group1);
        GroupUtill.addStudent(student8, group1);
        GroupUtill.addStudent(student9, group1);
        GroupUtill.addStudent(student10, group1);
        GroupUtill.addStudent(student11, group1);
        GroupUtill.addCurator(teacher12, group1);
        GroupUtill.addFaculty(faculty1, group1);
     
        PrintToConsole.group(group1, false);
        
        GroupUtill.removeFaculty(group1);
        
        PrintToConsole.group(group1, false);
        
        
        
        

//        PrintToConsole.teacher(teacher1);
//        teacher1.setWorkExperience(10);
//        teacher1.setVacationDuration(24);
//        teacher1.setHoursWorked(30);
//        teacher1.setAcademicDegree(AcademicDegree.MASTER);
//        PrintToConsole.teacher(teacher1);

//        DepartmentUtil.addTeacher(teacher1, department1);
//        PrintToConsole.department(department1);

//      teacher2.setPosition(Position.TEACHER);
//      PrintToConsole.teacher(teacher2);
//      DepartmentUtil.addManager(teacher2, department1);
//      PrintToConsole.teacher(teacher2);
//      PrintToConsole.department(department1);

//        AccountantUtil.setEmployeeBaseSalary(teacher1, 2000);
//        AccountantUtil.setEmployeePremium(teacher1);
//        AccountantUtil.setTeacherDegreeAward(teacher1);
//        AccountantUtil.setEmployeeFullSalary(teacher1);
//        System.out.println("teacher salary: " + teacher1.getSalary().getFullSalary());
//        
//        
//        
//        

//        teacher2.setPosition(Position.TEACHER);
//        PrintToConsole.teacher(teacher2);
//        DepartmentUtil.addManager(teacher2, department1);
//        PrintToConsole.teacher(teacher2);
//        PrintToConsole.department(department1);

//        
//        
//
//        group1.addStudent(student1);
//        group1.addStudent(student2);
//        group1.addStudent(student2);
//        group1.addStudent(student3);
//        group1.addStudent(student4);
//        group1.addStudent(student5);
//        group1.addStudent(student6);
//        group1.addStudent(student8);
//        group1.addStudent(student9);
//        group1.addStudent(student10);
//        PrintToConsole.group(group1);
//        
//        PrintToConsole.numberOfStydents(group1);
//        group1.setCurator(teacher1);
//        System.out.println();
//        PrintToConsole.group(group1);
//        
//        group1.setCurator(teacher2);
//        teacher2.setDepartment(department1);
//        group1.deleteStudent(student1);
//        group1.deleteStudentById(4);
//        PrintToConsole.group(group1);
//        PrintToConsole.averageScoreGroup(group1);
//        PrintToConsole.numberOfStydents(group1);
//        
//       
//        Cleaner cleaner1 = new Cleaner("Markus", "Merk", Sex.male, new Date());
//        System.out.println(cleaner1);
//        cleaner1.setStructuralSubdivision(null);
//        System.out.println(cleaner1);
//        cleaner1.setStructuralSubdivision(structuralSubdivision1);
//        System.out.println(cleaner1);

    }
}

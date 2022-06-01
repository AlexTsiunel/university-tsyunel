package com.company.university;

import java.util.Date;

import com.company.university.division.Department;
import com.company.university.division.Group;
import com.company.university.division.Faculty;
import com.company.university.division.StructuralSubdivision;
import com.company.university.myutil.AccountantUtil;
import com.company.university.myutil.DepartmentUtil;
import com.company.university.myutil.FacultyUtil;
import com.company.university.myutil.GroupUtil;
import com.company.university.myutil.PrintToConsole;
import com.company.university.person.Student;
import com.company.university.person.Teacher;
import com.company.university.person.Teacher.AcademicDegree;
import com.company.university.person.Teacher.Position;
import com.company.university.person.Cleaner;
import com.company.university.person.Person.Sex;;

public class App {

    public static void main(String[] args) {


        Department department1 = new Department("Department of Information Technology");
        Department department2 = new Department("Department of Banking");
        Department department3 = new Department("Department of Economics and Management");

        Faculty faculty1 = new Faculty("Faculty of Finance and Banking");
        Faculty faculty2 = new Faculty("Faculty of Economics and Management");
        Faculty faculty3 = new Faculty("Faculty of Marketing and Logistics");
        
        StructuralSubdivision structuralSubdivision1 = new StructuralSubdivision("Ñleaning service");

        Group group1 = new Group("Group1");
        Group group2 = new Group("Group2");
        Group group3 = new Group("Group3");


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
        
        Cleaner cleaner1 = new Cleaner("Pedro", "Tores", Sex.male, new Date());
        cleaner1.setStructuralSubdivision(structuralSubdivision1);

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

        DepartmentUtil.addTeacher(teacher1, department1);
        DepartmentUtil.addTeacher(teacher1, department1);
        teacher1.setWorkExperience(2);
        teacher1.setVacationDuration(24);
        teacher1.setHoursWorked(30);
        teacher1.setAcademicDegree(AcademicDegree.ASSISTANT);
        AccountantUtil.setEmployeeBaseSalary(teacher1, 2500);
        
        DepartmentUtil.addTeacher(teacher2, department1);
        teacher2.setWorkExperience(25);
        teacher2.setVacationDuration(24);
        teacher2.setHoursWorked(30);
        teacher2.setAcademicDegree(AcademicDegree.DOCTOR);
        AccountantUtil.setEmployeeBaseSalary(teacher2, 10000);
        
        DepartmentUtil.addTeacher(teacher3, department1);
        teacher3.setWorkExperience(25);
        teacher3.setVacationDuration(24);
        teacher3.setHoursWorked(30);
        teacher3.setAcademicDegree(AcademicDegree.DOCTOR);
        AccountantUtil.setEmployeeBaseSalary(teacher3, 10000);
        
        DepartmentUtil.addTeacher(teacher4, department1);
        teacher4.setWorkExperience(1);
        teacher4.setVacationDuration(24);
        teacher4.setHoursWorked(30);
        teacher4.setAcademicDegree(AcademicDegree.ASSISTANT);
        AccountantUtil.setEmployeeBaseSalary(teacher4, 2500);
        
        DepartmentUtil.addTeacher(teacher5, department1);
        teacher5.setWorkExperience(15);
        teacher5.setVacationDuration(24);
        teacher5.setHoursWorked(30);
        teacher5.setAcademicDegree(AcademicDegree.DOCTOR);
        AccountantUtil.setEmployeeBaseSalary(teacher5, 10000);
        
        
        DepartmentUtil.addTeacher(teacher6, department1);
        teacher6.setWorkExperience(10);
        teacher6.setVacationDuration(24);
        teacher6.setHoursWorked(30);
        teacher6.setAcademicDegree(AcademicDegree.MASTER);
        AccountantUtil.setEmployeeBaseSalary(teacher6, 7500);
        
        
        DepartmentUtil.addTeacher(teacher7, department1);
        teacher7.setWorkExperience(10);
        teacher7.setVacationDuration(24);
        teacher7.setHoursWorked(30);
        teacher7.setAcademicDegree(AcademicDegree.MASTER);
        AccountantUtil.setEmployeeBaseSalary(teacher7, 7500);
        
        
        DepartmentUtil.addTeacher(teacher8, department1);
        teacher8.setWorkExperience(8);
        teacher8.setVacationDuration(24);
        teacher8.setHoursWorked(30);
        teacher8.setAcademicDegree(AcademicDegree.BACHELOR);
        AccountantUtil.setEmployeeBaseSalary(teacher8, 5000);
        
        
        DepartmentUtil.addTeacher(teacher9, department1);
        teacher9.setWorkExperience(10);
        teacher9.setVacationDuration(24);
        teacher9.setHoursWorked(30);
        teacher9.setAcademicDegree(AcademicDegree.MASTER);
        AccountantUtil.setEmployeeBaseSalary(teacher9, 7500);
        
        
        
        DepartmentUtil.addTeacher(teacher11, department1);
        teacher11.setWorkExperience(7);
        teacher11.setVacationDuration(24);
        teacher11.setHoursWorked(30);
        teacher11.setAcademicDegree(AcademicDegree.BACHELOR);
        AccountantUtil.setEmployeeBaseSalary(teacher11, 5000);
        
        DepartmentUtil.addManager(teacher1, department1);
        DepartmentUtil.addManager(teacher10, department1);
        teacher10.setWorkExperience(17);
        teacher10.setVacationDuration(24);
        teacher10.setHoursWorked(30);
        teacher10.setAcademicDegree(AcademicDegree.DOCTOR);
        AccountantUtil.setEmployeeBaseSalary(teacher10, 10000);
        
        DepartmentUtil.addAssistantManager(teacher12, department1);
        teacher12.setWorkExperience(15);
        teacher12.setVacationDuration(24);
        teacher12.setHoursWorked(30);
        teacher12.setAcademicDegree(AcademicDegree.DOCTOR);
        AccountantUtil.setEmployeeBaseSalary(teacher12, 10000);
  
        PrintToConsole.department(department1, true, true);
        DepartmentUtil.removeTeacher(teacher6, department1);
        DepartmentUtil.addCleaner(cleaner1, department1);
        cleaner1.setWorkExperience(17);
        cleaner1.setVacationDuration(24);
        cleaner1.setHoursWorked(30);
        AccountantUtil.setEmployeeBaseSalary(cleaner1, 1000);
        
        PrintToConsole.department(department1, true, true);

        System.out.println();
        System.out.println("Is there 'teacher12' in 'department1'?: " + DepartmentUtil.isContainsTeacher(teacher12, department1));
        System.out.println();

        GroupUtil.addStudent(student1, group1);
        GroupUtil.addStudent(student1, group1);
        GroupUtil.addStudent(student2, group1);
        GroupUtil.addStudent(student3, group1);
        GroupUtil.addStudent(student4, group1);
        GroupUtil.addStudent(student5, group1);
        GroupUtil.addStudent(student6, group1);
        GroupUtil.addStudent(student7, group1);
        GroupUtil.addStudent(student8, group1);
        GroupUtil.addStudent(student9, group1);
        GroupUtil.addStudent(student10, group1);
        GroupUtil.addStudent(student11, group1);
        GroupUtil.addCurator(teacher12, group1);
        GroupUtil.addFaculty(faculty1, group1);

        PrintToConsole.group(group1, true);

        GroupUtil.removeFaculty(group1);

        PrintToConsole.group(group1, true);
  
        AccountantUtil.getEmployeeBonus(teacher1);
        AccountantUtil.getEmployeeHolidayCashBonus(teacher1, 0.9);
        AccountantUtil.getScientificDegreCashBonus(teacher1);
        AccountantUtil.getEmployeeFullSalary(teacher1);
        
        AccountantUtil.getEmployeeBonus(teacher2);
        AccountantUtil.getEmployeeHolidayCashBonus(teacher2, 0.9);
        AccountantUtil.getScientificDegreCashBonus(teacher2);
        AccountantUtil.getEmployeeFullSalary(teacher2);
        
        AccountantUtil.getEmployeeBonus(teacher3);
        AccountantUtil.getEmployeeHolidayCashBonus(teacher3, 0.9);
        AccountantUtil.getScientificDegreCashBonus(teacher3);
        AccountantUtil.getEmployeeFullSalary(teacher3);
        
        AccountantUtil.getEmployeeBonus(teacher4);
        AccountantUtil.getEmployeeHolidayCashBonus(teacher4, 0.9);
        AccountantUtil.getScientificDegreCashBonus(teacher4);
        AccountantUtil.getEmployeeFullSalary(teacher4);
        
        AccountantUtil.getEmployeeBonus(teacher5);
        AccountantUtil.getEmployeeHolidayCashBonus(teacher5, 0.9);
        AccountantUtil.getScientificDegreCashBonus(teacher5);
        AccountantUtil.getEmployeeFullSalary(teacher5);
                
        AccountantUtil.getEmployeeBonus(teacher6);
        AccountantUtil.getEmployeeHolidayCashBonus(teacher6, 0.9);
        AccountantUtil.getScientificDegreCashBonus(teacher6);
        AccountantUtil.getEmployeeFullSalary(teacher6);
        
        AccountantUtil.getEmployeeBonus(teacher7);
        AccountantUtil.getEmployeeHolidayCashBonus(teacher7, 0.9);
        AccountantUtil.getScientificDegreCashBonus(teacher7);
        AccountantUtil.getEmployeeFullSalary(teacher7);
        
        AccountantUtil.getEmployeeBonus(teacher8);
        AccountantUtil.getEmployeeHolidayCashBonus(teacher8, 0.9);
        AccountantUtil.getScientificDegreCashBonus(teacher8);
        AccountantUtil.getEmployeeFullSalary(teacher8);
        
        AccountantUtil.getEmployeeBonus(teacher9);
        AccountantUtil.getEmployeeHolidayCashBonus(teacher9, 0.9);
        AccountantUtil.getScientificDegreCashBonus(teacher9);
        AccountantUtil.getEmployeeFullSalary(teacher9);
        
        AccountantUtil.getEmployeeBonus(teacher10);
        AccountantUtil.getEmployeeHolidayCashBonus(teacher10, 0.9);
        AccountantUtil.getScientificDegreCashBonus(teacher10);
        AccountantUtil.getEmployeeFullSalary(teacher10);
        
        AccountantUtil.getEmployeeBonus(teacher11);
        AccountantUtil.getEmployeeHolidayCashBonus(teacher11, 0.9);
        AccountantUtil.getScientificDegreCashBonus(teacher11);
        AccountantUtil.getEmployeeFullSalary(teacher11);
        
        AccountantUtil.getEmployeeBonus(teacher12);
        AccountantUtil.getEmployeeHolidayCashBonus(teacher12, 0.9);
        AccountantUtil.getScientificDegreCashBonus(teacher12);
        AccountantUtil.getEmployeeFullSalary(teacher12);
 
        AccountantUtil.getEmployeeBonus(cleaner1);
        AccountantUtil.getEmployeeHolidayCashBonus(cleaner1, 0.85);
        AccountantUtil.getEmployeeFullSalary(cleaner1);

        System.out.println();
        PrintToConsole.showDepartmentPayroll(department1);
        System.out.println();
        
        System.out.println(student1.introduceYourself());
        System.out.println(student2.introduceYourself());
        System.out.println(student3.introduceYourself());
        System.out.println(teacher1.introduceYourself());
        System.out.println(teacher2.introduceYourself());
        System.out.println(teacher3.introduceYourself());
        System.out.println(cleaner1.introduceYourself());
        
        FacultyUtil.addDepartment(department1, faculty1);;
        FacultyUtil.addGroupe(group1, faculty1);
        FacultyUtil.addGroupe(group2, faculty1);
        FacultyUtil.addGroupe(group3, faculty1);
        
        System.out.println("_______________________________");
        System.out.println(faculty1.toString());
    }
}

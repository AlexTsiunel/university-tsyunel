package com.company.university;

import com.company.university.myutill.PrintToConsole;

public class App {

    public static void main(String[] args) {

        Department department1 = new Department("Earth");
        Department department2 = new Department("Mars");
        Department department3 = new Department("Saturn");

        Faculty faculty1 = new Faculty("Europe");
        Faculty faculty2 = new Faculty("Asia");
        Faculty faculty3 = new Faculty("Africa");

        Group group1 = new Group("France");
        Group group2 = new Group("Brazil");
        Group group3 = new Group("Italy");

        Student student1 = new Student("Fabien", "Barthez");
        student1.setAverageRating(7.0);
        Student student2 = new Student("Lilian", "Thuram");
        student2.setAverageRating(8.5);
        Student student3 = new Student("Marcel", "Desailly");
        student3.setAverageRating(8.5);
        Student student4 = new Student("Didier", "Deschamps");
        student4.setAverageRating(9.3);
        Student student5 = new Student("Emmanuel", "Petit");
        student5.setAverageRating(8.0);
        Student student6 = new Student("Frank", "Leboeuf");
        student6.setAverageRating(7.0);
        Student student7 = new Student("Youri", "Djorkaeff");
        student7.setAverageRating(8.5);
        Student student8 = new Student("Patrick", "Vieira");
        Student student9 = new Student("Stephane", "Guivarch");
        student9.setAverageRating(7.0);
        Student student10 = new Student("Zinedine", "Zidane");
        student10.setAverageRating(10.0);
        Student student11 = new Student("Frank", "Leboeuf");
        student11.setAverageRating(7.0);

        Teacher teacher1 = new Teacher("Aime", "Jacquet");
        teacher1.setDepartment(department1);
        Teacher teacher2 = new Teacher("Mario", "Zagallo");

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);
        group1.addStudent(student6);
        group1.addStudent(student8);
        group1.addStudent(student9);
        group1.addStudent(student10);
        PrintToConsole.group(group1);
        
        PrintToConsole.numberOfStydents(group1);
        group1.setCurator(teacher1);
        System.out.println();
        PrintToConsole.group(group1);
        
        group1.setCurator(teacher2);
        teacher2.setDepartment(department1);
        group1.deleteStudent(student1);
        group1.deleteStudentById(4);
        PrintToConsole.group(group1);
        PrintToConsole.averageScoreGroup(group1);
        PrintToConsole.numberOfStydents(group1);
    }
}

# Java Web Development (EPAM course). Homework_05.

### Author: Tsyunel Aliaksei

**Project description.**

This project was created as part of assignment 5 of the course 'Web development in Java (EPAM course)'.
The project simulates the simple structure of a university.
The com.company.university package contains the classes *Faculty*, *Department*, *Group*, *Student*, *Teacher*.
These classes are designed to store data and model real university subjects.
The *App* class is designed to run an application.
The com.company.university.myutil package contains the *PrintToConsole* and *Calculator* classes.
*PrintToConsole class* - a utility class containing methods for displaying the necessary user
information to the console.
The *Calculator* class is a utility class designed to perform the necessary calculations.

**Application features.**

- user can set/change group capacity. The default group capacity is 8 students;
- user can add/remove a student to/from a group;
- user can add/remove a curator to/from a group. When adding a curator group, this group is added to this curator by default;
- the user can add/remove the curator to/from the group;
- the user can get information about the group in the console:
     - the current composition of the group; 
     - the current curator of the group;
     - the number of students in the group; 
     - the average performance of students in the group;
- a group can contain only unique students;
- a student can only be in one group;
- the curator can supervise only one group and belong to a specific department.
- the group belongs to a particular faculty.

package com.company.university.myutill;

import java.math.BigDecimal;

import com.company.university.Salary;
import com.company.university.person.Employee;
import com.company.university.person.Teacher;

public class AccountantUtil {
    public static void setEmployeeBaseSalary(Employee employee, int baseSalary) {
        if (employee != null) {
            employee.getSalary().setBaseSalary(new BigDecimal(baseSalary));
        }
    }

    public static void setEmployeeFullSalary(Employee employee) {
        if (employee != null) {
            Salary salary = employee.getSalary();
            BigDecimal baseSalary = salary.getBaseSalary();
            BigDecimal premium = salary.getPremium();
            BigDecimal degreeAward = salary.getDegreeAward();
            BigDecimal fullSalary = ((baseSalary.add(premium)).add(degreeAward));

            employee.getSalary().setFullSalary(fullSalary);
        }
    }

    public static void setEmployeePremium(Employee employee) {
        if (employee != null) {
            double intFactor = 1;

            if (employee.getWorkExperience() > 1)
                intFactor = 1.15;
            if (employee.getWorkExperience() > 5)
                intFactor = 1.30;
            if (employee.getWorkExperience() > 10)
                intFactor = 1.45;
            if (employee.getWorkExperience() > 15)
                intFactor = 1.60;
            if (employee.getWorkExperience() > 25)
                intFactor = 1.75;
            if (employee.getWorkExperience() > 50)
                intFactor = 1.90;

            BigDecimal bigFactor = new BigDecimal(intFactor);
            BigDecimal employeeSalary = employee.getSalary().getBaseSalary();
            BigDecimal premium = bigFactor.multiply(employeeSalary);

            employee.getSalary().setPremium(premium);
        }
    }

    public static void setEmployeeHolidayPay(Employee employee, int holidayPayFactor) {

        if (employee != null) {
            BigDecimal factor = new BigDecimal(holidayPayFactor);
            BigDecimal holidayPay = employee.getSalary().getBaseSalary().multiply(factor);
            employee.getSalary().setHolidayPay(holidayPay);
        }
    }

    public static void setTeacherDegreeAward(Teacher teacher) {
        if (teacher != null) {
            BigDecimal degreeAward;

            switch (teacher.getAcademicDegree()) {
            case BACHELOR:
                degreeAward = new BigDecimal(2500);
                break;

            case MASTER:
                degreeAward = new BigDecimal(5000);
                break;

            case DOCTOR:
                degreeAward = new BigDecimal(7500);
                break;

            default:
                degreeAward = new BigDecimal(7500);
                break;
            }
            teacher.getSalary().setDegreeAward(degreeAward);
        }
    }
}

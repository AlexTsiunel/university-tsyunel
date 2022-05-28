package com.company.university.myutil;

import java.math.BigDecimal;

import com.company.university.Salary;
import com.company.university.division.Department;
import com.company.university.person.Employee;
import com.company.university.person.Teacher;

public class AccountantUtil {
    public static void setEmployeeBaseSalary(Employee employee, int baseSalary) {
        if (employee != null) {
            employee.getSalary().setBaseSalary(new BigDecimal(baseSalary));
        }
    }

    public static BigDecimal getEmployeeFullSalary(Employee employee) {
        BigDecimal fullSalary = new BigDecimal(0);
        if (employee != null) {
            Salary salary = employee.getSalary();
            BigDecimal baseSalary = salary.getBaseSalary();
            BigDecimal premium = salary.getPremium();
            BigDecimal degreeAward = salary.getDegreeAward();
            fullSalary = ((baseSalary.add(premium)).add(degreeAward));

            employee.getSalary().setFullSalary(fullSalary);

        }
        return fullSalary;
    }

    public static BigDecimal getEmployeeBonus(Employee employee) {
        BigDecimal bonus = new BigDecimal(0);
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
            bonus = bigFactor.multiply(employeeSalary);

            employee.getSalary().setPremium(bonus);
        }
        return bonus;
    }

    public static BigDecimal getEmployeeHolidayCashBonus(Employee employee, double holidayBonusFactor) {
        BigDecimal bonus = new BigDecimal(0);
        if (employee != null) {
            BigDecimal factor = new BigDecimal(holidayBonusFactor);
            bonus = employee.getSalary().getBaseSalary().multiply(factor);
            employee.getSalary().setHolidayPay(bonus);
        }
        return bonus;
    }

    public static BigDecimal getScientificDegreCashBonus(Teacher teacher) {
        BigDecimal bonus = null;
        if (teacher != null) {
            switch (teacher.getAcademicDegree()) {
            case BACHELOR:
                bonus = new BigDecimal(2500);
                break;

            case MASTER:
                bonus = new BigDecimal(5000);
                break;

            case DOCTOR:
                bonus = new BigDecimal(7500);
                break;

            default:
                bonus = new BigDecimal(0);
                break;
            }
            teacher.getSalary().setDegreeAward(bonus);
        }
        return bonus;
    }

    public static BigDecimal getDepartmentsSalary(Department department) {
        BigDecimal departmentsSalary = new BigDecimal(0.0);
        if (department != null) {
            if (department.getManager() != null && department.getManager().getSalary() != null) {
                departmentsSalary = departmentsSalary.add(department.getManager().getSalary().getFullSalary());
            }
            if (department.getAssistantManager() != null && department.getAssistantManager().getSalary() != null) {
                departmentsSalary = departmentsSalary.add(department.getAssistantManager().getSalary().getFullSalary());
            }
            if (department.getCleaner() != null && department.getCleaner().getSalary() != null) {
                departmentsSalary = departmentsSalary.add(department.getCleaner().getSalary().getFullSalary());
            }
            if (department.getOrdinaryTeachers() != null) {
                for (Object teacher : department.getOrdinaryTeachers().toArray())
                    if (teacher != null && ((Teacher) teacher).getSalary() != null && ((Teacher) teacher).getSalary().getFullSalary() != null) {
                        departmentsSalary = departmentsSalary.add(((Teacher) teacher).getSalary().getFullSalary());
                    }
            }
        }
        return departmentsSalary;
    }
}

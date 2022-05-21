package com.company.university;

import java.math.BigDecimal;

public class Salary {
    private BigDecimal fullSalary;
    private BigDecimal baseSalary;
    private BigDecimal premium;
    private BigDecimal holidayPay;
    private BigDecimal degreeAward;

    public Salary() {
        super();
        this.baseSalary = new BigDecimal(0);
        this.baseSalary = new BigDecimal(0);
        this.premium = new BigDecimal(0);
        this.holidayPay = new BigDecimal(0);
        this.degreeAward = new BigDecimal(0);
    }

    public BigDecimal getFullSalary() {
        return fullSalary;
    }

    public void setFullSalary(BigDecimal fullSalary) {
        this.fullSalary = fullSalary;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(BigDecimal baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    public BigDecimal getHolidayPay() {
        return holidayPay;
    }

    public void setHolidayPay(BigDecimal holidayPay) {
        this.holidayPay = holidayPay;
    }

    public BigDecimal getDegreeAward() {
        return degreeAward;
    }

    public void setDegreeAward(BigDecimal degreeAward) {
        this.degreeAward = degreeAward;
    }

}

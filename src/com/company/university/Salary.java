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

    @Override
    public String toString() {
        double baseSalary = (this.baseSalary == null ? 0 : this.baseSalary.doubleValue());
        double premium = (this.premium == null ? 0 : this.premium.doubleValue());
        double holidayPay = (this.holidayPay == null ? 0 : this.holidayPay.doubleValue());
        double degreeAward = (this.degreeAward == null ? 0 : this.degreeAward.doubleValue());
        double fullSalary = (this.fullSalary == null ? 0 : this.fullSalary.doubleValue());

        return String.format(
                "[base salary: %10.2f| bonus: %10.2f| holiday bonus: %10.2f|scientific degre bonus: %10.2f| full salary: %10.2f]",
                baseSalary, premium, holidayPay, degreeAward, fullSalary);
    }

}

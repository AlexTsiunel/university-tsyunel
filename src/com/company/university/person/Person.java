package com.company.university.person;

import java.util.Date;
import java.util.Objects;

import com.company.university.Identifiable;
import com.company.university.Location;

public abstract class Person implements Identifiable {

    public enum Sex {
        male, female
    }

    private Long id;
    private String firstName;
    private String lastName;
    private Sex sex;
    private Date dateOfBirth;
    private Location location;
    private boolean isUsed;

    public Person(String firstName, String lastName, Sex sex, Date dateOfBirth) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
    }

    void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean isBusy) {
        this.isUsed = isBusy;
    }

    public abstract String introduceYourself();

    @Override
    public int hashCode() {
        return Objects.hash(dateOfBirth, firstName, id, lastName, sex);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(firstName, other.firstName)
                && Objects.equals(id, other.id) && Objects.equals(lastName, other.lastName) && sex == other.sex;
    }
}

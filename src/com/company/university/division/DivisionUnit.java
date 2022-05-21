package com.company.university.division;

import java.util.Objects;

public abstract class DivisionUnit {
    private Long id;
    private String name;
    private boolean isUsed;

    public DivisionUnit(String name) {
        super();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DivisionUnit other = (DivisionUnit) obj;
        return Objects.equals(id, other.id) && Objects.equals(name, other.name);
    }
}

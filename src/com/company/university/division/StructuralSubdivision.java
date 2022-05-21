package com.company.university.division;

public class StructuralSubdivision {
    private static long countId;
    private Long id;
    private String name;

    public StructuralSubdivision(String name) {
        super();
        this.id = countId++;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

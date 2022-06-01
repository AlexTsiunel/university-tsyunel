package com.company.university;


public class Location {
    private enum Country {
        BLR, POL, RUS, LVA, LTU, UKR, EST,
    }

    private static long countId;
    private Long id;
    private Country country;
    private String region;
    private String city;
    private String street;

    public Location(Long id, Country country, String region, String city, String street) {
        super();
        this.id = countId++;
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
    }

    public Long getId() {
        return id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}

package com.nik.formtags.model;

import com.nik.formtags.validation.CourseCode;

import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer {

    private String firstName;
    @NotNull(message = "last name cannot be empty")
    @Size(min=1 , message = "last name is required field")
    private String lastName;
    @NotNull(message = "Free passes cannot be empty")
    @Min(value = 1, message = "Minimum passes required is one")
    @Max(value = 5, message = "Maximum passes per customer is 5")
    private int freepasses;
    private String country;
    @Pattern(regexp = "^[a-z0-9A-Z]{6}", message="Postal Code invalid. Example:R2G3G6")
    private String postalCode;

    @NotNull(message = "course code cannot be empty")
    @CourseCode(value = "LUV", message = "course code starts with LUV. Ex: LUV13")
    private String courseCode;
    private String languages;

    private String[] listOfLanguages;
    private Map<String,String> countryList = new HashMap<>();
    private String favouriteFoods;

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getFavouriteFoods() {
        return favouriteFoods;
    }

    public void setFavouriteFoods(String favouriteFoods) {
        this.favouriteFoods = favouriteFoods;
    }

    public String[] getListOfLanguages() {
        listOfLanguages = new String[]{ "English", "Japanese", "Arabic" };
        return listOfLanguages;
    }

    public void setListOfLanguages(String[] listOfLanguages) {
        this.listOfLanguages = listOfLanguages;
    }

    public Map<String,String> getCountryList() {
        countryList.put("United States Of America", "US");
        countryList.put("Japan", "JA");
        countryList.put("Canada", "CA");
        countryList.put("South Korea", "SK");
        return countryList;
    }

    public void setCountryList(Map<String,String> countryList) {
        this.countryList = countryList;
    }

    public int getFreepasses() {
        return freepasses;
    }

    public void setFreepasses(int freepasses) {
        this.freepasses = freepasses;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}

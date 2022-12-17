package com.nik.formtagsvalidations.model;

import com.nik.formtagsvalidations.valdations.CourseCode;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;
    @NotNull(message = "last name field cannot be blank")
    @Size(min = 3,message = "last name cannot be too short")
    @Pattern(regexp = "^[a-zA-Z]+$", message="can only be characters")
    private String lastName;
    private String country;
    @Pattern(regexp = "^[a-zA-Z0-9]{6}", message="Invalid Postal Code. Ex:R12544")
    private String postalCode;
    @CourseCode(value = "PIL" , message = "Course code should start with PIL. Ex: PIL45")
    private String courseCode;

    @Min(value = 1, message = "Minimum no. of passes required to pick are 1")
    @Max(value =5, message = " Maximum no of passes that can be sold are 5")
    private int freePasses;
    private String language;
    private String favouriteFoods;
    private String[] listOfLanguages;

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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String languages) {
        this.language = languages;
    }

    public String getFavouriteFoods() {
        return favouriteFoods;
    }

    public void setFavouriteFoods(String favouriteFoods) {
        this.favouriteFoods = favouriteFoods;
    }

    public String[] getListOfLanguages() {
        listOfLanguages = new String[]{"English","Japanese","Korean","Arabic"};
        return listOfLanguages;
    }

    public void setListOfLanguages(String[] listOfLanguages) {
        this.listOfLanguages = listOfLanguages;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}

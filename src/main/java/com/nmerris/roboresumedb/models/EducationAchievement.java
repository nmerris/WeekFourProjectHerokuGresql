package com.nmerris.roboresumedb.models;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
public class EducationAchievement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty
    @Size(max = 50)
    private String major;

    @NotEmpty
    @Size(max = 50)
    private String school;

    @Min(1900)
    private long graduationYear;


    // not sure if cascade stuff needed here
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;



    // no need for customer constructor here, because there are no Sets


    // GETTERS AND SETTERS ===================================================

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchool() {
        return school;
}

    public void setSchool(String school) {
        this.school = school;
    }

    public long getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(long graduationYear) {
        this.graduationYear = graduationYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

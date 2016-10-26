/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.presentation.beans;

import ch.hearc.ig.odi.peoplelist.service.Services;
import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author silvio.gutierre
 */
@Named(value = "personCreateBean")
@RequestScoped
public class PersonCreateBean implements Serializable{

    @Inject Services services;
    private String gender;
    private String firstName;
    private String lastName;
    private Boolean married;
    private Date birthDate;

    
    public PersonCreateBean() {
    }
    
    public String savePerson(){
        services.savePerson(gender, firstName, lastName, false, birthDate);
        return "index.xhtml";       
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    
    
    
}

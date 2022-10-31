/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package model;

/**
 *
 * @author hardik sodhani
 */
public class Person {
    private String personName;
    private int age;
    private Patient patient;
    private int weight;
    private String community;
    private String address;
    private String city;
    private boolean hasVitalSigns;
    private String userType;
    private String hospital;

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
    
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    
    public boolean hasVitalSigns() {
        return hasVitalSigns;
    }

    public void setHasVitalSigns(boolean hasVitalSigns) {
        this.hasVitalSigns = hasVitalSigns;
    }

    public int getweight() {
        return weight;
    }

    public void setweight(int weight) {
        this.weight = weight;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public String getPersonName() {
        return personName;
    }
    
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public Patient getPatient() {
        return patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    @Override
    public String toString()
    {
        return this.personName;
    }
}

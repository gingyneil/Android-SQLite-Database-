package com.example.user1.ass4neil_arlina;

/**
 * Created by User1 on 2018-01-08.
 */

public class Nurse {

    private int nurseId;
    private String firstName;
    private String lastName;
    private String department;
    private String password;

    public  Nurse(){}

    public Nurse(int nurseId, String firstName, String lastName, String department, String password) {
        this.nurseId = nurseId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.password = password;
    }

    public int getNurseId() {

        return nurseId;
    }

    public void setNurseId(int nurseId) {
        this.nurseId = nurseId;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

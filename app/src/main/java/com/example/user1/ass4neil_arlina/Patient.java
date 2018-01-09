package com.example.user1.ass4neil_arlina;

/**
 * Created by User1 on 2018-01-08.
 */

public class Patient {

    private int patientId;
    private String firstName;
    private String  lastName;
    private String department;
    private int doctorId;
    private int room;


    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
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

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

   public Patient(){}

   public Patient(int patientId, String firstName, String lastName, String department, int doctorId, int room){
       super();
       this.patientId = patientId;
       this.firstName = firstName;
       this.lastName = lastName;
       this.department =   department;
       this.doctorId =  doctorId;
       this.room = room;

   }



}

package com.example.user1.ass4neil_arlina;

/**
 * Created by User1 on 2018-01-08.
 */

public class Test {

    public  Test(){}

    public Test(String testId, String patientId, String nurseId, String BPL, String BPH, String temp) {
        this.testId = testId;
        this.patientId = patientId;
        this.nurseId = nurseId;
        this.BPL = BPL;
        this.BPH = BPH;
        this.temp = temp;
    }

    public String getTestId() {

        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getNurseId() {
        return nurseId;
    }

    public void setNurseId(String nurseId) {
        this.nurseId = nurseId;
    }

    public String getBPL() {
        return BPL;
    }

    public void setBPL(String BPL) {
        this.BPL = BPL;
    }

    public String getBPH() {
        return BPH;
    }

    public void setBPH(String BPH) {
        this.BPH = BPH;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    private String testId;
    private String patientId;
    private String nurseId;
    private String BPL;
    private String BPH;
    private String temp;



}

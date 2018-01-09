package com.example.user1.ass4neil_arlina;

/**
 * Created by User1 on 2018-01-08.
 */

public class Test {

    private int testId;
    private int patientId;
    private int nurseId;
    private int BPL;
    private int BPH;
    private int temp;


    public Test(){}

    public Test(int testId, int patientId, int nurseId, int BPL, int BPH, int temp) {
        this.testId = testId;
        this.patientId = patientId;
        this.nurseId = nurseId;
        this.BPL = BPL;
        this.BPH = BPH;
        this.temp = temp;
    }

    public int getTestId() {

        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getNurseId() {
        return nurseId;
    }

    public void setNurseId(int nurseId) {
        this.nurseId = nurseId;
    }

    public int getBPL() {
        return BPL;
    }

    public void setBPL(int BPL) {
        this.BPL = BPL;
    }

    public int getBPH() {
        return BPH;
    }

    public void setBPH(int BPH) {
        this.BPH = BPH;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}

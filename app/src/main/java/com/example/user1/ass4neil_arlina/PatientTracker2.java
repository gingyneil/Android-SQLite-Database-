package com.example.user1.ass4neil_arlina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PatientTracker2 extends AppCompatActivity {

    //array of tables
    private static final String tables[]={"Patient","Test","Nurse","Doctor"};

    //array of create table strings
    private static final String tableCreatorString[] =
            {"CREATE TABLE Patient ( " +
                    "id INTEGER PRIMARY KEY, " +
                    "patientID int, " +
                    "FirstName TEXT, " + "LastName TEXT," + "Department TEXT, " + "DoctorID int," + "Room int);",
                    "CREATE TABLE Test ( " +
                            "id INTEGER PRIMARY KEY, " +
                            "patientID int, " +
                            "nurseID int, " + "BPL int," + "BPH int, " + "temperature int);",
                    "CREATE TABLE Nurse ( " +
                    "id INTEGER PRIMARY KEY, " +
                    "FirstName TEXT, " + "LastName TEXT," + "Department TEXT, "+"password TEXT);",
                    "CREATE TABLE Doctor ( " +
                            "id INTEGER PRIMARY KEY, " +
                            "FirstName TEXT, " + "LastName TEXT," + "Department TEXT, " + "password TEXT);"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_tracker2);


        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(PatientTracker.loginIdMessage);

        // Capture the layout's TextView and set the string as its text
        TextView textViewLogin = findViewById(R.id.loginView);
        textViewLogin.setText(message);

        final DatabaseManager db = new DatabaseManager(this);
        //db.createDatabase(getApplicationContext());
        db.dbInitialize( tables,tableCreatorString);
        final String fields[] = {"student_id","firstname","lastname"};
        final String record[] = new String[3];

        // Handle Test Records button
        final Button testRecordsButton = (Button) findViewById(R.id.testRecordsButton);
        final EditText testId = (EditText) findViewById(R.id.editTextTestId);
        final EditText patientId = (EditText) findViewById(R.id.editTextPatientId);
        final TextView nurseId  = (TextView) findViewById(R.id.editTextNurseId);
        final EditText bpl = (EditText) findViewById(R.id.editTextBpl);
        final EditText bph = (EditText) findViewById(R.id.editTextBph);
        final TextView temperature  = (TextView) findViewById(R.id.editTextTemp);
    }
}

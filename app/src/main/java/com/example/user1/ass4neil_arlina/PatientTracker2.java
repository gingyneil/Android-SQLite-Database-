package com.example.user1.ass4neil_arlina;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PatientTracker2 extends AppCompatActivity {

    //array of tables
    private static final String tables[]={"Patient","Test","Nurse","Doctor"};

    //array of create table strings
    private static final String tableCreatorString[] =
            {"CREATE TABLE Patient ( " +
                    "id INTEGER PRIMARY KEY, " +
                    "patientID int, " +
                    "FirstName TEXT, " + "LastName TEXT," + "Department TEXT, " + "DoctorID TEXT," + "Room TEXT);",
                    "CREATE TABLE Test ( " +
                            "id TEXT PRIMARY KEY, " +
                            "patientID TEXT, " +
                            "nurseID TEXT, " + "BPL TEXT," + "BPH TEXT, " + "temperature TEXT);",
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
        final String fields[] = {"id","patientID","nurseID","BPH","BPL","temperature"};
        final String record[] = new String[6];

        // Handle Test Records button

        final Button buttonSave = (Button) findViewById(R.id.buttonSave);
        final EditText testId = (EditText) findViewById(R.id.editTextTestId);
        final EditText patientId = (EditText) findViewById(R.id.editTextPatientId);
        final TextView nurseId  = (TextView) findViewById(R.id.editTextNurseId);
        final EditText bpl = (EditText) findViewById(R.id.editTextBpl);
        final EditText bph = (EditText) findViewById(R.id.editTextBph);
        final TextView temperature  = (TextView) findViewById(R.id.editTextTemp);

        final TextView display = (TextView) findViewById(R.id.showView);


        buttonSave.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

                record[1]= testId.getText().toString();
                record[2]= patientId.getText().toString();
                record[3] = nurseId.getText().toString();
                record[4] = bpl.getText().toString();
                record[5] = bph.getText().toString();
                record[6] = temperature.getText().toString();



                //populate the row with some values
                ContentValues values = new ContentValues();
                for (int i=1;i<record.length;i++)
                values.put(fields[i],record[i]);

                //add the row to the database
                db.addRecord(values, "Test", fields,record);

            }
        });

        final Button testRecordsButton = (Button) findViewById(R.id.testRecordsButton);
        testRecordsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Reading all records
                List table = db.getTable("Test");

                for (Object o : table) {
                    ArrayList row = (ArrayList)o;
                    // Writing table to log
                    String output="";
                    for (int i=0;i<row.size();i++)
                    {
                        output+= row.get(i).toString() + " ";
                        output+="\n";
                    }
                    display.setText(output);

                }
            }
        });
    }
}

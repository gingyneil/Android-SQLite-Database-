package com.example.user1.ass4neil_arlina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class PatientTracker extends AppCompatActivity {

    public static String loginIdMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_tracker);
    }


    public void login(View view){

        /** Called when the user taps the Send button */

            Intent intent = new Intent(this, PatientTracker2.class);
            EditText loginID = (EditText) findViewById(R.id.loginID);
            String message = loginID.getText().toString();
            intent.putExtra(loginIdMessage, message);
            startActivity(intent);


    }
}

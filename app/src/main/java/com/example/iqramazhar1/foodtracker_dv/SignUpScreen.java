package com.example.iqramazhar1.foodtracker_dv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpScreen extends AppCompatActivity {

    Button signedup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);

        signedup=(Button)findViewById(R.id.signup);

        signedup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent userdataentry;
                userdataentry=new Intent(getApplicationContext(),UserDataEntry.class);
                 startActivity(userdataentry);

            }
        });
    }
}

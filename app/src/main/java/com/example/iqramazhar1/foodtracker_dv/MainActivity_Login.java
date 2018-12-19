package com.example.iqramazhar1.foodtracker_dv;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity_Login extends AppCompatActivity {

    Button signupbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__login);


        signupbutton=(Button)findViewById(R.id.signup);

        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupscreen;
                signupscreen=new Intent(getApplicationContext(),SignUpScreen.class);
                startActivity(signupscreen);

            }
        });

    }
}

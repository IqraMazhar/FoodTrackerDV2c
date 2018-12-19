package com.example.iqramazhar1.foodtracker_dv;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserDataEntry extends AppCompatActivity {

    Button gotohome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data_entry);
        gotohome=(Button)findViewById(R.id.ok);

        gotohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohome;
                gotohome=new Intent(getApplicationContext(),MainTabActivity.class);
                startActivity(gotohome);

            }
        });
    }


}

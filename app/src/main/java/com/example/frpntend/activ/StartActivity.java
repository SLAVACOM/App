package com.example.frpntend.activ;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.frpntend.R;

public class StartActivity extends AppCompatActivity {
    Button Bbutton1,Bbutton2,Bbutton3,Bbutton4,Bbutton5,Bbutton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Bbutton1 = findViewById(R.id.button1);
        Bbutton2 = findViewById(R.id.button2);
        Bbutton3 = findViewById(R.id.button3);
        Bbutton4 = findViewById(R.id.button4);
        Bbutton5 = findViewById(R.id.button5);
        Bbutton6 = findViewById(R.id.button6);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.button1:
                        startActivity(new Intent(StartActivity.this,bus_act.class));
                        break;
                    case R.id.button2:
                        startActivity(new Intent(StartActivity.this,event_act.class));
                        break;
                    case R.id.button3:
                        startActivity(new Intent(StartActivity.this,login_act.class));
                        break;
                    case R.id.button4:
                        startActivity(new Intent(StartActivity.this,MainActivity.class));
                        break;
                    case R.id.button5:
                        startActivity(new Intent(StartActivity.this,NfcActivity2.class));
                        break;
                    case R.id.button6:
                        break;

                }
            }
        };
        Bbutton1.setOnClickListener(clickListener);
        Bbutton2.setOnClickListener(clickListener);
        Bbutton3.setOnClickListener(clickListener);
        Bbutton4.setOnClickListener(clickListener);
        Bbutton5.setOnClickListener(clickListener);
        Bbutton6.setOnClickListener(clickListener);

    }
}
package com.example.marek.activitiesandintents;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Bundle b = new Bundle(getIntent().getBundleExtra("Bundle"));

        String hello = getIntent().getExtras().getString("greeting");
        TextView sen1 = (TextView) findViewById(R.id.sen3);
        sen1.setText(hello);

        String stdName = b.getString("Name");
        String myname = "My name is " + stdName+".";
        TextView sen2 = (TextView) findViewById(R.id.sen2);
        sen2.setText(myname);

        int stdId = b.getInt("UserId");
        int num = getIntent().getExtras().getInt("num");
        String studentId = "My student id is "+stdId+" and PIN is "+num+".";
        TextView sen3 = (TextView) findViewById(R.id.sen3);
        sen3.setText(studentId);














    }
}

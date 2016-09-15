package com.example.marek.activitiesandintents;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class activity_third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_third);



        /*Button button3 = (Button) findViewById(R.id.a3_button);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent replyeIntent = new Intent();

                //TextView studentName = (TextView) findViewById(R.id.studentName);

                //setResult(Activity.RESULT_OK,replyeIntent);
                finish();
            }
        });*/
    }
}

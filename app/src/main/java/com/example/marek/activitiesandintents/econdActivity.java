package com.example.marek.activitiesandintents;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class econdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_econd);


        Button ok = (Button) findViewById(R.id.ok_button);
        ok.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent replyeIntent = new Intent();
                //lets pull the text out of the text both and tuck it into this Intent as the mesage extra
                EditText editText = (EditText) findViewById(R.id.userMessage);
                String mesageBoxMessage = editText.getText().toString();
                replyeIntent.putExtra("message",mesageBoxMessage);
                //set teh result of this activity to be the result_ok and pass... (on github)
                setResult(Activity.RESULT_OK,replyeIntent);
                finish();
            }
        });


    }
}

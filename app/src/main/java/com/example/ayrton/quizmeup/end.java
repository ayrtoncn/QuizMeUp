package com.example.ayrton.quizmeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class end extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.ayrton.quizmeup.MainActivity";

    private TextView Score_txt;

    private RadioButton A;
    private RadioButton B;
    private RadioButton C;

    private Button Submit;

    private Integer IntScore = 0;
    @Override
    public void onBackPressed(){

    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        Score_txt = (TextView) findViewById(R.id.Score);
        A = (RadioButton) findViewById(R.id.A);
        B = (RadioButton) findViewById(R.id.B);
        C = (RadioButton) findViewById(R.id.C);

        Intent intent = getIntent();
        String message = intent.getStringExtra(fourth.EXTRA_MESSAGE);
        IntScore = Integer.parseInt(message);
        Score_txt.setText(message);
    }

}


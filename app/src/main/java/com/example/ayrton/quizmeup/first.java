package com.example.ayrton.quizmeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class first extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.ayrton.quizmeup.MainActivity";

    private TextView Score_txt;

    private RadioButton A;
    private RadioButton B;
    private RadioButton C;

    private Button Submit;

    private Integer IntScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Score_txt = (TextView) findViewById(R.id.Score);
        A = (RadioButton) findViewById(R.id.A);
        B = (RadioButton) findViewById(R.id.B);
        C = (RadioButton) findViewById(R.id.C);
        changeScore(IntScore);
    }
    public void submit(View V){
        Intent intent = new Intent(this, second.class);
        if(B.isChecked()) {
            IntScore += 2;
            changeScore(IntScore);
            Toast.makeText(first.this,"Your answer correct",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(first.this,"Your answer incorrect",Toast.LENGTH_LONG).show();
        }
        String message = IntScore.toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    void changeScore(Integer score){
        Score_txt.setText(""+score);
    }


}

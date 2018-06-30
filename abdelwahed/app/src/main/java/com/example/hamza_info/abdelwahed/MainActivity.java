package com.example.hamza_info.abdelwahed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btn;
RadioButton rd1,rd2,rd3,rd4;
int count =0;
TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        result = (TextView) findViewById(R.id.result);
        rd1 = (RadioButton) findViewById(R.id.rep2);
        rd2 = (RadioButton) findViewById(R.id.q2rep4);
        rd3 = (RadioButton) findViewById(R.id.q3rep1);
        rd4 = (RadioButton) findViewById(R.id.q4rep1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rd1.isChecked())
                {
                    count++;
                }
                if (rd2.isChecked())
                {
                    count++;
                }
                if (rd3.isChecked())
                {
                    count++;
                }
                if (rd4.isChecked())
                {
                    count++;
                }
                result.setText("your score is :" + count + "\n" + "right answers are : Q1:B , Q2:D , Q3:A ,Q4:A ");
                count = 0;

            }
        });

    }
}

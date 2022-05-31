package com.example.task1;

import static com.example.task1.R.id.button;
import static com.example.task1.R.id.button2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.Math;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public Button result1;
    public Button option1;
    public Button option2;
    public Button num1;
    public Button num2;
    public Button result2;
    public Button option3;
    public Button option4;
    public Button num3;
    public Button num4;
    public Button result3;
    public Button option5;
    public Button option6;
    public Button num5;
    public Button num6;
    public Button result4;
    public Button option7;
    public Button option8;
    public Button num7;
    public Button num8;
    public Button end;
    public Button Score;
    Random rand = new Random();
    int p = rand.nextInt(100);
    int q = rand.nextInt(100);
    int p1 = rand.nextInt(100);
    int q1 = rand.nextInt(100);
    int p2 = rand.nextInt(100);
    int q2 = rand.nextInt(100);
    int p3 = rand.nextInt(100);
    int q3 = rand.nextInt(100);
    int r = 3;
    int count = 0;
    int score = 0;
    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result1 = findViewById(R.id.button3);
        result1.setText(String.valueOf(p+q));
        option1 = findViewById(R.id.button4);
        option1.setText(String.valueOf(p));
        option2 = findViewById(R.id.button5);
        option2.setText(String.valueOf(q));
        num1 = findViewById(R.id.button);
        num2 = findViewById(R.id.button2);
        result2 = findViewById(R.id.button10);
        result2.setText(String.valueOf(p1-q1));
        option3 = findViewById(R.id.button14);
        option3.setText(String.valueOf(p1));
        option4 = findViewById(R.id.button15);
        option4.setText(String.valueOf(q1));
        num3 = findViewById(R.id.button9);
        num4 = findViewById(R.id.button8);
        result3 = findViewById(R.id.button13);
        result3.setText(String.valueOf(p2*q2));
        option5 = findViewById(R.id.button16);
        option5.setText(String.valueOf(p2));
        option6 = findViewById(R.id.button17);
        option6.setText(String.valueOf(q2));
        num5 = findViewById(R.id.button11);
        num6 = findViewById(R.id.button12);
        result4 = findViewById(R.id.button20);
        result4.setText(String.valueOf(p3%q3));
        option7 = findViewById(R.id.button21);
        option7.setText(String.valueOf(p3));
        option8 = findViewById(R.id.button22);
        option8.setText(String.valueOf(q3));
        num7 = findViewById(R.id.button18);
        num8 = findViewById(R.id.button19);
        end = findViewById(R.id.button6);
        Score = findViewById(R.id.button7);
        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = option1.getText().toString();
                option1.setTextColor(Color.parseColor("#FF0000"));
                option1.setEnabled(false);
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = option2.getText().toString();
                option2.setTextColor(Color.parseColor("#FF0000"));
                option2.setEnabled(false);
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1.setText(a);
                a = null;
                count = count+1;
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2.setText(a);
                a = null;
                count = count+1;
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = option3.getText().toString();
                option3.setTextColor(Color.parseColor("#FF0000"));
                option3.setEnabled(false);
            }
        });
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = option4.getText().toString();
                option4.setTextColor(Color.parseColor("#FF0000"));
                option4.setEnabled(false);
            }
        });
        option5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = option5.getText().toString();
                option5.setTextColor(Color.parseColor("#FF0000"));
                option5.setEnabled(false);
            }
        });
        option6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = option6.getText().toString();
                option6.setTextColor(Color.parseColor("#FF0000"));
                option6.setEnabled(false);
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num3.setText(a);
                a = null;
                count = count+1;
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num4.setText(a);
                a = null;
                count = count+1;
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num5.setText(a);
                a = null;
                count = count+1;
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num6.setText(a);
                a = null;
                count = count+1;
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num7.setText(a);
                a = null;
                count = count+1;
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num8.setText(a);
                a = null;
                count = count+1;
            }
        });
        option7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = option7.getText().toString();
                option7.setTextColor(Color.parseColor("#FF0000"));
                option7.setEnabled(false);
            }
        });
        option8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = option8.getText().toString();
                option8.setTextColor(Color.parseColor("#FF0000"));
                option8.setEnabled(false);
            }
        });


        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("abcde"," coming here 123");
                if(count<8 ){
                    Toast.makeText(MainActivity.this,"Please fill all the values", Toast.LENGTH_LONG).show();
                }
                else if (Integer.parseInt((String) num1.getText())+Integer.parseInt((String) num2.getText()) == p+q & Integer.parseInt((String) num3.getText())-Integer.parseInt((String) num4.getText()) == p1-q1 & Integer.parseInt((String) num5.getText())*Integer.parseInt((String) num6.getText()) == p2*q2 & Integer.parseInt((String) num7.getText())%Integer.parseInt((String) num8.getText()) == p3%q3)
                {
                    score = score+1;
                    //Toast.makeText(MainActivity.this,"score:+{score}", Toast.LENGTH_LONG).show();
                    num1.setText(null);
                    num2.setText(null);
                    p = rand.nextInt(100);
                    q = rand.nextInt(100);
                    option1.setText(String.valueOf(p));
                    option2.setText(String.valueOf(q));
                    result1.setText(String.valueOf(p+q));
                    Score.setText(String.valueOf(score));
                    //Toast.makeText(MainActivity.this,"score:+{score}", Toast.LENGTH_LONG).show();
                    num3.setText(null);
                    num4.setText(null);
                    p1 = rand.nextInt(100);
                    q1 = rand.nextInt(100);
                    option3.setText(String.valueOf(p1));
                    option4.setText(String.valueOf(q1));
                    result2.setText(String.valueOf(p1-q1));
                    Score.setText(String.valueOf(score));
                    num5.setText(null);
                    num6.setText(null);
                    num7.setText(null);
                    num8.setText(null);
                    p2 = rand.nextInt(100);
                    q2 = rand.nextInt(100);
                    option5.setText(String.valueOf(p2));
                    option6.setText(String.valueOf(q2));
                    result3.setText(String.valueOf(p2*q2));
                    Score.setText(String.valueOf(score));
                    option7.setText(String.valueOf(p3));
                    option8.setText(String.valueOf(q3));
                    result4.setText(String.valueOf(p3%q3));
                    Score.setText(String.valueOf(score));
                    option1.setEnabled(true);
                    option2.setEnabled(true);
                    option3.setEnabled(true);
                    option4.setEnabled(true);
                    option5.setEnabled(true);
                    option6.setEnabled(true);
                    option7.setEnabled(true);
                    option8.setEnabled(true);

            }
                else{
                    Toast.makeText(MainActivity.this,"Ur ans is wrong,try again", Toast.LENGTH_LONG).show();
                    r =r-1;
                    num1.setText(" ");
                    num2.setText(" ");
                    p = rand.nextInt(100);
                    q = rand.nextInt(100);
                    option1.setText(String.valueOf(p));
                    option2.setText(String.valueOf(q));
                    result1.setText(String.valueOf(p+q));
                    Score.setText(String.valueOf(score));
                    //Toast.makeText(MainActivity.this,"score:+{score}", Toast.LENGTH_LONG).show();
                    num3.setText(" ");
                    num4.setText(" ");
                    p1 = rand.nextInt(100);
                    q1 = rand.nextInt(100);
                    option3.setText(String.valueOf(p1));
                    option4.setText(String.valueOf(q1));
                    result2.setText(String.valueOf(p1-q1));
                    Score.setText(String.valueOf(score));
                    num5.setText(" ");
                    num6.setText(" ");
                    num7.setText(" ");
                    num8.setText(" ");
                    p2 = rand.nextInt(100);
                    q2 = rand.nextInt(100);
                    option5.setText(String.valueOf(p2));
                    option6.setText(String.valueOf(q2));
                    result3.setText(String.valueOf(p2*q2));
                    Score.setText(String.valueOf(score));
                    option7.setText(String.valueOf(p3));
                    option8.setText(String.valueOf(q3));
                    result4.setText(String.valueOf(p3%q3));
                    Score.setText(String.valueOf(score));
                    option1.setEnabled(true);
                    option2.setEnabled(true);
                    option3.setEnabled(true);
                    option4.setEnabled(true);
                    option5.setEnabled(true);
                    option6.setEnabled(true);
                    option7.setEnabled(true);
                    option8.setEnabled(true);

                    if(r==0){
                        Toast.makeText(MainActivity.this,"U lost all ur lives so start from first", Toast.LENGTH_LONG).show();
                        Score.setText("0");
                        score = 0;
                        r=3;
                    }
                }
        }});
    }
}

package jp.techacademy.bryan.thogerson.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    double theResult;

    EditText input1;
    EditText input2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        input1 = (EditText) findViewById(R.id.editText1);
        input2 = (EditText) findViewById(R.id.editText2);
    }

    @Override
    public void onClick(View v) {

        double firstInput;
        double secondInput;

        Intent intent = new Intent(this, SecondActivity.class);

        firstInput = Double.parseDouble(input1.getText().toString());
        secondInput = Double.parseDouble(input2.getText().toString());

        if(v.getId() == R.id.button1){
            theResult = firstInput + secondInput;
        }else if(v.getId() == R.id.button2){
            theResult = firstInput - secondInput;
        } else if(v.getId() == R.id.button3){
            theResult = firstInput * secondInput;
        } else if(v.getId() == R.id.button4){
            theResult = firstInput / secondInput;
        }

        intent.putExtra("VALUE1", theResult);
        startActivity(intent);
    }
}

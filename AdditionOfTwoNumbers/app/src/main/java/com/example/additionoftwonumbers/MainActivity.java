package com.example.additionoftwonumbers;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edittxt1;
    private EditText edittxt2;
    private Button button;
    private TextView txtView;

    @Override
    public void onCreate(Bundle  savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittxt1 = findViewById(R.id.num1);
        edittxt2 = findViewById(R.id.num2);
        button = findViewById(R.id.button);
        txtView = findViewById(R.id.output);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String num1 = edittxt1.getText().toString();
                String num2 = edittxt2.getText().toString();
                int number1 = Integer.parseInt(num1);
                int number2 = Integer.parseInt(num2);
                int res = number1+number2;
                String finalres= "Addition of "+number1+"   +  "+number2+" = "+res;
                txtView.setText(finalres);
            }
        });

    }
}

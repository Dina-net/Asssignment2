package com.example.asssignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText e;
    TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b =(Button) findViewById(R.id.Butt1);
        e=(EditText) findViewById(R.id.textP1);
        v=(TextView) findViewById(R.id.textView2);

        b.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {

            v.setText("Hello " + e.getText().toString()+"!");
        }
        });




    }
}
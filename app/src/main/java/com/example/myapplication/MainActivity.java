package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;                  // Creating object
    private EditText textphone;

    private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);          // Declaring object
        button = findViewById(R.id.button);
        textphone = findViewById(R.id.TextPhone);
        textview = findViewById(R.id.textView);
//        button.setOnClickListener(new View.OnClickListener() {          // use to do while clicking on button
//            @Override
//            public void onClick(View view) {
//               // Toast.makeText(MainActivity.this, "Button is working ", Toast.LENGTH_SHORT).show(); // show on clicking message type
//                String s =textphone.getText().toString();    //to get input from user
//                double cm = Integer.parseInt(s);
//                //double foot = cm/30.48 ;
//                //textview.setText("The value in foot is"+ foot);
//
//               // double cm = 180; // input height in centimeters
//                double inches = cm / 2.54;
//                int feet = (int) (inches / 12);
//                inches = inches % 12;
//                String output =   "Your height is "+feet+ "ft " + String.format("%.0f", inches) + "in";
//                textview.setText(output);
//
//            }
//        });
    }
        public void convert(View view)
        {
            String s = textphone.getText().toString();
            double cm = Integer.parseInt(s);
                //double foot = cm/30.48 ;
                //textview.setText("The value in foot is"+ foot);

               // double cm = 180; // input height in centimeters
                double inches = cm / 2.54;
                int feet = (int) (inches / 12);
                inches = inches % 12;
                String output =   "Your height is "+feet+ "ft " + String.format("%.0f", inches) + "in";
                textview.setText(output);
        }
}

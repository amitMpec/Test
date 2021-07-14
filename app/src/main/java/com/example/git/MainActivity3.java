package com.example.git;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toast.makeText(this, "Hello world", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hi there", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "This is fifth branch", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "This is sixth branch", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "this is seventh branch", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "This is telusko training branch", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "This is Amit branch", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "New Amit", Toast.LENGTH_SHORT).show();
    }
}
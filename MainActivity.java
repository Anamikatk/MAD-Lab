package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkSelect(View view) {
        CheckBox checkBox= (CheckBox)view;
        System.out.println(checkBox.isChecked());

        if (view.getId() == R.id.c1) {
            if (checkBox.isChecked())
                Toast.makeText(MainActivity.this, "English is selected", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(MainActivity.this, "English is deselected", Toast.LENGTH_SHORT).show();
        }
        else if(view.getId() == R.id.c2) {
            if(checkBox.isChecked())
                Toast.makeText(MainActivity.this,"Malayalam is selected",Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(MainActivity.this,"Malayalam is deselected",Toast.LENGTH_SHORT).show();
        }
    }
}
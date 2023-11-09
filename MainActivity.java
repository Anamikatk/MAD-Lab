package com.example.ex6;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void radioHandler(View view){
        boolean selected=((RadioButton) view).isChecked();
        System.out.println(selected);
            if (view.getId() == R.id.r1) {
                if (selected)
                    Toast.makeText(this, "male selected", Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.r2) {
                if (selected)
                    Toast.makeText(this, "female selected", Toast.LENGTH_SHORT).show();
            }

    }
}


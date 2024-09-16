package com.timbuchalka.volumeareaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Cylinder extends AppCompatActivity {

    EditText radius;
    EditText hight;
    TextView title, result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cylinder);

        radius = findViewById(R.id.editText_sphere);
        hight = findViewById(R.id.editText_hight);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Radius = radius.getText().toString();
                String Hight = hight.getText().toString();

                int r = Integer.parseInt(Radius);
                int h = Integer.parseInt(Hight);

                // V =  πr2h

                double volume =  (4/3) * 3.14159 * r*r*h;
                result.setText("V = "+volume+" m^3");
            }
        });

    }
}
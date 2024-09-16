package com.timbuchalka.volumeareaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Prism extends AppCompatActivity {

    EditText sphere_radius;
    EditText sphere_hight;
    TextView title, result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_prism);

        sphere_radius = findViewById(R.id.editText_sphere);
        sphere_hight = findViewById(R.id.editText_hight);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.textView3);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = sphere_radius.getText().toString();
                String hight = sphere_hight.getText().toString();

                int b = Integer.parseInt(radius);
                int h = Integer.parseInt(hight);
                // V =B*H

                double volume =  b*h;
                result.setText("V = "+volume+" m^3");
            }
        });

    }
}
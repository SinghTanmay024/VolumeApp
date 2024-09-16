package com.timbuchalka.volumeareaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Shape> shapeArrayList;

    MyCustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        shapeArrayList = new ArrayList<>();

        Shape s1 = new Shape(R.drawable.sphere, "Sphere");
        Shape s2 = new Shape(R.drawable.cylinder, "Cylinder");
        Shape s3 = new Shape(R.drawable.cube, "Cube");
        Shape s4 = new Shape(R.drawable.prism, "Prism");

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);

        adapter = new MyCustomAdapter(shapeArrayList,getApplicationContext());

        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String ans = adapter.getItem(position).shapeName;
                if(ans.equals("Sphere")){
                    Intent i = new Intent(getApplicationContext(), Sphere.class);
                    startActivity(i);
                }else if(ans.equals("Cube")){
                    Intent i = new Intent(getApplicationContext(), Cube.class);
                    startActivity(i);
                }else if(ans.equals("Cylinder")){
                    Intent i = new Intent(getApplicationContext(), Cylinder.class);
                    startActivity(i);
                }else if(ans.equals("Prism")){
                    Intent i = new Intent(getApplicationContext(), Prism.class);
                    startActivity(i);
                }
            }
        });

    }
}
package com.example.gridview;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridview);
        ArrayList<Model> list = new ArrayList<>();
        list.add(new Model("Rose",R.drawable.img_5));
        list.add(new Model("Keya",R.drawable.img));
        list.add(new Model("Sunflower",R.drawable.img_1));
        list.add(new Model("Lavender",R.drawable.img_3));
        list.add(new Model("Lotus",R.drawable.img_2));
        list.add(new Model("Marigold",R.drawable.img_4));


        GridViewAdapter adapter = new GridViewAdapter(this,list);
        gridView.setAdapter(adapter);




    }
}
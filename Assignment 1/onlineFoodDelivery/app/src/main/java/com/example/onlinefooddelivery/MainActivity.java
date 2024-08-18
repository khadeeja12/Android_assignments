package com.example.onlinefooddelivery;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.myListView);
        String[] names = {"Chicken Biryani", "Parotta", "beef curry", "Burger","Pizza","French fries"};
        int[] images = {R.drawable.cb, R.drawable.parotta, R.drawable.beefcry, R.drawable.burger,R.drawable.pizza,R.drawable.french_fries};

        CustomAdapter customAdapter = new CustomAdapter(this, names, images);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedItem = names[position];
            Toast.makeText(MainActivity.this, "Ordered: " + selectedItem, Toast.LENGTH_SHORT).show();
        });
    }
}

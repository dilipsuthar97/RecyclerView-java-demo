package com.dilipsuthar.recyclerview_java_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> items = new ArrayList<>();
    Adapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // This file is stored in res -> values -> strings.xml
        String arr[] = getResources().getStringArray(R.array.country_name);
        items.addAll(Arrays.asList(arr));

        adapter = new Adapter(getApplicationContext(), items);

        recyclerView.setAdapter(adapter);

    }

}

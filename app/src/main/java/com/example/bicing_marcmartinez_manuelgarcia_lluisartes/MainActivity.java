package com.example.bicing_marcmartinez_manuelgarcia_lluisartes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
 private RecyclerView recyclerView;
 private AdaptorEstacion adaptorEstacion;
 private Context context;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.ToolbarMenu);
        setSupportActionBar(toolbar);
        //part de recycleview
        recyclerView=findViewById(R.id.viewStations);
        adaptorEstacion = new AdaptorEstacion(this);
        recyclerView.setAdapter(adaptorEstacion);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        boolean back = true;

        return back;
    }
}
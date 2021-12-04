package com.example.myapplicationmd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Mostrar el fragment
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, new LoginfragmentActivity())
                    .commit();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()) {
            case R.id.jair:
                Toast.makeText(this, "jairrrrr", Toast.LENGTH_SHORT).show();
                /*getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, new LoginfragmentActivity())
                        .addToBackStack(null)
                        .commit();*/
                break;
            case R.id.ariana:
                Toast.makeText(this, "arianaaa", Toast.LENGTH_SHORT).show();
                /*getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, new Homefragment())
                        .addToBackStack(null)
                        .commit();*/
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
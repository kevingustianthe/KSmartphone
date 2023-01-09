package com.example.ksmartphone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSmartphones;
    private ArrayList<Smartphone> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSmartphones = findViewById(R.id.rv_smartphone);
        rvSmartphones.setHasFixedSize(true);

        list.addAll(SmartphonesData.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        rvSmartphones.setLayoutManager(new LinearLayoutManager(this));
        ListSmartphoneAdapter listSmartphoneAdapter = new ListSmartphoneAdapter(list);
        rvSmartphones.setAdapter(listSmartphoneAdapter);

        listSmartphoneAdapter.setOnItemClickCallback(new ListSmartphoneAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Smartphone data) {
                showSelectedSmartphone(data);
            }
        });
    }

    private void showSelectedSmartphone(Smartphone smartphone) {
        Intent showSmartphoneIntent = new Intent(MainActivity.this, SmartphoneInfo.class);
        showSmartphoneIntent.putExtra(SmartphoneInfo.EXTRA_NAME, smartphone.getName());
        showSmartphoneIntent.putExtra(SmartphoneInfo.EXTRA_DESKRIPSI, smartphone.getDetail());
        showSmartphoneIntent.putExtra("imgPhoto", smartphone.getPhoto());
        startActivity(showSmartphoneIntent);
    }

    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (menu instanceof MenuBuilder) {
            ((MenuBuilder) menu).setOptionalIconsVisible(true);
        }
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent showAboutIntent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(showAboutIntent);
        return super.onOptionsItemSelected(item);
    }
}
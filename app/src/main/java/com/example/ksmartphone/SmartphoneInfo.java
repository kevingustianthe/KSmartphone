package com.example.ksmartphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SmartphoneInfo extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DESKRIPSI = "extra_deskripsi";
    int imgValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smartphone_info);

        TextView tvitemName = findViewById(R.id.tv_item_name);
        TextView tvItemDeskripsi = findViewById(R.id.tv_item_deskripsi);
        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        Button btnShare = findViewById(R.id.action_share);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String deskripsi = getIntent().getStringExtra(EXTRA_DESKRIPSI);
        Bundle bundle = getIntent().getExtras();

        tvitemName.setText(name);
        tvItemDeskripsi.setText(deskripsi);
        if (bundle != null) {
            imgValue = bundle.getInt("imgPhoto");
        }
        imgItemPhoto.setImageResource(imgValue);

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, name + "\n" + deskripsi);
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
            }
        });
    }
}
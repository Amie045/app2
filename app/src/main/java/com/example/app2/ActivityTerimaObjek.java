package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityTerimaObjek extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terima_objek);
        textView = findViewById(R.id.textview);

        MyBiodata biodata = getIntent().getParcelableExtra("Biodata");

        textView.setText("Nama Ana " + biodata.getNama() + ",  Umur Ana " + biodata.getUmur());


    }
}

package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnmoveactivity = findViewById(R.id.btn_move_activity);
        btnmoveactivity.setOnClickListener(this);

        Button btnmoveactivitywhitdata = findViewById(R.id.btn_move_activity_data);
        btnmoveactivitywhitdata.setOnClickListener(this);

        Button btnmoveactivitywhitobjek = findViewById(R.id.btn_move_activity_objek);
        btnmoveactivitywhitobjek.setOnClickListener(this);

        Button btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, moveactivity.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_move_activity_data:
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "DicodingAcademy Boy");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5);
                startActivity(moveWithDataIntent);
                break;


            case R.id.btn_move_activity_objek:
                MyBiodata biodata = new MyBiodata("ami", 15);
                Intent keActivityDua = new Intent(MainActivity.this, ActivityTerimaObjek.class);

                keActivityDua.putExtra("Biodata", biodata);
                startActivity(keActivityDua);
                break;

            case R.id.btn_dial_number:
                String phoneNumber = "081210841382";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(dialPhoneIntent);
                break;

        }
    }
}

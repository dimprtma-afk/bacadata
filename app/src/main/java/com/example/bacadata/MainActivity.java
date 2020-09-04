package com.example.bacadata;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bacadata.MainActivity3;
import com.example.bacadata.R;
import com.example.bacadata.mainactivity2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button daftar, keluhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        daftar = (Button)findViewById(R.id.daftar);
        daftar.setOnClickListener(this);
        keluhan = (Button)findViewById(R.id.keluhan);
        keluhan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.daftar:
            Intent daftar = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(daftar);
            break;
            case R.id.keluhan:
            Intent keluhan = new Intent(MainActivity.this, mainactivity2.class);
            startActivity(keluhan);
            break;
            default:
                break;
        }
    }

    public void keluhan(View view) {
    }
}
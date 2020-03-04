package com.example.library.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.library.R;

public class secondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void second(View view) {

    }

    public void third(View view) {
    }

    public void fourth(View view) {
    }

    public void fifth(View view) {
    }

    public void sixth(View view) {
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}

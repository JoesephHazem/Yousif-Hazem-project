package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class nextpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextpage);
    }


    public void mut(View view){
        Intent intent = new Intent(nextpage.this,mut.class);
        startActivity(intent);
    }

    public void man(View view) {
        Intent intent = new Intent(nextpage.this,man.class);
        startActivity(intent);
    }

    public void ise(View view) {
        Intent intent = new Intent(nextpage.this,ise.class);
        startActivity(intent);
    }
}

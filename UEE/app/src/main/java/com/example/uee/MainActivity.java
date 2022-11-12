package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnViewAllRequest;
    Button btnViewAllProvide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnViewAllRequest = findViewById(R.id.btnViewAllRequest);
        btnViewAllProvide = findViewById(R.id.btnViewAllProvide);

        btnViewAllRequest.setOnClickListener(this);
        btnViewAllProvide.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnViewAllRequest:
                startActivity(new Intent(MainActivity.this, CategoryList.class));
                break;
            case R.id.btnViewAllProvide:
                startActivity(new Intent(MainActivity.this,ViewAllProvideRetrieveActivity.class));
                break;
        }

    }
}
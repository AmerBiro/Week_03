package com.example.week_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonGoToMainPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonGoToMainPage = findViewById(R.id.buttonGoToMainPage);
    }

    public void setButtonGoToMainPage(View view){
    Intent intent = new Intent(this, Page_00.class);
            startActivity(intent);
    }
}

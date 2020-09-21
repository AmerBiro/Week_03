package com.example.week_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Page_00 extends AppCompatActivity {

    private TextView textView;
    private Button page_01;
    private Button page_02;
    private Button page_03;
    private Button page_04;
    private Button page_05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_00);

        page_01 = findViewById(R.id.buttonGoToPage_01);
        page_02 = findViewById(R.id.buttonGoToPage_02);
        page_03 = findViewById(R.id.buttonGoToPage_03);
        page_04 = findViewById(R.id.buttonGoToPage_04);
        page_05 = findViewById(R.id.buttonGoToPage_05);

    }

    public void setPage_01(View view){
        Intent intent = new Intent(this, Page_01.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Page 01", Toast.LENGTH_SHORT).show();
    }

    public void setPage_02(View view){
        Intent intent = new Intent(this, Page_02.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Page 02", Toast.LENGTH_SHORT).show();
    }

    public void setPage_03(View view){
        Intent intent = new Intent(this, Page_03.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Page 03", Toast.LENGTH_SHORT).show();
    }

    public void setPage_04(View view){
        Intent intent = new Intent(this, Page_04.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Page 04", Toast.LENGTH_SHORT).show();
    }

    public void setPage_05(View view){
        Intent intent = new Intent(this, Page_05.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Page 05", Toast.LENGTH_SHORT).show();
    }

}
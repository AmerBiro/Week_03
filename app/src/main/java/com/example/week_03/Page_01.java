package com.example.week_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Page_01 extends AppCompatActivity {

    private Button page_01_button01;
    private Button page_01_button02;
    private Button buttonGoToPage_01_01;
    private TextView page_01_text01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_01);

        page_01_button01 = findViewById(R.id.page_01_button01);
        page_01_button02 = findViewById(R.id.page_01_button02);
        buttonGoToPage_01_01 = findViewById(R.id.buttonGoToPage_01_01);

        page_01_text01 = findViewById(R.id.page_01_text01);

        page_01_button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == view) {
                    page_01_text01.setText("yesssss, you did it!");
                    page_01_text01.setTextColor(Color.WHITE);
                    page_01_text01.setVisibility(View.VISIBLE);
                } else page_01_text01.setVisibility(View.INVISIBLE);
                }
        });

        page_01_button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (page_01_text01.getVisibility() == View.VISIBLE){
                    page_01_text01.setVisibility(View.INVISIBLE);
                    page_01_button02.setText("Unhide");

                } else {
                    page_01_text01.setVisibility(View.VISIBLE);
                    page_01_button02.setText("Hide");
                }
            }
        });
    }

    public void buttonGoToPage_01_01(View view){
        Intent intent = new Intent(this, Page_01_01.class);
        startActivity(intent);
    }

}
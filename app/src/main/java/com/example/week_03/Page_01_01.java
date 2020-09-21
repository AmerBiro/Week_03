package com.example.week_03;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class Page_01_01 extends AppCompatActivity {

    private EditText text01;
    private Button button01;
    private WebView webView01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_01_01);

         text01 = findViewById(R.id.text01);;
         button01 = findViewById(R.id.button01);;
         webView01 = findViewById(R.id.webView01);;

         button01.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String str = text01.getText().toString();
                 if (TextUtils.isEmpty(str)){
                     text01.setError("You need to type a url");
                     text01.setHintTextColor(Color.RED);
                     return;
                 } else {
                     webView01.loadUrl("https://" + text01.getText().toString() + ".dk");
                 }

             }
         });

    }
}
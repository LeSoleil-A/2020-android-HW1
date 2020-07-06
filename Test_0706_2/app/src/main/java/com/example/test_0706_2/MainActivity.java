package com.example.test_0706_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTest_text;
    private Button mBtnTest_edit;
    private Button mBtnTest_radio;
    private Button mBtnTest_check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTest_text = findViewById(R.id.btn_test_1);
        mBtnTest_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Jump to textview
                Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
                startActivity(intent);
                Log.i("MainActivity", " on Click: Test TextView ");
            }
        });
        mBtnTest_edit = findViewById(R.id.btn_test_2);
        mBtnTest_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Jump to editview
                Intent intent = new Intent(MainActivity.this, EditViewActivity.class);
                startActivity(intent);
                Log.i("MainActivity", " on Click: Test EdiView ");
            }
        });
        mBtnTest_radio = findViewById(R.id.btn_test_3);
        mBtnTest_radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Jump to radiobutton
                Intent intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                startActivity(intent);
                Log.i("MainActivity", " on Click: Test RadioButton ");
            }
        });
        mBtnTest_check = findViewById(R.id.btn_test_4);
        mBtnTest_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Jump to radiobutton
                Intent intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                startActivity(intent);
                Log.i("MainActivity", " on Click: Test CheckBox ");
            }
        });
    }
}

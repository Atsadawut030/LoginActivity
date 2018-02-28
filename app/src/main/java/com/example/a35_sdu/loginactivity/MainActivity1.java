package com.example.a35_sdu.loginactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {
TextView nameTextView;
String getNameString;

    @Override
    protected void onCreate(Bundle savesInstanceState) {
        super.onCreate(savesInstanceState);
        setContentView(R.layout.activity_main);

        nameTextView=findViewById(R.id.txvName);
        getNameString=getIntent().getStringExtra("nameString");
        nameTextView.setText("ยินดีต้อนรับ"+getNameString+"เข้าสู่ระบบ");
    }

    }

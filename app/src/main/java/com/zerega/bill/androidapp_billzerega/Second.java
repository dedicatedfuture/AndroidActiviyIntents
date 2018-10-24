package com.zerega.bill.androidapp_billzerega;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Toast;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    private TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast.makeText(Second.this, "Second Activity Started", Toast.LENGTH_SHORT).show();


        textOutput =(TextView) findViewById(R.id.textOutput);
    Intent intent = getIntent();

        String str1 = getIntent().getExtras().getString("key1");
        String str2 = getIntent().getExtras().getString("key2");

        Toast.makeText(Second.this, str1, Toast.LENGTH_SHORT).show();
        Toast.makeText(Second.this, str2, Toast.LENGTH_SHORT).show();
        textOutput.setText(str1 + " " +str2);
    }
}

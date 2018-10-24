package com.zerega.bill.androidapp_billzerega;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;
import java.lang.StringBuilder;

public class MainActivity extends AppCompatActivity {
    private Button mButtonConfirm;
    private Button mButtonStart;
    private TextView mTextView;
    private EditText mEditText;
    private Button mPassingParameters;
    private EditText editText1;
    private EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mButtonConfirm = (Button) findViewById(R.id.btn_confirm);
        mButtonStart = (Button) findViewById(R.id.btn_start);

        mTextView = (TextView) findViewById(R.id.greeting);
        mEditText = (EditText) findViewById(R.id.name);
        mPassingParameters = (Button) findViewById(R.id.btn_pass_params);
        editText1 = (EditText) findViewById(R.id.edit1);
        editText2 = (EditText) findViewById(R.id.edit2);


        mTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               Toast.makeText(MainActivity.this, R.string.toast2, Toast.LENGTH_SHORT).show();
            }
        });

        mPassingParameters.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                Intent myIntent = new Intent(MainActivity.this, Second.class);
                String str1 = editText1.getText().toString();
                String str2 = editText2.getText().toString();

                myIntent.putExtra("key1", str1);
                myIntent.putExtra("key2", str2);
                MainActivity.this.startActivity(myIntent);

                return true;
            }

        });

        mButtonStart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivityForResult(intent, 0);
            }
        });


    }



    public void simpleClick(final View view){
        if(view.getId() == R.id.btn_confirm){
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT ).show();

        }
    }



}

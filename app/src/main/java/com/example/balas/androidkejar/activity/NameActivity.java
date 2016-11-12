package com.example.balas.androidkejar.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.balas.androidkejar.R;

public class NameActivity extends AppCompatActivity {
    private TextView tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        tvName = (TextView) findViewById(R.id.tv_name);
        Intent name = getIntent();
        Bundle bundle = name.getExtras();
        if(bundle !=null){
            String yourName = (String) bundle.get("YourName");
            tvName.setText("Hello "+yourName);
        }
    }
}

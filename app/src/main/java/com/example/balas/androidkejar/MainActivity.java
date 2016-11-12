package com.example.balas.androidkejar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.balas.androidkejar.activity.MoveActivity;
import com.example.balas.androidkejar.activity.NameActivity;

public class MainActivity extends AppCompatActivity {
    private EditText edtName;
    private Button btnCek, btnPindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = (EditText) findViewById(R.id.edt_name);
        btnCek = (Button) findViewById(R.id.btn_name);
        btnPindah = (Button) findViewById(R.id.btn_pindah);

        final String name = edtName.getText().toString();

        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cekName = new Intent(MainActivity.this, NameActivity.class);
                cekName.putExtra("Yourname", edtName.getText().toString());

            }
        });

        btnPindah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, MoveActivity.class));
                finish();
            }
        });

    }
}
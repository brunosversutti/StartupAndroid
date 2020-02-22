package com.example.startup2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaLogin extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        ((Button) findViewById(R.id.botaoEntrar)).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent1 = new Intent(TelaLogin.this, TelaMenu.class);
        startActivityForResult(intent1, 1);

    }
}

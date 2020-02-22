package com.example.startup2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class PrimeiraTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_tela);
        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override public void run() {
                mostrarTelaPrincipal();
            }
        }, 9000);
    }
    private void mostrarTelaPrincipal() {

        Intent intent = new Intent(PrimeiraTela.this,TelaLogin.class);
        startActivity(intent);
        finish();
    }
}

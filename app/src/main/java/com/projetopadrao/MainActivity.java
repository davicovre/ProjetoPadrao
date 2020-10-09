package com.projetopadrao;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.novo_design);
    }

    @Override
    protected void onStart(){
        Log.d("ciclo_de_vida", "onStart - O codigo da atividade começou a ser executado");
                super.onStart();

    }
    @Override
    protected void onPause(){
        Log.d("ciclo_de_vida", "onPause - iniciou o término da activity");
                super.onPause();

    }
    @Override
    protected void onStop(){
        Log.d("ciclo_de_vida", "onStop - A atividade não está mais visível ao usuário");
                super.onStop();

    }
    @Override
    protected void onDestroy(){
        Log.d("ciclo_de_vida", "onDestroy - A activity foi completamente destruída");
                super.onDestroy();

    }
}
package edu.upc.eseiaat.pma.exemples.personalitzarsalutacio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    private TextView textViewSalutacio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        textViewSalutacio = (TextView)findViewById(R.id.textViewSalutacio);
        String missatge = getString(R.string.missatgeSalutacio);
        String defaultNom = getString(R.string.defaultName);
        textViewSalutacio.setText(String.format(missatge,defaultNom));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==SecondActivity.REQUEST_NAME) {
            if(resultCode==RESULT_OK) {
                String missatge = getString(R.string.missatgeSalutacio);
                String nom = data.getExtras().getString(SecondActivity.KEY_NAME);
                textViewSalutacio.setText(String.format(missatge,nom));
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void personalitzar(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivityForResult(intent,SecondActivity.REQUEST_NAME);
    }
}

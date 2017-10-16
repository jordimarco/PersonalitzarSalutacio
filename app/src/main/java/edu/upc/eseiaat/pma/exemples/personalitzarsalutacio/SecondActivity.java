package edu.upc.eseiaat.pma.exemples.personalitzarsalutacio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    public static String  KEY_NAME = "KEY_NAME";
    public static int REQUEST_NAME = 1;
    private EditText editTextNom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editTextNom = (EditText)findViewById(R.id.editTextNom);
    }

    public void finalitzar(View view) {
        Intent data = new Intent();
        data.putExtra(KEY_NAME,editTextNom.getText().toString());
        setResult(RESULT_OK,data);
        finish();
    }
}

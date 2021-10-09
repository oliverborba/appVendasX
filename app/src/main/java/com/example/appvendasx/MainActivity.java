package com.example.appvendasx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.years_array, android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
    }

    public void onClick(View view) {
        EditText valor = (EditText) findViewById(R.id.editvalor);

        TextView mostraValor = (TextView) findViewById(R.id.valorFinal);
        mostraValor.setText(valor.getText());

        Spinner spin1 = (Spinner) findViewById(R.id.spinner);
        String ano = spin1.getSelectedItem().toString();
        TextView mostrarAno = (TextView) findViewById(R.id.anoFinal);
        mostrarAno.setText(ano);
    }
}
package com.judson.conversordemoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText et_valorEuros;
    private Button btn_converter;
    private TextView tv_valorDolares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_valorEuros = findViewById(R.id.et_valorEmEuros);
        tv_valorDolares = findViewById(R.id.tv_valorEmDolar);
        btn_converter = findViewById(R.id.bt_converter);


        btn_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double valorEuros = Double.parseDouble(et_valorEuros.getText().toString());
                DecimalFormat arredondar = new DecimalFormat("#.##");
                double valorDolares =  Double.parseDouble(arredondar.format(valorEuros * 0.80));

                tv_valorDolares.setText(String.valueOf(valorDolares)+" $");
            }
        });
    }



}
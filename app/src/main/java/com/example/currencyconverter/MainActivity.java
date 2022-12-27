package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void currencyconverter(View view){
        Log.i("Info","Button pressed");
        EditText editTextNumber=(EditText) findViewById(R.id.editTextNumber);
        String amountsInPounds= editTextNumber.getText().toString();
        double amountInPoundsDouble=Double.parseDouble(amountsInPounds);
        double amountInDollarsDouble=amountInPoundsDouble * 1.3;
        String amountInDollarsstring=String.format("%.2f",amountInDollarsDouble);
        Toast.makeText(this,amountInDollarsstring, Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
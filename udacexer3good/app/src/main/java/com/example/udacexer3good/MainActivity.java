package com.example.udacexer3good;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitorder(View view){
        EditText numberofcoffees=(EditText) findViewById(R.id.numberofcoffees);
        EditText price=(EditText) findViewById(R.id.price);
        int x=Integer.parseInt(numberofcoffees.getText().toString());
        int y=Integer.parseInt(price.getText().toString());
        int total=x*y;

        TextView btotal=(TextView) findViewById(R.id.totalamount);
        btotal.setText(NumberFormat.getCurrencyInstance().format(total));

    }
}
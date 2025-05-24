package com.example.udacexer2price;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitorder(View view){
        display(50);
        displayPrice(2*5);
    }
    private void display(int number){
        TextView quantityTextView = (TextView) findViewById(R.id.quantitytext);
        quantityTextView.setText(""+number);
    }
    private void displayPrice(int number){
        TextView tprice=(TextView) findViewById(R.id.price);
        tprice.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
package com.example.price_increase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View view) {
        TextView text1 = findViewById(R.id.value);
        int x = Integer.parseInt(text1.getText().toString());
        x = x + 1;
        text1.setText(String.valueOf(x));
    }
    public void minus(View view){
        TextView text1 = findViewById(R.id.value);
        int x = Integer.parseInt(text1.getText().toString());
        x = x - 1;
        text1.setText(String.valueOf(x));
    }
    public void submitorder(View view){
        TextView text1 = findViewById(R.id.value);
        TextView price = findViewById(R.id.price);
        TextView t = findViewById(R.id.total);
        int x = Integer.parseInt(text1.getText().toString());
        int y = Integer.parseInt(price.getText().toString());
        int z = x * y;
        t.setText(String.valueOf(z));
    }
}
package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void tomenu(View view){

        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
        Toast.makeText(this,"to menu sucessfully",Toast.LENGTH_LONG).show();

    }
    public void logout(View view){

        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        Toast.makeText(this,"Logout sucessfully",Toast.LENGTH_LONG).show();
    }
}
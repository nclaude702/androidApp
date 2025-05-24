package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void galley(View view){

        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
        Toast.makeText(this,"to menu sucessfully",Toast.LENGTH_LONG).show();

    }
    public void logout(View view){

            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
            Toast.makeText(this,"Logout sucessfully",Toast.LENGTH_LONG).show();
    }
}
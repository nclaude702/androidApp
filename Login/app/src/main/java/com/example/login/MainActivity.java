package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void loginc(View view){
        EditText textusername=(EditText) findViewById(R.id.username);
        EditText textpassword=(EditText) findViewById(R.id.password);
        String username=textusername.getText().toString();
        String password=textpassword.getText().toString();
        if(username.equals("admin") && password.equals("123"))
        {
            Intent intent=new Intent(this,MainActivity3.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,"Invalid username or password",Toast.LENGTH_LONG).show();
        }
    }
}
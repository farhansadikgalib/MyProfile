package com.example.myprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private EditText emailET,passET;
   TextView tx;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx = findViewById(R.id.tv);
        emailET = findViewById(R.id.username);
        passET = findViewById(R.id.password);
    }

    public void loginUser (View view){

        String email = emailET.getText().toString();

        Intent i = new Intent(this,HomeActivity.class);
        i.putExtra("email",email);
        startActivity(i);


    }

}

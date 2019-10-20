package com.example.myprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    EditText nameET,phoneET,emailET,addressET;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String email = getIntent().getStringExtra("email");
        Toast.makeText(this, "You are logged by "+email, Toast.LENGTH_LONG).show();

        nameET = findViewById(R.id.name);
        phoneET = findViewById(R.id.phone);
        emailET = findViewById(R.id.phone);
        addressET = findViewById(R.id.phone);
        btn = findViewById(R.id.savebtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameET.getText().toString();
                String phone = phoneET.getText().toString();
                String email = emailET.getText().toString();
                String address = addressET.getText().toString();

                Person person = new Person(name,address,phone,email);

                Intent intent= new Intent(HomeActivity.this,ProfileActivity.class);
                intent.putExtra("person",person);
                startActivity(intent);


            }
        });



    }
}

package com.example.myprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    private TextView nameT,phoneT,emailT,addressT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        nameT = findViewById(R.id.nameTV);
        phoneT = findViewById(R.id.phoneTV);
        emailT = findViewById(R.id.emailTV);
        addressT = findViewById(R.id.addressTv);

        Person person = (Person) getIntent().getSerializableExtra("person");
        if (person != null){

                nameT.setText(person.getName());
                phoneT.setText(person.getPhone());
                emailT.setText(person.getEmail());
                addressT.setText(person.getAddress());




        }

    }

    public void dialperson(View view) {
    }

    public void emailnow(View view) {
    }

    public void showAddressOnMap(View view) {
    }
}

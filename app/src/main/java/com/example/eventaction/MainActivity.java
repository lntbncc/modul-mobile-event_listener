package com.example.eventaction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editUser, editPass;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editUser = findViewById(R.id.edit_username);
        editPass = findViewById(R.id.edit_password);
        btnSubmit = findViewById(R.id.button_login);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editUser.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this,"username harus diisi",Toast.LENGTH_SHORT).show();
                }
                else if(editPass.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this,"password harus diisi",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Anda adalah "+editUser.getText().toString(),Toast.LENGTH_SHORT)
                                    .show();
                }
            }
        });
    }
}
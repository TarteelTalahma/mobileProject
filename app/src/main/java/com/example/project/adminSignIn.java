package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class adminSignIn extends AppCompatActivity {
    private EditText userET,passET;
    private String username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_sign_in);
        company.registeredComapny.add(new company("experts", "a@s.com", "ram" , "a99"));

        userET = findViewById(R.id.inputJobName);
        passET = findViewById(R.id.inputpassword);
        Button login = findViewById(R.id.btnAdminLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(verify()){
                    startActivity(new Intent(adminSignIn.this, adminHomePage.class));
                }
            }
        });
        TextView btn = findViewById(R.id.textviewSignup);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(adminSignIn.this, adminSignUp.class));
            }
        });
    }

    public boolean verify(){
        username = userET.getText().toString();
        password = passET.getText().toString();
        Toast toast;
        if(username.equals("")){
            toast = Toast.makeText(getApplicationContext(), "Enter Username", Toast.LENGTH_LONG);
            toast.show();
            return false;
        }else if(password.equals("")){
            toast = Toast.makeText(getApplicationContext(), "Enter Password", Toast.LENGTH_LONG);
            toast.show();
            return false;
        }else return(validation());
    }

    public boolean validation(){
        Toast toast;
        ArrayList<company> list = company.registeredComapny;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getUsername().equals(username)){
                if(!list.get(i).getPassword().equals(password)){
                    toast = Toast.makeText(getApplicationContext(), "Wrong password", Toast.LENGTH_LONG);
                    toast.show();
                    passET.setText("");
                    return false;
                }else return true;
            }

        }
        toast = Toast.makeText(getApplicationContext(), "Wrong Username", Toast.LENGTH_LONG);
        toast.show();
        return false;
    }
}
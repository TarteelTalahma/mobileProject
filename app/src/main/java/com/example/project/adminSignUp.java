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

public class adminSignUp extends AppCompatActivity {
    private String username,email,address,password,confirmPassword;
    private EditText userET,emailET,addressET,passET,confirmPassET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_sign_up);
        userET = findViewById(R.id.inputJobName);
        emailET  = findViewById(R.id.inputCity);
        addressET = findViewById(R.id.inputSalary);
        passET = findViewById(R.id.inputDescription);
        confirmPassET = findViewById(R.id.inputDeadLine);
        Button singUp = findViewById(R.id.btnAddJob);
        singUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(register_verify()){
                    company.registeredComapny.add(new company(username,email, address, password));
                    startActivity(new Intent(adminSignUp.this, adminSignIn.class));
                }
            }
        });
        TextView btn = findViewById(R.id.AlreadyHaveAccount);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(adminSignUp.this, adminSignIn.class));
            }
        });
    }

    public boolean register_verify(){
        username = userET.getText().toString();
        email = emailET.getText().toString();
        address = addressET.getText().toString();
        password = passET.getText().toString();
        confirmPassword = confirmPassET.getText().toString();
        Toast toast;
        if(username.equals("")) {
            toast = Toast.makeText(getApplicationContext(), "Enter Username", Toast.LENGTH_LONG);
            toast.show();
            return false;
        }else if(email.equals("")){
            toast = Toast.makeText(getApplicationContext(), "Enter Email", Toast.LENGTH_LONG);
            toast.show();
            return false;
        }else if(address.equals("")){
            toast = Toast.makeText(getApplicationContext(), "Enter Address", Toast.LENGTH_LONG);
            toast.show();
            return false;
        }else if(password.equals("")){
            toast = Toast.makeText(getApplicationContext(), "Enter password", Toast.LENGTH_LONG);
            toast.show();
            return false;
        }else if(confirmPassword.equals("")){
            toast = Toast.makeText(getApplicationContext(), "Enter password again", Toast.LENGTH_LONG);
            toast.show();
            return false;
        }else{
            return checkData(username,password,confirmPassword);
        }



    }
    public boolean checkData(String username, String password, String passConf){
        ArrayList<company> list = company.registeredComapny;
        company n;
        Toast toast;
        for(int i=0;i<list.size();i++){
            n = list.get(i);
            if(n.getUsername().equals(username)){
                toast = Toast.makeText(getApplicationContext(), "Username unavailable", Toast.LENGTH_LONG);
                toast.show();
                userET.setText("");
                return false;
            }
        }
        if(!password.equals(passConf)){
            toast = Toast.makeText(getApplicationContext(), "Password doesn't match", Toast.LENGTH_LONG);
            toast.show();
            confirmPassET.setText("");
            return false;
        }
        return true;
    }
}
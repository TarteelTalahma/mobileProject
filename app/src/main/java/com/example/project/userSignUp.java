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

public class userSignUp extends AppCompatActivity {
    private EditText userET,emailET,passET,confirmPassET;
    private String username,email,password,confirmPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up);
        userET = findViewById(R.id.inputJobName);
        emailET  = findViewById(R.id.inputCity);
        passET = findViewById(R.id.inputDescription);
        confirmPassET = findViewById(R.id.inputDeadLine);
        Button signUp = findViewById(R.id.btnAddJob);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(register_verify()){
                    user.registeredUser.add(new user(username,email,password));
                    startActivity(new Intent(userSignUp.this, userSignIn.class));
                }
            }
        });
        TextView btn = findViewById(R.id.AlreadyHaveAccount);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(userSignUp.this, userSignIn.class));
            }
        });
    }
    public boolean register_verify(){
        username = userET.getText().toString();
        email = emailET.getText().toString();
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
        ArrayList<user> list = user.registeredUser;
        user n;
        Toast toast;
        for(int i=0;i<list.size();i++){
            n = list.get(i);
            if(n.getUsername().equals(username)){
                toast = Toast.makeText(getApplicationContext(), "Username unavailable", Toast.LENGTH_LONG);
                toast.show();
                userET.setText("");
                return false;
            }
        }//here still needs to be configured by the dummy data
        if(!password.equals(passConf)){
            toast = Toast.makeText(getApplicationContext(), "Password doesn't match", Toast.LENGTH_LONG);
            toast.show();
            confirmPassET.setText("");
            return false;
        }
        return true;
    }
}
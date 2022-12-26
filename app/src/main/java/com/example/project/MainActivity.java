package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnUser;
    private Button btnCompany;
    Animation topAnim;
    Animation bottomAnim;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        btnUser = findViewById(R.id.btnUser);
        btnCompany = findViewById(R.id.btnCompany);
        btnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, userSignIn.class));
            }
        });

        btnCompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, adminSignIn.class));
            }
        });

        img = findViewById(R.id.img);
        img.setAnimation(topAnim);
        btnUser.setAnimation(bottomAnim);
        btnCompany.setAnimation(bottomAnim);

    }

    @Override
    protected void onStart() {
        Toast toast;
        toast = Toast.makeText(getApplicationContext(), "YOU ARE STARTING JOBS APP", Toast.LENGTH_LONG);
        toast.show();
        super.onStart();
    }


}
package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import com.example.project.model.jobItem;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class addJob extends AppCompatActivity {

    private EditText inputJobName;
    private EditText inputCity;
    private EditText inputSalary;
    private EditText inputDescription;
    private EditText inputRequirements;
    private EditText inputDeadLine;
    private Button btnAddJob;
    private String jobName;
    private String city;
    private String salary;
    private String description;
    private  String requirements;
    private String deadLine;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_job);

        inputJobName = findViewById(R.id.inputJobName);
        inputCity = findViewById(R.id.inputCity);
        inputSalary = findViewById(R.id.inputSalary);
        inputDescription = findViewById(R.id.inputDescription);
        inputRequirements = findViewById(R.id.inputRequirements);
        inputDeadLine = findViewById(R.id.inputDeadLine);
        btnAddJob = findViewById(R.id.btnAddJob);

        btnAddJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(register_verify()){
                    jobItem.addJob.add(new jobItem(jobName, city, salary, description, requirements, deadLine));
                    Toast toast = Toast.makeText(getApplicationContext(), "Job Added", Toast.LENGTH_LONG);
                    toast.show();
                    startActivity(new Intent(addJob.this, adminHomePage.class));

                }
            }
        });
    }

    public boolean register_verify(){
        jobName = inputJobName.getText().toString();
        city = inputCity.getText().toString();
        salary = inputSalary.getText().toString();
        description = inputDescription.getText().toString();
        requirements = inputRequirements.getText().toString();
        deadLine = inputDeadLine.getText().toString();
        Toast toast;
        if(jobName.equals("")){
            toast = Toast.makeText(getApplicationContext(), "Enter Job Name", Toast.LENGTH_LONG);
            toast.show();
            return false;
        }else if(city.equals("")){
            toast = Toast.makeText(getApplicationContext(), "Enter City", Toast.LENGTH_LONG);
            toast.show();
            return false;
        }else if(salary.equals("")){
            toast = Toast.makeText(getApplicationContext(), "Enter Salary", Toast.LENGTH_LONG);
            toast.show();
            return false;
        }else if(description.equals("")){
            toast = Toast.makeText(getApplicationContext(), "Enter Description", Toast.LENGTH_LONG);
            toast.show();
            return false;
        }else if(requirements.equals("")){
            toast = Toast.makeText(getApplicationContext(), "Enter Requirements", Toast.LENGTH_LONG);
            toast.show();
            return false;
        }else if(deadLine.equals("")){
            toast = Toast.makeText(getApplicationContext(), "Enter DeadLine", Toast.LENGTH_LONG);
            toast.show();
            return false;
        }
        return true;
    }

}
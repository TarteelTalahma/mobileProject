package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import com.example.project.model.jobItem;
import com.example.project.model.jobs;
import com.example.project.model.jobData;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;
public class searchJob extends AppCompatActivity {

    Spinner category;
    Spinner city;
    Spinner salary;
    Button search;
    ListView viewJob;
    String cat,cit,sal;
    jobs j = new jobs();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_job);
        category = findViewById(R.id.category);
        city = findViewById(R.id.city);
        salary = findViewById(R.id.salary);
        search = findViewById(R.id.search);
        viewJob = findViewById(R.id.viewJob);

        jobData jobs = new jobs();
        List<String> categories = jobs.getCategories();
        List<String> cities = jobs.getCities();
        List<String> salaries = jobs.getSalaries();

        ArrayAdapter<String> adapterCategories = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, categories);
        category.setAdapter(adapterCategories);

        ArrayAdapter<String> adapterCities = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, cities);
        city.setAdapter(adapterCities);

        ArrayAdapter<String> adapterSalary = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, salaries);
        salary.setAdapter(adapterSalary);


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check()){
                    update();
                }
            }});
    }
    public boolean check(){
        boolean catFlag=false,citFlag=false,salFlag=false;
        cat = category.getSelectedItem().toString();
        cit = city.getSelectedItem().toString();
        sal = salary.getSelectedItem().toString();
        if(!cat.equals("Category")){
            catFlag = true;
            return true;
        }
        if(!cit.equals("City")){
            citFlag = true;
            return true;
        }
        if(!sal.equals("Salary")) {
            citFlag = true;
            return true;
        }
        return false;
    }
    public void update(){
        ArrayList<jobItem> updated = new ArrayList<>();
        j.jobData();
        updated = jobs.job;
        for(int i=0;i<jobs.job.size();i++){
            if(!cat.equals("Category")){
                if(!jobs.job.get(i).getCategory().equals(cat)){
                    updated.remove(jobs.job.get(i));
                    continue;
                }
            }
            if(!cit.equals("City")){
                if(!jobs.job.get(i).getCity().equals(cit)){
                    updated.remove(jobs.job.get(i));
                    continue;
                }
            }
            if(!sal.equals("Salary")){
                if(!String.valueOf(jobs.job.get(i).getSalary()).equals(sal)){
                    updated.remove(jobs.job.get(i));
                    continue;
                }
            }
        }
        ArrayList<String> update = new ArrayList<>();
        for(int j=0;j<updated.size();j++){
            update.add(updated.get(j).getCategory().toString());
        }
        ArrayAdapter<String> adapterUpdateJobs = new ArrayAdapter<String>(this, android.R.layout.simple_selectable_list_item,update);
        viewJob.setAdapter(adapterUpdateJobs);
    }
}
package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;

import com.example.project.model.jobItem;
import com.example.project.model.jobs;
public class showJobs extends AppCompatActivity {

    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_jobs);
        lv = findViewById(R.id.lv);
        jobs j = new jobs();
        j.jobData();

        ArrayAdapter<jobItem> adapterLv = new ArrayAdapter<>(this,android.R.layout.simple_selectable_list_item, j.getAllJobData());
        lv.setAdapter(adapterLv);

    }
}
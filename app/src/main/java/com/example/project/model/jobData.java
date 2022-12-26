package com.example.project.model;
import java.util.ArrayList;

public interface jobData {
    public ArrayList<String> getJobName();
    public ArrayList<String> getCategories();
    public ArrayList<String> getSalaries();
    public ArrayList<String> getCities();
    public ArrayList<jobItem> getAllJobData();
    public ArrayList<jobItem> getJobData(String category, String city,int salary);
}

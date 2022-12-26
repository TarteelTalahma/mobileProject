package com.example.project.model;

import java.util.ArrayList;

public class jobItem {
    private String category;
    private String city;
    private String salary;
    private String description;
    private String requirements;
    private String deadlineDate;
    private int id=0;
    public static ArrayList<jobItem> addJob  = new ArrayList<>();

    public jobItem(String category, String city, String salary, String description, String requirements, String deadlineDate) {
        this.category = category;
        this.city = city;
        this.salary = salary;
        this.description = description;
        this.requirements = requirements;
        this.deadlineDate = deadlineDate;
        id++;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getDeadlineDate() { return deadlineDate;}

    public void setDeadlineDate(String deadlineDate) { this.deadlineDate = deadlineDate;}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return
                "category=" + category + '\n' +
                "city=" + city + '\n' +
                "salary=" + salary + '\n' +
                "description='" + description + '\n' +
                "requirements='" + requirements;
   }
}

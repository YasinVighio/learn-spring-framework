package com.springlearn.beans;

import java.util.List;

public class Student {

    private int Id;
    private String name;
    private String grade;

    private List<Marksheet> marksheet;
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public List<Marksheet> getMarksheet() {
        return marksheet;
    }

    public void setMarksheet(List<Marksheet> marksheet) {
        this.marksheet = marksheet;
    }
}

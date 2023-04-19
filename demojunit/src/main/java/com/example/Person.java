package com.example;

public class Person {
    private String name;
    private float w, h, bmi;
    private String category;

    public Person() {
    }


    public Person(String name, float w, float h) {
        this.name = name;
        this.w = w;
        this.h = h;
    }


    public String getName() {
        return name;
    }

    public float getW() {
        return w;
    }

    public float getH() {
        return h;
    }

    public float getBmi() {
        return bmi;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setW(float w) {
        this.w = w;
    }

    public void setH(float h) {
        this.h = h;
    }

    public void setBmi(float bmi) {
        this.bmi = bmi;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float calculateBMI(){
        return w/(h*h);
    }

}

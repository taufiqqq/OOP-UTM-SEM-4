/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week03;

/**
 *
 * @author user
 */
public class Person {

    String name;
    int yob;
    float weight, height, bmi;

    // constructors (2)
    public Person() {
    }

    public Person(String n, int a, float w, float h) {
        this.name = n;
        this.yob = a;
        this.weight = w;
        this.height = h;
    }

    public void calcBmi() {
        bmi = weight / (height * height);
    }

    // all setters /mutators (4)
    public void setName(String n) {
        this.name = n;
    }

    public void setYob(int y) {
        this.yob = y;
    }

    public void setWeight(float w) {
        this.weight = w;
    }

    public void setHeight(float w) {
        this.weight = w;
    }

    // all getters /accesors (5)
    public String getName() {
        return name;
    }

    public int getYob() {
        return this.yob;
    }

    public float getWeight() {
        return this.weight;
    }

    public float getHeight() {
        return this.height;
    }

    public float getBmi() {
        return bmi;
    }

    @Override
    public String toString() {
        return "Person info : \nname = " + this.name + " yob : " + this.yob + " \nweight : " + this.weight
                + " height : " + this.height + " \nbmi : " + this.bmi;
    }

}

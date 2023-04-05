/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappweek1;

/**
 *
 * @author user
 */
public class Person {

    String name;
    int yob;
    float weight, height, bmi;
    int hn;
    String sa;

    Address a = new Address();

    // constructors (2)
    public Person() {
    }

    public Person(String n, int a, float w, float h) {
        this.name = n;
        this.yob = a;
        this.weight = w;
        this.height = h;
    }

    public Person(String n, int a, float w, float h, int hn, String sa) {
        this.name = n;
        this.yob = a;
        this.weight = w;
        this.height = h;
        this.hn = hn;
        this.sa = sa;

        hn = 100;
        sa = "new street address";
    }

    public Person(String n, int yob, float w, float h, Address a) {
        this.name = n;
        this.yob = yob;
        this.weight = w;
        this.height = h;
        this.a = a;
        //a = a, thus referenced. if we change a, it will reflect too

        a.setHomeNum(100);
        a.setStreetAddress("new street address");
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

    public void setAddress(Address a){
        this.a = a;
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

    public Address getAddress(){
        return a;
    }

    public String getAddressDetail(){
        return hn + ", " + sa;
    }

    @Override
    public String toString() {
        return "Person info : \nname = " + this.name + " yob : " + this.yob + " \nweight : " + this.weight
                + " height : " + this.height + " \nbmi : " + this.bmi;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappweek1;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaAppWeek1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Address obj1 = new Address(23, "Jalan Kilang");
        Address obj2 = new Address(34, "KTDI");
        Address obj3 = new Address(34, "KTDI");

        if(obj1==obj2){
            System.out.println("Before Assign - SAME ADDRESS");
        }
        System.out.println("OBJ1 is " + obj1.toString());
        System.out.println("OBJ2 is " + obj2.toString());

        obj1 = obj2;
        System.out.println("\nIs OBJ1 & OBJ2 Same After Assign ? " +(obj1==obj2));
        System.out.println("OBJ1 is " + obj1.toString());
        System.out.println("OBJ2 is " + obj2.toString());

        System.out.println("\nObject with same content but created separately without assigning to each other, has different address");
        System.out.println("OBJ2 is " + obj2.toString());
        System.out.println("OBJ3 is " + obj3.toString());
        
        System.out.println("\nObject OBJ2 and OBJ3 is same state [content] but different address? " + (obj2.equals(obj3)) );

        Person p1 = new Person("ALI", 1999, 99, 99, obj2);
        Person p2 = new Person("ABU", 2000, 56f, 1.68f, 23, "Jalan Kilang");
        
        System.out.println("Address Ali: " + p1.getAddress().getHomeNum() + ", " + p1.getAddress().getStreetAddress()); //changed content, because the a object is referred through memory, thus change to a will affter the a called in parameter
        System.out.println("Address Abu: " + p2.getAddressDetail()); //hn and sa is unchanged. because hn is referring to parameter, not [this.hn]. thus if we assign hn it will not affect the private hn

        BMIApp ba = new BMIApp();
        ba.runApp();
        
        System.exit(0);
    }

}

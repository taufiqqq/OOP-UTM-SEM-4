/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappweek1;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class BMIApp {

    private Person p;
    
    public BMIApp(){}
    
    public void runApp(){
        readInfo();
        p.calcBmi();
        displayInfo();
    }
    
    public void displayInfo(){
        System.out.println(p.toString());
    }
    
    private void readInfo(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = s.nextLine();
        
        System.out.print("Enter Year of Birth: ");
        int yob = s.nextInt();
        
        System.out.print("Enter weight: ");
        float weight = s.nextFloat();
        
        System.out.print("Enter height: ");
        float height = s.nextFloat();
        
        s.close();
        p = new Person(name, yob, weight, height);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week03;

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Week03 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane jop = new JOptionPane();
        jop.showMessageDialog(null, "Hello World");
                
        Scanner keyboard = new Scanner(System.in);
        String name = jop.showInputDialog("Please enter your name: ");
        int yob = Integer.parseInt(jop.showInputDialog("YOB: "));
        float berat = Float.parseFloat(jop.showInputDialog("Weight (kg): "));   
        float tinggi = Float.parseFloat(jop.showInputDialog("Height (m): "));
        
        Person p = new Person(name,yob,berat,tinggi);
        p.calcBmi();
        
        jop.showMessageDialog(null, p.toString());
        
        System.exit(0);
        // TODO code application logic here
    }

}

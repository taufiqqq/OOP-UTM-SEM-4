package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person pt = new Person("ali", 0, 0);
        System.out.println(pt.getH());
        System.out.println(pt.getW());

        pt.setBmi(pt.calculateBMI());  
        System.out.println(pt.getBmi());
        
    }
}

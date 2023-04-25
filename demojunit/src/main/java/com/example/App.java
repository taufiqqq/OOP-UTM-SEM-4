package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Person pt = new Person();
        System.out.println(pt.getH());
        System.out.println(pt.getW());

        pt.setBmi(pt.calculateBMI());
        System.out.println(pt.getBmi());
        // BMI will be NaN because 0/0 is infinity. If /0 is printed in main function,
        // then java can error handle that and says cannot divide by 0. But if /0 in
        // class, java will just return NaN, Not a Number

    }
}

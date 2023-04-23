package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {

    @Test
    public void testGetName1() {

        // prep
        Person pt = new Person();
        pt.setName("Ali");

        // perform test
        /*
         * String expected = "Ali";
         * method call : pt.getName();
         */
        assertEquals("Ali", pt.getName());
        // Ali is what you expecct, pt.getName is the actual call
    }

    @Test
    public void testGetName2() {
        // create object without parameter values, expect getname return null
        // prep
        Person pt = new Person();

        // perform test
        /*
         * String expected = null ;
         * method call : pt.getName();
         */
        assertEquals(null , pt.getName());
        // Ali is what you expecct, pt.getName is the actual call
    }

    @Test
    public void testCalculateBMI1() {
        //prep
        Person pt = new Person("ali", 77f, 1.77f);
        pt.setBmi(pt.calculateBMI());

        //test
        assertEquals(24.6, pt.getBmi(), 0.5);
    }

    @Test
    public void testCalculateBMI2(){
        Person pt = new Person();
        pt.setBmi(pt.calculateBMI());
        assertEquals(0, pt.getBmi(), 0.5);
    }

}

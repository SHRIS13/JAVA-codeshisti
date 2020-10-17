package com.codeshisti;

import java.util.Date;

public class ReferenceVariable {

    public static void main(String[] args) {
   byte age = 28;   //Primitive, Don't need to allocate memory

        //Reference,allocated but released by java
        Date now = new Date(); //here, now is an instance of the Date class
        now.getTime(); //here getTime is a method
        //primitive don't have members
        System.out.println(now);
    }
}

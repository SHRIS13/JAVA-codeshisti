package com.codeshisti;

public class UseString {

    public static void main(String[] args) {

        String message = "   Hellow World" + "!!  ";
        System.out.println(message);

        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("ll"));

        System.out.println(message.length());
        System.out.println(message.indexOf("my"));

        System.out.println(message.replace("!!","##"));  //these values are args
        //target,replace: parameters are the wholes that we define in our method
        //!!,##: args are the actual values that we pass in this method
        System.out.println(message);
        //strings are not changed bc in java strings are immutable

        System.out.println(message.toLowerCase());
        
        System.out.println(message.trim()); //remove wide-space
    }
}



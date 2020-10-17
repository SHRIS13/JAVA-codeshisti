package com.codeshisti;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {

        // ₹1,234,567 OR 10% instead 0.1

        /*NumberFormat currency = new NumberFormat()
         this is an abstract class instead we use this */

        //a factory method it creates new objects,on RHS we're calling
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);


        //for percentage
        NumberFormat percent = NumberFormat.getPercentInstance();
        String answer = percent.format(.891);
        System.out.println(answer);

        /*METHOD CHAINING (m1.m2), another better calling format
                                       m1.m2
        NumberFormat.getPercentInstance().format(.891);*/
        String Answer = NumberFormat.getPercentInstance().format(.891);
        System.out.println(Answer);

    }
}

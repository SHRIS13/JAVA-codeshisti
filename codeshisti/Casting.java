package com.codeshisti;

public class Casting {
    public static void main(String[] args) {
        //Implicit Casting,automatic conversion
        //byte > short > int > long > float > double

        short x = 1;
        int y =x + 2;
        System.out.println(y);

        double w= 1.1;
        double z =w + 2;    //2.0 is added
        System.out.println(z);

        double a= 1.1;
        int b =(int)a + 2;
        System.out.println(b);

        //below THIS METHOD TAKES A STRING AND RETURNS INT
        String X= "1";

        /*Integer.parseInt();
        Short.parseShort();
        Double.parseDouble();
        Float.parseFloat();*/

        int Y =Integer.parseInt(X) + 2;
        System.out.println(Y);
        //convert string to numeric bc input is always taken as string mostly
    }
}

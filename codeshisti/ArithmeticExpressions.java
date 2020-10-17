package com.codeshisti;

public class ArithmeticExpressions {
    public static void main(String[] args) {
        double answer= 10 /3;
        //in java division of two whole numbers is a whole number
        System.out.println(answer);

        //convert it into float or double

        answer = (double)10/(double)3;
        //here RHS is an expression,numbers are operands
        System.out.println(answer);

        int i=1;
        i++; //use it as a prefix or suffix(postfix)
        System.out.println("value of i =\t"+i);

        int x= 1;
        int y = x++;
        //as a postfix value of y won't increase
        System.out.println("value of x =\t"+x);
        System.out.println("value of y =\t"+y);

        //"+="augmented/compound assignment operator
        i+=2;
        System.out.println("i=2 then i+=2;\t"+i);
        i-=2;
        System.out.println("i-=2;\t"+i);
        i*=2;
        System.out.println("i*=2;\t"+i);
        i/=2;
        System.out.println("i/=2;\t"+i);

    }
}
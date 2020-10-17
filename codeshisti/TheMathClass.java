package com.codeshisti;

public class TheMathClass {
    public static void main(String[] args) {
        //round off
        int result = Math.round(1.1F);
        System.out.println(result);

        //CEIL greater or equal to
        result = (int)Math.ceil(1.1D);
        System.out.println(result);

        //FLOOR largest int, smaller or equal to
        result = (int)Math.floor(1.1F);
        System.out.println(result);

        //MAX returns greater of two values
        result = (int)Math.max(1,5);
        System.out.println(result);

        //MIN returns smaller of two values
        result = (int)Math.min(1,5);
        System.out.println(result);

        //RANDOM generate random float values b/w 0 and 1
        double answer = Math.random();
        System.out.println(answer);
        //b/w 0 and 100
            answer = Math.random()*100;
            System.out.println(answer);
        //if we don't want float either round this number=result/answer or cast this
            answer = Math.round(Math.random()*100);
            System.out.println(answer);
        //to store int, explicit casting
            result = (int)Math.round(Math.random()*100);
            System.out.println(result);
        //lets do without random
            result = (int)((Math.random()*100));
            System.out.println(result);

    }
}

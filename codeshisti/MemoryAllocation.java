package com.codeshisti;

import java.awt.*;

public class MemoryAllocation {
    public static void main(String[] args) {
        int x = 1;
        int y = x;
        x = 2;
        //these two values are independent of each other
        System.out.println(y);
        Point point1= new Point(5,5) ;
        Point point2= point1;
         //stores reference of objects somewhere in memory, addresses
        point1.x = 3;
        System.out.println(point2);
    }
}

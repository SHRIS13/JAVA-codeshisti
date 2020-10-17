package com.codeshisti;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    //in() we add frm where

        //we change println to PRINT to not add a new line
        System.out.print("Age(in years): ");
        byte age = scanner.nextByte();

        // IMPLICIT CASTING, we are concatenating string with byte
        System.out.println("You are "+age);

        /*PRINT string
             System.out.print("Name: ");
             String name = scanner.next();
             System.out.println("You are "+name);   */

        /* what we give the input is TOKEN
            to get full name or two tokens use nexline method */
             System.out.print("Name: ");
             String Name = scanner.nextLine();
             System.out.println("You are "+Name);

    }
}

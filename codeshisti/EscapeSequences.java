package com.codeshisti;

public class EscapeSequences {
    public static void main(String[] args){
        String message = "hello \"Shristi\"";
        //the backslash escapes the double quote or the special character
        System.out.println(message);

        //c:\Windows\...
        String message1 = "c:\\Windows\\...";
        //add a double backslash or prefix backslash

        //"\n" for new line and "\t" for tab
        System.out.println(message1);

    }
}

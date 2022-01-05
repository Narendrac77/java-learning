package com.narendra.java.recursion;

// reverse of a given string
public class ReverseString {

    public static String reverseString(String input){
        if(input.equals(""))
            return "";
        return reverseString(input.substring(1)) +input.charAt(0);
    }

    public static void main(String[] args) {
        String string = reverseString("Narendra");

        System.out.println(string);
    }
}

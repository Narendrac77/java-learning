package com.narendra.java.recursion;

public class SumOfNaturalNumbers {

    public static int sumOfNaturalNUmbers(int number){
        if(number <= 1)
            return number;
        return number + sumOfNaturalNUmbers(number-1);
    }

    public static void main(String[] args) {
        int input = sumOfNaturalNUmbers(10);
        System.out.println(input);
    }

}

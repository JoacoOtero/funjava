package com.company;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a numerator: ");
        int num = scan.nextInt();
        System.out.print("Enter a denominator: ");
        int den = scan.nextInt();
        int b = num / den;
        //int r = num % den;
        //^^Simplified version
        int r = num-(den*b);
        System.out.println("Answer: "+b + " Remainder= "+r);
    }
}

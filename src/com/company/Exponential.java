package com.company;

import java.util.Scanner;

public class Exponential {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a base: ");
        double base = scan.nextDouble();
        System.out.print("Enter an exponent: ");
        double exp = scan.nextDouble();
        double x =Math.pow(base,exp);
        System.out.println(x);
    }
}

package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double x = scan.nextDouble();
        System.out.print("Enter operation(+, -, *, /, ^): ");
        char o = scan.next().charAt(0);
        System.out.print("Enter second number: ");
        double y = scan.nextDouble();
        double r;
        switch(o) {
            case '+':
                r = x + y;
                break;
            case '-':
                r = x-y;
                break;
            case '*':
                r = x*y;
                break;
            case '/':
                r = x/y;
                break;
            case '^':
                r = Math.pow(x,y);
                break;
            default:
                r = Double.NaN;
                break;
        }
        if (Double.isNaN(r)) {
            System.out.println("Error");
        } else if (Double.isInfinite(r)) {
            System.out.println("MyInfinite");
        } else {
            System.out.println("Answer: " + r);
        }
    }

}

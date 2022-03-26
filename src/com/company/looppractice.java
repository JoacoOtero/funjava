package com.company;

import java.util.Scanner;

public class looppractice {
    public static void main(String[] args) {
        int x;
        int y = 0;
        for(x = 0; x<1000; x++){
            if(x%3 == 0) {
                y+=x;
                System.out.println(y);

            }
            if(x%5 == 0) {
                y+=x;
                System.out.println(y);
            }
            }
        System.out.println(y);
        //initialization; condition; postcondition
        //int x;

        //for(x=0; x<=100; x++){
            //if(x%2 == 0){
                //System.out.println(x);
            }

        }

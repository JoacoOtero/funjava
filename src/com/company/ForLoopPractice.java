package com.company;

public class ForLoopPractice {
    public static void main(String[] args) {
        String S1 = "178";
        String S2 = "369";
        int i,j;
        for (i=0,j=0; (i+j<6); )

        {
            if (S1.charAt(i) < S2.charAt(j)) {
                System.out.print(S1.charAt(i));
                i++;
            } else {
                System.out.print(S2.charAt(j));
                j++;

            }
        }
    }
}
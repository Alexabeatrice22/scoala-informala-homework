package com.SIBV;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What time is it? ");
        System.out.println("Enter the hour: ");
        int h = s.nextInt();
        String hr = "" + h;
        if(h <= 9)
            hr = "0" + h;
        System.out.println("Enter the minutes: ");
        int m = s.nextInt();
        String mn = "" + m;
        if(m <= 9)
            mn = "0" + m;
        if (com.SIBV.ValidOrNot.correct(h , m)) {
            System.out.println("The time is  " + hr + ":" + mn + " now." );
        } else {
            System.out.println("Incorrect time!");
        }
    }

}


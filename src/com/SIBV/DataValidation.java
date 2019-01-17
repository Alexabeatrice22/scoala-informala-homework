package com.SIBV;

import java.util.Scanner;

public class DataValidation {
    public static void main(String []args ) {
        Scanner s = new Scanner(System.in);
        System.out.println("What time is it? ");
        System.out.println("Enter the hour: ");
        int h = s.nextInt();
        System.out.println("Enter the minutes: ");
        int m = s.nextInt();

        if (h >= 0 && h <= 23 && m >= 0 && m <= 59) {
            System.out.println("The time is  " + h + ":" + m + " now." );
        } else {
            System.out.println("Incorrect time!");
        }
    }
}

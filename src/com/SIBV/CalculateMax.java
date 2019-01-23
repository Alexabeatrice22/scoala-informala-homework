/**
 * Method getMax(),  two integer (int) parameters, returns maximal of the two numbers.
 * author AlexandraB.
 */
package com.SIBV;

import java.util.Scanner;

public class CalculateMax {

    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        System.out.println("Enter the second number");
        int b = keyboard.nextInt();
        System.out.println("Enter the third number");
        int c = keyboard.nextInt();
        System.out.println("The biggest number is: " + getMax(getMax(a,b),c));

    }

    public static int getMax(int n1, int n2) {
        int max;
        if (n1 < n2)
            max = n2;
        else
            max = n1;

        return max;
    }
}


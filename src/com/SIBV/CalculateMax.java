/**
 * Method getMax(),  two integer (int) parameters, returns maximal of the two numbers.
 * author AlexandraB.
 */
package com.SIBV;

import java.util.Scanner;

public class CalculateMax {

    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        int c = getMax(a, b);
        System.out.println("Maximum Value = " + c);
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
    class CalcMax2 {
public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        System.out.println("Enter the second number: ");
        int b = keyboard.nextInt();
        System.out.println("Enter the third number: ");
        int c = keyboard.nextInt();
        int d = getMax(a, b, c);
        System.out.println("Maximum Value = " + d);
        }

public static int getMax(int n1, int n2, int n3) {
        int max;
        if (n1 > n2 && n1 > n3)
        max = n1;
        else if (n2 > n3)
        max = n2;
        else
        max = n3;

        return max;
   }
}

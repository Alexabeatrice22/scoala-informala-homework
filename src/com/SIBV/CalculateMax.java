/**
 * Method getMax(),  two integer (int) parameters, returns maximal of the two numbers.
 * author AlexandraB.
 */
package com.SIBV;

import java.util.Scanner;

import static com.SIBV.Max.getMax;

public class CalculateMax {

    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        System.out.println("Enter the second number");
        int b = keyboard.nextInt();
        System.out.println("Enter the third number");
        int c = keyboard.nextInt();
        System.out.println("The biggest number is: " + getMax(getMax(a, b), c));

    }
}

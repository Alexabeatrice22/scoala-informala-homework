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

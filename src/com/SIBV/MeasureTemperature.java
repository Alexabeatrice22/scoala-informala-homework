package com.SIBV;

import java.util.Scanner;

import static com.SIBV.FahrenheitToCelsius.temperature;

public class MeasureTemperature {
    public static void main(String[] args) {
        double tmp;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:");
        tmp = in.nextDouble();
        if (tmp < 95)
            System.out.println("This is your temperature: " + temperature(tmp)  + " Your health is in danger!");
        else  {
            System.out.println("Your body temperature in Celsius: " + temperature(tmp));

            if (temperature(tmp) > 37.7) {
                System.out.println("This is your temperature: " + temperature(tmp) + " You are ill!!");
            }
        }

    }

}
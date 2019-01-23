package com.SIBV;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double temperature;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:");
        temperature = in.nextInt();
        if (temperature < 95)
            System.out.println("Your health is in danger!");
        else  {
            System.out.println("Your body temperature in Celsius: " + temperature);

            if (temperature > 37.5) {
                System.out.println("You are ill!!");
            }
        }
    }

    private  static double temperature (double temperature){
        double celsius = ((temperature - 32)* 5 ) / 9;
        return celsius;
    }
}

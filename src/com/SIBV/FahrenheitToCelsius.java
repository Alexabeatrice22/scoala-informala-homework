package com.SIBV;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        float temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit:");
        temperature = in.nextInt();

        temperature = ((temperature - 32)*5)/9;

        System.out.println("temperature in Celsius = " + temperature);
    }
}

 class MeasureBodyTemperature{
    public static void main (String[] args){
        float temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit: ");
        temperature = in.nextFloat();

        temperature = ((temperature - 32)*5)/9;

        System.out.println("Temperature in Celsius = " + temperature);

        if (temperature > 37){
            System.out.println("You are ill!!!");
        }
    }
}
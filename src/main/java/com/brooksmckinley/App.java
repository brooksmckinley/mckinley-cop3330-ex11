/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        double euros = scan.nextDouble();
        System.out.print("What is the exchange rate? ");
        double exchangeRate = scan.nextDouble();

        System.out.println(getExchangeReport(euros, exchangeRate));
    }

    public static String getExchangeReport(double euros, double exchangeRate) {
        double euroCents = euros * 100;
        double dollarCents = Math.ceil(euroCents * exchangeRate);

        return String.format("%.2f euros at an exchange rate of %f is\n%.2f U.S. dollars.", euros, exchangeRate, dollarCents / 100.0);
    }
}
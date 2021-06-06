/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        String euros_string = input.nextLine();

        System.out.print("What is the exchange rate? ");
        String exchange_rate_string = input.nextLine();

        int euros = parseInt(euros_string);
        double exchange_rate = parseDouble(exchange_rate_string);
        double us_dollars = exchange_rate * euros;

        String us_dollars_formatted = String.format("%.2f", us_dollars);

        System.out.println(euros + " euros at an exchange rate of " + exchange_rate + " is " + us_dollars_formatted + " U.S. dollars.");
    }
}

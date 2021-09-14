/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        //input
        Scanner input = new Scanner(System.in);

        System.out.println("What is the order amount?");
        double orderAmount = input.nextDouble();
        System.out.println("What is the state (abbreviated)?");
        String state = input.next();

        //assigns a default string and cost to output to the user
        double totalCost = orderAmount;
        String output = String.format("The total is $%.2f.", totalCost);

        //checks to see if WI was inputted and changes output based on input
        if(state.equals("WI")){
            double taxRate = 0.055;
            double taxCost = orderAmount * taxRate;
            totalCost = orderAmount + taxCost;
            output = String.format("The subtotal is $%.2f. \nThe tax is $%.2f. \nThe total is $%.2f.", orderAmount, taxCost, totalCost);
        }
        //output
        System.out.println(output);
    }
}

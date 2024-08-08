/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dhanasuthanmithunu2act2ast;
//importing the scanner class to read user input
import java.util.Scanner;
//importing the Decinmal Format class to round numbers
import java.text.DecimalFormat;

/**
 * Author: Mithun Dhanasuthan
 * Date: July 4th, 2024
 * Problem 3 of U2ACT2AST
 */

public class IncomeTax 
{
    public static void main(String[] args) 
    {
        //Setting the decimal format to 2 decimals
        DecimalFormat df1 = new DecimalFormat("0.0");
        // Constants for the tax brackets and rates
        final double dblTaxrate = 0.29;  
        // Create a scanner to read user input
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter their salary
        System.out.print("Please enter your salary (between $173205 and $246752): ");
        //reading input of the salary
        double dblSalary = input.nextDouble();
        // Calculate the tax owed based on the salary
        double dblTaxowed = dblSalary*dblTaxrate;
        // Output the result
        System.out.print("The income tax owed for a salary of " + dblSalary + " is " + df1.format(dblTaxowed) );
    }  

}

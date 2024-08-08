/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dhanasuthanmithunu2act2ast;
//importing the scanner class to read user input
import java.util.Scanner;

/**
 * Author: Mithun Dhanasuthan
 * Date: July 4th, 2024
 * Problem 1 of U2ACT2AST
 */
public class WaterandComputerManufacturing 
{
     public static void main(String[] args) 
    {
       //Declaring the scanner object
        Scanner input = new Scanner(System.in);
        //declaring the constant of how much water one computer/monitor combo takes
        double dblAmountofwater = 1.5;
        //printing the request to user for number of computer/monitor combos they own
        System.out.print("Please enter number of computer/monitor combos you own:");
        //reading the input using scanner
        int intAmountofcomputers = input.nextInt();
        //printing the amount of water used by multiplying the amount of computers with the constant dblAmountofwater
        System.out.println("The amount of water used to make your computer/monitor combos is"+ (intAmountofcomputers*dblAmountofwater)+"L");
    }
}

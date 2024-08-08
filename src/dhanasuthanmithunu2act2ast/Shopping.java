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
 * Problem 2 of U2ACT2AST
 */

public class Shopping 
{
  public static void main(String[] args) 
    {
       //Declaring the scanner object
        Scanner input = new Scanner(System.in);
        //declaring the constant of how much one USB storage device costs
        double dblUSB = 19.25;
        //declaring the constant of how much one Keyboard costs
        int intKeyboard = 48;
        //declaring the constant of how much one Mouse costs
        double dblMouse = 25.66;
        //printing the request to user for number of computer/monitor combos they own
        System.out.print("Please enter number of USB storage devices you would like to purchase:");
        //reading the input using scanner
        int intTotalUSBs = input.nextInt();
        System.out.print("Please enter number of Keyboards you would like to purchase:");
        //reading the input using scanner
        int intTotalkeyboards = input.nextInt();
        System.out.print("Please enter number of Computer Mouses you would like to purchase:");
        //reading the input using scanner
        int intTotalmouses = input.nextInt();
        //printing the amount of water used by multiplying the amount of computers with the constant dblAmountofwater
        System.out.println("The total cost of all your items is: $"+ ((dblUSB*intTotalUSBs)+(intKeyboard*intTotalkeyboards)+(dblMouse*intTotalmouses)));
    }  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod9week2day3miniexercise1average;

import java.util.Scanner;

/**
 *
 * @author Aidan
 */
public class Mod9Week2Day3MiniExercise1Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input 3 numbers of any length with a space between 3 the 3 different nunnbers.");
        Integer firstNum = 0;
        Integer secondNum = 0;
        Integer thirdNum = 0;
        
        firstNum = input.nextInt();
        secondNum = input.nextInt();
        thirdNum = input.nextInt();
        
        Integer sum = firstNum + secondNum + thirdNum;
        
        System.out.println("The average is: " + Float.toString((float)sum/3));
        
    }
    
}

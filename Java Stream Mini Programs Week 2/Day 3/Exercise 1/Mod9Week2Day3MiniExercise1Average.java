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
        double firstNum = 0;
        double secondNum = 0;
        double thirdNum = 0;
        
        firstNum = input.nextDouble();
        secondNum = input.nextDouble();
        thirdNum = input.nextDouble();
        
        
        
        System.out.println("The average is: " + Double.toString(average(firstNum,secondNum,thirdNum)));
        
    }
    public static double average(double x, double y, double z)
    {
        double sum = x+y+z;
        return (sum/3);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import java.util.Scanner;

/**
 *
 * @author Aidan
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers to receive the largest number as the output. "
                + "Keep spaces between seperate values.");
        Scanner input = new Scanner(System.in);
        Integer firstNum = input.nextInt();
        Integer secondNum = input.nextInt();
        Integer thirdNum = input.nextInt();
        
        System.out.println(Math.max(Math.max(firstNum,secondNum), thirdNum));
        
    }
    
}

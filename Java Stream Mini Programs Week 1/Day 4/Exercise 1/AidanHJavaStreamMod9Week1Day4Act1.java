/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aidanhjavastreammod9week1day4act1;

import java.util.Scanner;

/**
 *
 * @author Aidan
 */
public class AidanHJavaStreamMod9Week1Day4Act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter 2 values to calculate their sum total. Press Enter after all the values have been entered.");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(getTotal(a,b));
    }
    
    public static int getTotal(int a, int b){
    
    int sum = a + b;
        
    return sum;
    }
    
}

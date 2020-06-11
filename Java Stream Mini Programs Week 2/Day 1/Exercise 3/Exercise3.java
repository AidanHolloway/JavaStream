/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

import java.util.Scanner;

/**
 *
 * @author Aidan
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   System.out.println("Enter a value from 1 to 7.");
   Scanner input = new Scanner(System.in);
   
   Integer val = input.nextInt();
   switch (val){
       case 1: System.out.println("Monday");
       break;
       case 2: System.out.println("Tuesday");
       break;
       case 3: System.out.println("Wednesday");
       break;
       case 4: System.out.println("Thursday");
       break;
       case 5: System.out.println("Friday");
       break;
       case 6: System.out.println("Saturday");
       break;
       case 7: System.out.println("Sunday");
       break;
       default:
           System.out.println("The value entered is invalid.");
   }
               }
    
}

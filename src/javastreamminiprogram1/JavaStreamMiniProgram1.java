/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastreamminiprogram1;

import java.util.Scanner;

/**
 *
 * @author AidanH
 */
public class JavaStreamMiniProgram1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter All to view all numbers from 1 to 10. "
                + "Enter Odd to view all odd numbers from 1 to 10. "
                + "Enter Even to view all even numbers from 1 to 10.");
        Scanner input = new Scanner(System.in);
        String selection = input.nextLine();
        
        
     if(selection.equals("All")){
     int counter = 0;
        while(counter < 10){
            counter++;
            System.out.println(counter);
        
        }}
     else if(selection.equals("Odd")){
         int counter = -1;
        while(counter < 10){
            counter+=2;
            System.out.println(counter);
        
        }}
      else if(selection.equals("Even")){
         int counter = 0;
        while(counter < 10){
            counter+=2;
            System.out.println(counter);
        
        }}
     
        
    }
   
}

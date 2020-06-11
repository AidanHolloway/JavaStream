/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod9week2day4miniprogramex3findintegerarrayindex;

import java.util.Scanner;

/**
 *
 * @author Aidan
 */
public class Mod9Week2Day4MiniProgramEx3FindIntegerArrayIndex {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        int[] intArr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        
        boolean found = false;
        System.out.println("Guess if an value is in this array of integer, if"
                + " you guess the right value we will say what index of the "
                + "array it is currently kept in."); 
        Scanner input = new Scanner(System.in);
        
        int value = input.nextInt();
        
        for(int i=0; i<intArr.length; i++){
        if(intArr[i]==value){
            System.out.println("The value of " + value + " was found at the "
                    + "index of: " + i);
            found = true;
            break;
        }
        }
        if(!(found)){
            System.out.println("Sorry, you guessed incorrectly!");
        }
    }
}

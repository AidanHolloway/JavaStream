/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod9week2day3miniexercise2passwordlength;

import java.util.Scanner;

/**
 *
 * @author Aidan
 */
public class Mod9Week2Day3MiniExercise2PasswordLength {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password of 8 characters consisting of letters and numbers.");
        
        Integer countDigits = 0;
        Integer countChar = 0;
        String password = input.nextLine();
        for(int i=0; i<password.length(); i++){
        if(0<=password.charAt(i) && password.charAt(i)>=9){
            countDigits++;
        }
        else if(('a'>=password.charAt(i) && password.charAt(i)<='z') || 
                ('a'>=password.charAt(i) && password.charAt(i)<='z')){
            countChar++;
            }
    }
    if(countDigits>=2 && (countDigits+countChar>=8)){
        System.out.println("Password entered is valid!");   
    }
    else{
        System.out.println("Password entered is invalid!");
    }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aidanhjavastreammod9week1day4act2;

import java.util.Scanner;

/**
 *
 * @author Aidan
 */
public class AidanHJavaStreamMod9Week1Day4Act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int countVowel = 0;
       
       System.out.println("Enter words or sentences to see the number of vowels it contains.");
       
        Scanner input = new Scanner(System.in);
        String words = (input.nextLine()).toLowerCase();
        for(int i=0; i<words.length(); i++){
        if(isVowel(words.charAt(i)) == true){
        countVowel++;
        }
        
        }
        System.out.println(countVowel);
    }
    
    
    public static Boolean isVowel(Character a){
        if((a == 'a') || (a.equals('e')) || (a.equals('i')) || (a.equals('o')) || (a.equals('u'))){
    return true;
    }
        
    return false;
    }
    
}

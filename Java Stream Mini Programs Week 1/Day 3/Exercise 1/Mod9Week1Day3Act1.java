/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod9week1day3act1;

import java.util.Arrays;

/**
 *
 * @author AidanH
 */
public class Mod9Week1Day3Act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] dupeArr = new int[6];
        dupeArr[0] = 10;
        dupeArr[1] = 22;
        dupeArr[2] = 20;
        dupeArr[3] = 10;
        dupeArr[4] = 11;
        dupeArr[5] = 0;
        
        Arrays.sort(dupeArr);
        
        int count = 0;
        
        for(int i=0; i<dupeArr.length; i++){
            for(int j=i+1; j<dupeArr.length; j++){
            if(dupeArr[i] == dupeArr[j]){
            count++;
            }
          
            }

        }
        
        int[] noDupeArr = new int[dupeArr.length-count];
        int countEqual;
        int countIndexChanged = 0;
        
        for(int i=0; i<dupeArr.length; i++){
           countEqual = 0;
           
           if(i==0){
               noDupeArr[i] = dupeArr[i];
               countIndexChanged++;
               continue;
           }
           
            for (int j = 0; j < noDupeArr.length; j++) {
                if(noDupeArr[j] == dupeArr[i]){
                    countEqual++;
                }
            }
            
         if(countEqual == 0){
            noDupeArr[countIndexChanged] = dupeArr[i];
            countIndexChanged++;
            }
          
        }
        
        for (int i = 0; i < noDupeArr.length; i++) {
            System.out.println(noDupeArr[i]);
        }
        
    }
    
}

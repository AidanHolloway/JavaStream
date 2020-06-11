import java.util.Arrays;
import java.util.Scanner;

public class Mod9Week2Day4MiniProgramEx1Sort {

    public static void main(String[] args) {
        System.out.println("Will the array be a string or integer array?");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        
        if((answer.toLowerCase()).equals("integer")){
           Integer[] sortedArr = integerArray();
           
            System.out.println(Arrays.toString(sortedArr)); 
        }
        else if((answer.toLowerCase()).equals("string")){
            String[] sortedArr = stringArray();
            
            System.out.println(Arrays.toString(sortedArr));
        }
            
    }
    
    public static Integer[] integerArray()
    {
        System.out.println("Please enter the amount of values for the array");
        Scanner integerInput = new Scanner(System.in);
        
        int count = integerInput.nextInt();
        
        int temp = 0;
        
        Integer[] integerArr = new Integer[count];
        System.out.println("Please enter the values for the array");
        for(int i=0; i<count; i++){
            integerArr[i]=integerInput.nextInt();
        }        
                
        for(int i=0; i<count-1; i++){
            for(int j=0;j<count-i-1; j++){
           
            if(integerArr[j]>integerArr[j+1]){
                temp = integerArr[j];
                integerArr[j]=integerArr[j+1];
                integerArr[j+1]=temp;
            }
            }
        }
        
        return integerArr;
    }
    public static String[] stringArray(){
    
    System.out.println("Please enter the amount of values for the array");
        Scanner stringInput = new Scanner(System.in);
        
        int count = stringInput.nextInt();
        String[] stringArr = new String[count];
        
        System.out.println("Please enter the values for the array");
        for(int i=0; i<count; i++){
            stringArr[i]=stringInput.next();
        }   
        
        String temp = "";
        
        for(int i=0; i<count-1; i++){
            for(int j=0;j<count-i-1; j++){
           
            if(stringArr[j].compareToIgnoreCase(stringArr[j+1])>0){
                temp = stringArr[j];
                stringArr[j]=stringArr[j+1];
                stringArr[j+1]=temp;
            }
            }
        }
        
        return stringArr;
        
        
    }
}

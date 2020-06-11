import java.util.Scanner;

public class Mod9Week2Day4MiniProgramEx2SumArray {

    public static void main(String[] args) {
         System.out.println("How many values will be put in the array?");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        
         System.out.println("Enter the values that will be put in the array.");
        
        int[] sumArr = new int[count];
        int total = 0;
        for(int i=0; i<count; i++){
        sumArr[i]=input.nextInt();
        
        }
        for(int i=0; i<sumArr.length; i++){
        total += sumArr[i];
        
        }
        
        System.out.println(total);
        
    }
    
}

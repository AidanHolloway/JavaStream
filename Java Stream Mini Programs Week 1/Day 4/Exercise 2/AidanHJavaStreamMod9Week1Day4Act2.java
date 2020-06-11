import java.util.Scanner;

public class AidanHJavaStreamMod9Week1Day4Act2 {

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

import java.util.Scanner;

public class AidanHJavaStreamMod9Week1Day4Act3 {

    public static void main(String[] args) {
        for(int i=1; i<500; i++){
        if(isPrime(i)==true){
        System.out.println(i);
        }
        }
        
    }
    
    public static Boolean isPrime(int val){
    int countPrime = 0;
        for(int i=1; i<=val; i++){
            if((val%i)==0){
                countPrime++;}
        }
        
        if(countPrime==2){
        return true;
        }
    return false;
    }
}

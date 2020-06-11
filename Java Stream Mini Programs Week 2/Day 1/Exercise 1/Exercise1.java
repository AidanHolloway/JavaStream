import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("Enter a number to see if it is positive or negative.");
        Scanner input = new Scanner(System.in);
       
        if(input.nextInt()>=0){
            System.out.println("Number is positive.");}
        else{
            System.out.println("Number is negative.");}
        }
    }

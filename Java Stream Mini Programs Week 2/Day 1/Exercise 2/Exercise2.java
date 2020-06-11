import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        System.out.println("Enter 3 numbers to receive the largest number as the output. "
                + "Keep spaces between seperate values.");
        Scanner input = new Scanner(System.in);
        Integer firstNum = input.nextInt();
        Integer secondNum = input.nextInt();
        Integer thirdNum = input.nextInt();
        
        System.out.println(Math.max(Math.max(firstNum,secondNum), thirdNum));
        
    }
    
}

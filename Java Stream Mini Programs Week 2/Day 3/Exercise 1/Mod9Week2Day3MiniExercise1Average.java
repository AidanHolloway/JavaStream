import java.util.Scanner;

public class Mod9Week2Day3MiniExercise1Average {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input 3 numbers of any length with a space between the 3 different numbers.");
        double firstNum = 0;
        double secondNum = 0;
        double thirdNum = 0;
        
        firstNum = input.nextDouble();
        secondNum = input.nextDouble();
        thirdNum = input.nextDouble();
        
        
        
        System.out.println("The average is: " + Double.toString(average(firstNum,secondNum,thirdNum)));
        
    }
    public static double average(double x, double y, double z)
    {
        double sum = x+y+z;
        return (sum/3);
    }
}

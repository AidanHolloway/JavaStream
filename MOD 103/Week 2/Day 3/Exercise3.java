import java.lang.NumberFormatException;
import java.util.Scanner;
import java.lang.ArithmetricException; 
public class Exercise3 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the dividend value");
            int dividend = Integer.parseInt(scan.nextLine());

            System.out.println("Enter the divisor value");
            int divisor = Integer.parseInt(scan.nextLine());

            System.out.println("The quotient of " + dividend + " and "+
            divisor + " = " + (dividend/divisor));
            scan.close();
        } catch (NumberFormatException e) {
            System.out.println("Entering non-numeric values is not allowed.");
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        }
    }
}
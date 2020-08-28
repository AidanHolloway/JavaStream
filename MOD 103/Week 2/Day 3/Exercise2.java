import java.lang.ArithmeticException;
public class Exercise2 {
public static void main(String[] args) {
    try {
         System.out.println(3/0);
    } catch (ArithmeticException e) {
        System.out.println("Can't divide by zero");
    }
}  
}
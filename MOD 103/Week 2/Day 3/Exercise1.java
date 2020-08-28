import java.util.Scanner;

public class Exercise1{
    class DivisionByZeroException extends ArithmeticException {
        String message = "";

        public DivisionByZeroException(){
                this.message = "Division by zero is not allowed";           
        }

        public String toString(){
            return message;
        }
    }
    public static void main(String[] args) throws DivisionByZeroException{
        Exercise1 ex = new Exercise1();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the dividend value");
            int dividend = Integer.parseInt(scan.nextLine());

            System.out.println("Enter the divisor value");
            int divisor = Integer.parseInt(scan.nextLine());
            scan.close();
try {
          if(divisor == 0){
              throw ex.new DivisionByZeroException();
          }  
          System.out.println("The quotient of " + dividend + " and "+
            divisor + " = " + (dividend/divisor));
            
        } catch (DivisionByZeroException e) {
            System.out.println(e.toString());
        }
        
    }
}
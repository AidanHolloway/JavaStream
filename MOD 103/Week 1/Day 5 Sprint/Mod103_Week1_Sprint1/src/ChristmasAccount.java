
public class ChristmasAccount extends SavingsAccount{
    
    private int currMonths = 0;
    
    public ChristmasAccount(double rate) {
        super(0.20);
    }
    private double interestRate=20;
    @Override
    public void addInterest() {
        if(currMonths>11){
        
         interestRate=0;
        }
        else{
            super.addInterest();
        currMonths++;
        }
        }

    public double getInterestRate() {
        return interestRate;
    }

    
    
    @Override
    public void withdraw(double amount) {
        if(currMonths>=12){
            super.withdraw(amount);
        }
        else {
            System.out.println("Christmas Accounts have to wait until Christmas!");
        }
    }
    
    
}

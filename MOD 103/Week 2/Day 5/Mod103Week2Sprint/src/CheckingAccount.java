
public class CheckingAccount extends BankAccount
{  
    
     private String name;
     private String pin;
    
   public CheckingAccount(String name, String pin, double initialBalance)
   {  

      super(initialBalance);
      this.name = name;
      this.pin = pin;

      transactionCount = 0; 
   }

   public void deposit(double amount) throws AccountDepositException 
   {  
      transactionCount++;

      super.deposit(amount); 
   }
   
   public void withdraw(double amount) throws AccountWithdrawException, AccountBalanceException 
   {  
      transactionCount++;

      super.withdraw(amount); 
   }

   public void deductFees() throws AccountWithdrawException, AccountBalanceException
   {  
      if (transactionCount > FREE_TRANSACTIONS)
      {  
         double fees = TRANSACTION_FEE *
            (transactionCount - FREE_TRANSACTIONS);
         super.withdraw(fees);
      }
      transactionCount = 0;
   }

    @Override
    public String toString() {
        return name + " checking balance is: "+ super.getBalance();
    }
   
   

   private int transactionCount;

   private static final int FREE_TRANSACTIONS = 3;
   private static final double TRANSACTION_FEE = 2.0;
}

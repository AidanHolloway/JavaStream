
public class BankAccount
{  

   public BankAccount()
   {  
      balance = 0;
   }

   public BankAccount(double initialBalance)
   {  
      balance = initialBalance;
   }

   public void deposit(double amount) throws AccountDepositException 
   {  
       if(amount < 0.0){
	throw new AccountDepositException();
              }
      balance = balance + amount;
   }

   public void withdraw(double amount) throws AccountWithdrawException, AccountBalanceException
   {   if(amount < 0.0){
	throw new AccountWithdrawException();
              }
       if(balance < amount){
			throw new AccountBalanceException();
                                }
      balance = balance - amount;
   }

   public double getBalance()
   {  
      return balance; 
   }

   public void transfer(BankAccount other, double amount) throws AccountBalanceException, AccountWithdrawException, AccountDepositException
   {  
      withdraw(amount);
      other.deposit(amount);
   }

   private double balance; 
}


public abstract class ProtectedAccount extends BasicAccount {
	
	private String myPIN;

	public ProtectedAccount ( String name, String pin) {
		super(name);
		myPIN = pin;
	}

	public void deposit( double amount, String pin) {
		if(!myPIN.equals(pin)){
                System.out.println("PIN mismatch");
                }
                else{
			deposit(amount);
                }
	}

	public void withdraw( double amount, String pin) throws AccountBalanceException, AccountSecurityException, AccountWithdrawException{
		if(!myPIN.equals(pin)){
                throw new AccountSecurityException();
                }
                else{
			withdraw(amount);
                }
	}	
	
}

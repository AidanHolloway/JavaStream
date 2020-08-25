
public class AutoPayAccount extends CheckingAccount {

    private int months = 0;
    private String name;
    private double amount;
    private int currMonths = 1;
    private double totAmount = 0;

    public AutoPayAccount(String name, String pin, double initialBalance) {
        super(name, pin, initialBalance);
    }

    public void payAuto(String name, double amount, int months) {
        this.months = months;
        this.amount = amount;
        this.name = name;

    }

    @Override
    public void deductFees() {
        if (currMonths >= months) {
            super.deductFees();
            super.withdraw(amount);
            totAmount += amount;
            currMonths = 1;
        } else {
            currMonths++;
        }
    }

    @Override
    public String toString() {
        return name + " total paid: " + totAmount;
    }

}

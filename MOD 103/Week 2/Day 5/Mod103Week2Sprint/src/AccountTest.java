
public class AccountTest {

    public static int i = -1;

    public static String[] accountNames = new String[50];

    public static String name = "";
    public static boolean answer = false;

    public static void main(String[] args) throws AccountDepositException, AccountWithdrawException, AccountBalanceException, AccountExistException, AccountSecurityException {

        try {
            RegularAccount reg = new RegularAccount("Naledi Mufeng", "2234", 50.0);
            i++;
            accountNames[i] = reg.name();

            /*test account exists*/
            name = "John";
            testAccount();

            
            RegularAccount reg2 = new RegularAccount(name, "2134", 250.0);
            i++;
            accountNames[i] = reg2.name();

            System.out.println(reg2.toString());

            //add account
            name = "Joh";
            testAccount();

            RegularAccount reg3 = new RegularAccount(name, "2034", 500.0);
            i++;
            accountNames[i] = reg3.name();

            System.out.println(reg3.toString());

            //add account end
            //test
            name = "aha";
            testAccount();

            RegularAccount reg4 = new RegularAccount(name, "1934", 500.0);
            i++;
            accountNames[i] = reg4.name();
            System.out.println(reg4.toString());

            //test end
            System.out.println(reg.toString());
            reg.withdraw(10, "2234");
            System.out.println(reg.toString());

            CheckingAccount check = new CheckingAccount("Naledi Mabhena", "0142", 200.0);
            check.deposit(10.0);
            check.deposit(35.0);
            check.withdraw(25.0);
            check.deductFees();

            System.out.println(check.toString());

            System.out.println(check.getBalance());
        } catch (AccountDepositException accountDep) {
            System.out.println(accountDep.toString());
        } catch (AccountBalanceException accountBal) {
            System.out.println(accountBal.toString());
        } catch (AccountSecurityException accountSec) {
            System.out.println(accountSec.toString());
        } catch (AccountWithdrawException accountWith) {
            System.out.println(accountWith.toString());
        } catch (AccountExistException accountExist) {
            System.out.println(accountExist.toString());
        }

    }

    public static void testAccount() throws AccountExistException {

        answer = false;

        for (int a = 0; a <= i; a++) {
            if (accountNames[a].equals(name)) {
                answer = true;
                throw new AccountExistException();
            }
        }

    }
}

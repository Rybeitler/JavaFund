import java.util.ArrayList;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        account1.addToChecking(100.00);
        account1.withdrawChecking(200.00);

        account2.addToChecking(20.00);
        account2.addToSavings(200.00);
        account2.withdrawSavings(50.00);

        account3.addToChecking(300.00);
        account3.addToSavings(1000.00);


        account1.display();
        account2.display();
        account3.display();
        BankAccount.displayBank();

    }
}
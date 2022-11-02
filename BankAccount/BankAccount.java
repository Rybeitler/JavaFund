import java.text.*;
import java.util.Random;
public class BankAccount{
    private Long accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int numAccounts = 0;
    private static double accountsTotal = 0.0;

    BankAccount(){
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        this.accountNumber = generateAccountNum();
        numAccounts++;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }

    public void addToChecking(double amount){
        this.checkingBalance += amount;
        accountsTotal += amount;
    }
    
    public void addToSavings(double amount){
        this.savingsBalance += amount;
        accountsTotal += amount;
    }

    public void withdrawChecking(double amount){
        if (this.checkingBalance < amount){
            System.out.println("Insufficent Funds.");
        }else{
            this.checkingBalance -= amount;
            accountsTotal -=amount;
        }
    }

    public void withdrawSavings(double amount){
        if (this.savingsBalance < amount){
            System.out.println("Insufficent Funds.");
        }else{
            this.savingsBalance -= amount;
            accountsTotal -=amount;
        }
    }

    public double checkAccountTotal(){
        return (checkingBalance + savingsBalance);
    }

    private long generateAccountNum(){
        long number = (long)Math.floor(Math.random()*9_000_000_000L) + 1_000_000_000l;
        return number;
    }

    public void display(){
        DecimalFormat formatter = new DecimalFormat("$###,###.00");
        System.out.println("-----------");
        System.out.println("Account #: "+accountNumber);
        System.out.println("Checking: " + formatter.format(checkingBalance));
        System.out.println("Savings: " + formatter.format(savingsBalance));
    }
    public static void displayBank(){
        DecimalFormat formatter = new DecimalFormat("$###,###.00");
        System.out.println("+-----+------+");
        System.out.println("Total # of accounts: " + numAccounts);
        System.out.println("Total $ in Bank:  " + formatter.format(accountsTotal));
    }
}
package OOP_1_10;

public class Account {

    private int accountNumber;
    private int balance;
    private final double interestRate = 3;
    private double amountToGetBack;

    public Account(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getAmountToGetBack(){
        amountToGetBack = balance * ((interestRate/100) + 1);
        return amountToGetBack;
    }
}

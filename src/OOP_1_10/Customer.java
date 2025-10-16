package OOP_1_10;

import java.util.ArrayList;

public class Customer extends Person {

    private ArrayList<Account> accounts = new ArrayList<>();
    private ArrayList<Loan> loans = new ArrayList<>();

    public Customer(String name) {
        super(name);
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void addLoan(Loan loan){
        loans.add(loan);
    }

    public void printAccounts(){
        for (Account a : accounts){
            System.out.println(getName() + "'s account: (" + a.getAccountNumber() +
                    ") $" + a.getBalance() + " (" + a.getInterestRate() +
                    "% -> $" + a.getAmountToGetBack() + ")");
        }
    }

    public void printLoans(){
        for (Loan l : loans){
            System.out.println(getName() + "'s loan: $" + l.getAmount() +
                    " (" + l.getInterestRate() + "% -> $" + l.getAmountToPayBack() +
                    ") authorized by " + l.getEmployee().getName());
        }
    }

    public void printAll(){
        printAccounts();
        printLoans();
    }

}

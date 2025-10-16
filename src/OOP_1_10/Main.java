package OOP_1_10;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account(18931892, 90000);
        Account account2 = new Account(382157136, 45000);
        Customer customer1 = new Customer("Melvin");
        Employee employee1 = new Employee("Tim", 01, 25000);
        Loan loan1 = new Loan(10000, 5, employee1);
        Loan loan2 = new Loan(2500, 2, employee1);

        customer1.addAccount(account1);
        customer1.addAccount(account2);
        customer1.addLoan(loan1);
        customer1.addLoan(loan2);
        customer1.printAll();
        loan1.setInterestRate(10, employee1);
        loan1.printRateHistory();

    }
}
package OOP_1_10;

import java.util.ArrayList;

public class Loan {

    private double amount;
    private double interestRate;
    private double amountToPayBack;
    private Employee employee;
    private ArrayList<String> rateHistory = new ArrayList<>();

    public Loan(double amount, double interestRate, Employee employee) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.employee = employee;
    }

    public double getAmountToPayBack() {
        amountToPayBack = amount * ((interestRate/100) + 1);
        return amountToPayBack;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setInterestRate(double interestRate, Employee employee) {
        double oldRate = this.interestRate;
        this.interestRate = interestRate;
        String employeeName = employee.getName();
        String history = employeeName + " changed the rate from " + oldRate + "% to " + interestRate + "%";
        rateHistory.add(history);
    }

    public void printRateHistory(){
        for (String s : rateHistory){
            System.out.println(s);
        }
    }
}

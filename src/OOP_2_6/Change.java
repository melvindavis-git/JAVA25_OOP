package OOP_2_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Change {

    private List<Integer> values = List.of(1000, 500, 200, 100, 50, 20, 10, 5, 2, 1);

    public int getChange(int cost, int paidAmount){
        return paidAmount - cost;
    }

    public List<Integer> getValues(){
        return values;
    }

    public int getAmountOfValues(int value, int change){
        return change / value;
    }

    public int getRest(int change, int value, int amountValue){
        return change - (value * amountValue);
    }

    // best rest-method
    public int getRestModulu(int change, int value){
        return change % value;
    }

    public List<Integer> getChangeList(int change){
        List<Integer> list = new ArrayList<>();
        for (Integer value : values){
            int amount = getAmountOfValues(value, change);
            list.add(amount);
            change = getRestModulu(change, value);
        }
        return list;
    }

    public String getMoneyType(int value){
        if (value < 20) return "kronor";
        return "lappar";
    }

    public String getPrint(int value, int amount){
        return "Antal " + value + "-" + getMoneyType(value) + ": " + amount;
    }


    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in kostnaden: ");
        int cost = scanner.nextInt();
        System.out.print("Skriv in det du betalade: ");
        int paidAmount = scanner.nextInt();

        int change = getChange(cost, paidAmount);
        List<Integer> changeList = getChangeList(change);
        for (int i = 0; i < changeList.size(); i++) {
            System.out.println(getPrint(values.get(i), changeList.get(i)));
        }
    }

}

package OOP_1_9;

public class Main {
    public static void main(String[] args) {

        for (RomanNumerals n : RomanNumerals.values()){
            System.out.println(n + ": " + n.getNumber());
        }

    }
}
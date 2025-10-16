package OOP_2_3;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("");
            String input = scanner.nextLine();
            if (input.isBlank()){
                break;
            }
            System.out.println("Du skrev: " + input);
        }


    }
}
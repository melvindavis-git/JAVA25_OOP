package OOP_2_4;

import OOP_2_2.Calculate;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange dagens mätarställning: ");
        int input1 = scanner.nextInt();
        System.out.print("Ange mätarställningen för ett år sedan: ");
        int input2 = scanner.nextInt();
        System.out.print("Ange mängden bensin som förbrukats under året (liter): ");
        int input3 = scanner.nextInt();

        OOP_2_4.Calculate c = new OOP_2_4.Calculate(input1, input2, input3);

        System.out.println("Antal körda mil: " + c.getOneYearMiles());
        System.out.println("Antal liter bensin: " + c.getFuelConsumption());
        System.out.println("Förbrukning per mil: " + c.getOneYearFuel());

    }
}
package OOP_2_2;

import javax.swing.*;

public class Main {
    static void main() {

        int input1 = Integer.parseInt(JOptionPane.showInputDialog("Ange dagens mätarställning: "));
        int input2 = Integer.parseInt(JOptionPane.showInputDialog("Ange mätarställningen för ett år sedan: "));
        int input3 = Integer.parseInt(JOptionPane.showInputDialog("Ange mängden bensin som förbrukats under året (liter): "));

        Calculate c = new Calculate(input1, input2, input3);

        System.out.println("Antal körda mil: " + c.getOneYearMiles());
        System.out.println("Antal liter bensin: " + c.getFuelConsumption());
        System.out.println("Förbrukning per mil: " + c.getOneYearFuel());

    }
}
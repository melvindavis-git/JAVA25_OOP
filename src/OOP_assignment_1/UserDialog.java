package OOP_assignment_1;

import javax.swing.*;

public abstract class UserDialog {

    public static void start() {
        boolean nameFound = false;
        while (!nameFound) {
            String input = JOptionPane.showInputDialog("Vilken växt ska få vätska? \n" +
                    "( " + Plant.getPlantNames() + ")");

            if (input == null) {
                System.out.println("Programmet avslutas.");
                break;
            }

            input = input.trim();

            if (input.isEmpty()) {
                continue;
            }

            for (Plant p : Plant.getPlants()) {
                if (p.getName().equalsIgnoreCase(input)) {
                    JOptionPane.showMessageDialog(null, p.getName() +
                            " behöver " + p.calculateLiquidAmount() + " " + p.getLiquid().liquidUnit +
                            " " + p.getLiquid().liquidType + " per dag.");
                    nameFound = true;
                    break;
                }
            }

            if (!nameFound) {
                JOptionPane.showMessageDialog(null,
                        "Det finns ingen växt med namnet " + input);
            }

        }
    }

}
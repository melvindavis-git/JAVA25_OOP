package OOP_3_9;

import javax.swing.*;

public class Main {
    static void main() {
        String medicineType = JOptionPane.showInputDialog("Vilken medicin ska du ta?");
        String frequencyInput = JOptionPane.showInputDialog("Hur många gånger per minut?");
        int medicineFrequency = Integer.parseInt(frequencyInput);
        Medicine medicine = new Medicine(medicineType, medicineFrequency);
        medicine.start();
    }
}
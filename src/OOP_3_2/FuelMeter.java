package OOP_3_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FuelMeter extends JFrame implements ActionListener {

    JPanel jPanel = new JPanel();
    JLabel jLabel = new JLabel("Ange mätarställning nu:");
    JTextField jTextField = new JTextField(20);
    JLabel jLabel2 = new JLabel("Ange mätarställning för ett år sedan:");
    JTextField jTextField2 = new JTextField(20);
    JLabel jLabel3 = new JLabel("Ange antal liter förbrukad bensin:");
    JTextField jTextField3 = new JTextField(20);
    JPanel jPanel2 = new JPanel();
    JLabel jLabel4 = new JLabel("Antal körda mil:          ");
    JLabel jLabel5 = new JLabel("Antal liter bensin:          ");
    JLabel jLabel6 = new JLabel("Förbrukning per mil:          ");

    public FuelMeter() {
        this.add(jPanel, BorderLayout.NORTH);
        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jPanel.add(jLabel2);
        jPanel.add(jTextField2);
        jPanel.add(jLabel3);
        jPanel.add(jTextField3);
        this.add(jPanel2, BorderLayout.SOUTH);
        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(jLabel4, BorderLayout.WEST);
        jPanel2.add(jLabel5, BorderLayout.CENTER);
        jPanel2.add(jLabel6, BorderLayout.EAST);

        jPanel.setLayout(new GridLayout(3, 2));

        jTextField.addActionListener(this);
        jTextField2.addActionListener(this);
        jTextField3.addActionListener(this);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double distanceNow = Double.parseDouble(jTextField.getText());
            double distanceOneYearAgo = Double.parseDouble(jTextField2.getText());
            double fuelAmount = Double.parseDouble(jTextField3.getText());

            double yearDistance = distanceNow - distanceOneYearAgo;
            double fuelPerMile = fuelAmount / yearDistance;

            jLabel4.setText("Antal körda mil: " + yearDistance + " ");
            jLabel5.setText("Antal liter bensin: " + fuelAmount + " ");
            jLabel6.setText("Förbrukning per mil: " + fuelPerMile);
        } catch (NumberFormatException exception){
            System.out.println("Ange giltiga värden i alla fält, tryck sedan enter.");
        }
    }
}
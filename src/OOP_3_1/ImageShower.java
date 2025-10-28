package OOP_3_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageShower extends JFrame implements ActionListener {

    JPanel jPanel = new JPanel();

    ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("C:/Users/melvi/Pictures/s3_images/sprite.jpg")
            .getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
    ImageIcon imageIcon2 = new ImageIcon(new ImageIcon("C:/Users/melvi/Pictures/s3_images/water.jpg")
            .getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
    JLabel jLabel = new JLabel(imageIcon1);

    JButton jButton = new JButton("Växla bild");
    boolean toggle = true;

    public ImageShower(){
        this.add(jPanel);
        jPanel.add(jLabel);
        jPanel.add(jButton);
        jButton.addActionListener(this);

        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (toggle) {
            jLabel.setIcon(imageIcon2);
        }
        else {
            jLabel.setIcon(imageIcon1);
        }
        toggle = !toggle;
    }
}

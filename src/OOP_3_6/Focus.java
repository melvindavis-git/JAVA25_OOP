package OOP_3_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Focus extends JFrame {

    JPanel p = new JPanel();
    JButton b1 = new JButton("btn1");
    JButton b2 = new JButton("btn2");
    JTextField tf = new JTextField("Första");

    public Focus() {
        this.add(p);
        p.add(b1);
        p.add(b2);
        p.add(tf);

        setSize(200, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        tf.requestFocus();
        tf.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                tf.setBackground(Color.BLUE);
            }

            @Override
            public void focusLost(FocusEvent e) {
                tf.setBackground(null);
            }
        });
    }

}
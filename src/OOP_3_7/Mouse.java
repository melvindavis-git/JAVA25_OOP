package OOP_3_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse extends JFrame implements MouseListener {

    JPanel p = new JPanel();
    JButton b = new JButton("Knapp");

    public Mouse() {
        this.add(p);
        p.add(b);
        b.addMouseListener(this);

        setSize(200, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        b.setBackground(Color.RED);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        b.setBackground(null);
    }
}

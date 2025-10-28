package OOP_3_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.*;

public class TextEditor extends JFrame implements ActionListener {

    JPanel p = new JPanel();
    JPanel pCenter = new JPanel();
    JPanel pDown = new JPanel();
    JLabel l = new JLabel("Filname:");
    JTextField tf = new JTextField(10);
    JButton b1 = new JButton("Open");
    JButton b2 = new JButton("Save");
    JButton b3 = new JButton("Print");
    JButton b4 = new JButton("Exit");
    JButton b5 = new JButton("Clear all");
    JButton b6 = new JButton("Undo clear");
    JTextArea ta = new JTextArea(10, 45);
    JScrollPane sp = new JScrollPane(ta);

    String temp = "";


    public TextEditor(){
        this.add(p, BorderLayout.NORTH);
        this.add(pCenter, BorderLayout.CENTER);
        this.add(pDown, BorderLayout.SOUTH);
        p.add(l);
        p.add(tf);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        pCenter.add(sp);
        pDown.add(b5);
        pDown.add(b6);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            readFile(tf.getText());
        }
        else if (e.getSource() == b2){
            writeFile(tf.getText());
        }
        else if (e.getSource() == b3){
            try {
                ta.print();
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
        }
        else if (e.getSource() == b4){
            System.exit(0);
        }
        else if (e.getSource() == b5){
            temp = ta.getText();
            ta.setText("");
        }
        else if (e.getSource() == b6) {
            if (!temp.isEmpty()){
                ta.setText(temp);
            }
        }
    }

    public void readFile(String fileName){
        try(BufferedReader br = new BufferedReader(new FileReader("src/OOP_3_4/" + fileName))){
            String line;
            while ((line = br.readLine()) != null) {
                ta.append(line + "\n");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void removeText(String fileName){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/OOP_3_4/" + fileName))){
            bw.write("");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void writeFile(String fileName){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/OOP_3_4/" + fileName, true))){
            removeText(fileName);
            bw.write(ta.getText());
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
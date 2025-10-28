package OOP_3_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.print.PrinterException;
import java.io.*;

public class TextEditor extends JFrame implements ActionListener, KeyListener {

    private String temp = "";
    private int charCount = 0;
    private int wordCount = 0;

    JPanel pUp = new JPanel();
    JPanel pCenter = new JPanel();
    JPanel pDown = new JPanel();
    JPanel topLeft = new JPanel();
    JPanel topRight = new JPanel();
    JPanel downRight = new JPanel();
    JPanel downLeft = new JPanel();
    JLabel l = new JLabel("Filename:");
    JTextField tf = new JTextField(10);
    JButton b1 = new JButton("Open");
    JButton b2 = new JButton("Save");
    JButton b3 = new JButton("Print");
    JButton b4 = new JButton("Exit");
    JButton b5 = new JButton("Clear all");
    JButton b6 = new JButton("Undo clear");
    JTextArea ta = new JTextArea(20, 60);
    JScrollPane sp = new JScrollPane(ta);
    JLabel labelCounter = new JLabel("characters: " + charCount);
    JLabel labelWordCounter = new JLabel("words: " + wordCount);


    public TextEditor(){
        this.add(pUp, BorderLayout.NORTH);
        this.add(pCenter, BorderLayout.CENTER);
        this.add(pDown, BorderLayout.SOUTH);
        pUp.setLayout(new BorderLayout());
        pUp.add(topLeft, BorderLayout.WEST);
        pUp.add(topRight, BorderLayout.EAST);
        pDown.setLayout(new BorderLayout());
        pDown.add(downRight, BorderLayout.EAST);
        pDown.add(downLeft, BorderLayout.WEST);
        downRight.add(b5);
        downRight.add(b6);
        downLeft.add(labelCounter);
        downLeft.add(labelWordCounter);
        topLeft.add(l);
        topLeft.add(tf);
        topRight.add(b1);
        topRight.add(b2);
        topRight.add(b3);
        topRight.add(b4);
        pCenter.add(sp);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        ta.addKeyListener(this);

        pack();
        setVisible(true);
        setResizable(false);
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
            if (!ta.getText().isEmpty()) {
                temp = ta.getText();
                ta.setText("");
            }
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

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        String text = ta.getText().trim();
        charCount = text.replaceAll("\\s+", "").length();
        labelCounter.setText("characters: " + charCount);

        int wordCount = 0;
        if (!text.isEmpty()){
            wordCount = text.split("\\s+").length;
        }
        labelWordCounter.setText("words: " + wordCount);
    }
}
package OOP_3_5;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RPS extends JFrame implements ActionListener {

    JPanel p = new JPanel();
    JPanel pLeft = new JPanel();
    JPanel pRight = new JPanel();
    JLabel l1 = new JLabel("Rock Paper Scissors");
    JLabel l2 = new JLabel("User: 0");
    JLabel l3 = new JLabel("AI: 0");
    JButton b1 = new JButton("Rock");
    JButton b2 = new JButton("Paper");
    JButton b3 = new JButton("Scissors");
    JButton b4 = new JButton("Rock");
    JButton b5 = new JButton("Paper");
    JButton b6 = new JButton("Scissors");
    JLabel roundWinner = new JLabel("");
    Font boldFont = new Font("Arial", Font.BOLD, 12);

    int userScore = 0;
    int aiScore = 0;

    public RPS(){
        this.add(p, BorderLayout.NORTH);
        this.add(pLeft, BorderLayout.WEST);
        pLeft.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.add(pRight, BorderLayout.EAST);
        pRight.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(l1);
        l1.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.add(roundWinner);
        pLeft.add(l2);
        pLeft.add(b1);
        pLeft.add(b2);
        pLeft.add(b3);
        pRight.add(l3);
        pRight.add(b4);
        pRight.add(b5);
        pRight.add(b6);

        p.setLayout(new GridLayout(2, 1));
        pLeft.setLayout(new GridLayout(4, 1));
        pRight.setLayout(new GridLayout(4, 1));

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        l3.setHorizontalAlignment(SwingConstants.CENTER);
        roundWinner.setHorizontalAlignment(SwingConstants.CENTER);
        l2.setFont(boldFont);
        l3.setFont(boldFont);

        setSize(300, 300);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        resetColors();
        resetFontColor();

        int userChoice = 0;
        int aiChoice = Randomizer();

        if(e.getSource() == b1){
            userChoice = 1;
            b1.setBackground(Color.GREEN);
        }
        else if(e.getSource() == b2){
            userChoice = 2;
            b2.setBackground(Color.GREEN);
        }
        else if(e.getSource() == b3){
            userChoice = 3;
            b3.setBackground(Color.GREEN);
        }

        AIbuttons(aiChoice);

        gameLogic(userChoice, aiChoice);

        l2.setText("User: " + userScore);
        l3.setText("AI: " + aiScore);
    }

    public int Randomizer(){
        Random random = new Random();
        int number = random.nextInt(3) + 1;
        return number;
    }

    public void AIbuttons(int num){
        if(num == 1) b4.setBackground(Color.GREEN);
        if(num == 2) b5.setBackground(Color.GREEN);
        if(num == 3) b6.setBackground(Color.GREEN);
    }

    public void resetColors(){
        b1.setBackground(null);
        b2.setBackground(null);
        b3.setBackground(null);
        b4.setBackground(null);
        b5.setBackground(null);
        b6.setBackground(null);
    }

    public void gameLogic(int user, int ai){
        if(user == ai){
            roundWinner.setText("Tie!");
            changeFontDark(l2, l3);
        }
        else if((user == 1 && ai == 3) || (user == 2 && ai == 1) || user == 3 && ai == 2){
            userScore++;
            roundWinner.setText("User wins!");
            changeColorGreen(l2);
        } else {
            aiScore++;
            roundWinner.setText("AI wins!");
            changeColorGreen(l3);
        }
    }

    public void changeColorGreen(JLabel label){
        label.setForeground(Color.GREEN);
    }
    public void changeFontDark(JLabel label, JLabel label2){
        label.setForeground(Color.GRAY);
        label2.setForeground(Color.GRAY);
    }

    public void resetFontColor(){
        l2.setForeground(null);
        l3.setForeground(null);
    }

}
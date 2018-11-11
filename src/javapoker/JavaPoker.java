package javapoker;

import java.awt.Color;
import java.awt.event.*;
import java.io.File;

import java.awt.Color;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class JavaPoker implements ActionListener {

    ArrayList<Cards> cardsArray = new ArrayList<Cards>();
    JLabel amountofMoney;
    JLabel yourbetamount;
    String masterVal = "1500";
    int moneyAmount = Integer.parseInt(masterVal);
    int value = Integer.parseInt(masterVal);
    JLabel pot;
    String potString = "0";
    int potCount = Integer.parseInt(potString);
    String howmuchplayerbert = "0";
    int theBets = Integer.parseInt(howmuchplayerbert);
    JButton bet;
    JButton check;
    JButton fold;
    Table table;
    JLayeredPane pane;
    JLabel bot1Bet;
    JLabel bot2Bet;
    JLabel bot3Bet;
    boolean b = true;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        new JavaPoker();
    }

    public JavaPoker() throws IOException {

        Cards chip5 = new Cards(5, ImageIO.read(new File("Chip5.png")), "null");
        Cards chip10 = new Cards(10, ImageIO.read(new File("Chip10.png")), "null");
        Cards chip25 = new Cards(25, ImageIO.read(new File("Chip25.png")), "null");
        Cards chip100 = new Cards(100, ImageIO.read(new File("Chip100.png")), "null");

        pane = new JLayeredPane();
        JFrame mainFrame = new JFrame("Panel Example");
        mainFrame.getContentPane().add(pane);
        pane.setBounds(0, 0, 2000, 2000);
        pane.setBackground(Color.gray);
        pane.setLayout(null);
        table = new Table();

        table.dealHands();

        JLabel playercard1 = new JLabel(new ImageIcon(table.player.hand[0].getCardImage()));
        playercard1.setBounds(800, 850, 200, 300);
        //   System.out.println(table.player.hand[0].getScore());

        JLabel c3pocard1 = new JLabel(new ImageIcon(table.botOne.hand[0].getCardImage()));
        c3pocard1.setBounds(10, 350, 200, 300);
        //  System.out.println(table.botOne.hand[0].getScore());

        JLabel droidcard1 = new JLabel(new ImageIcon(table.botTwo.hand[0].getCardImage()));
        droidcard1.setBounds(800, -100, 200, 300);
        //  System.out.println(table.botTwo.hand[0].getScore());

        JLabel vadercard1 = new JLabel(new ImageIcon(table.botThree.hand[0].getCardImage()));
        vadercard1.setBounds(1650, 350, 200, 300);
        // System.out.println(table.botThree.hand[0].getScore());

        JLabel playercard2 = new JLabel(new ImageIcon(table.player.hand[1].getCardImage()));
        playercard2.setBounds(925, 850, 200, 300);
        // System.out.println(table.player.hand[1].getScore());

        JLabel c3pocard2 = new JLabel(new ImageIcon(table.botOne.hand[1].getCardImage()));
        c3pocard2.setBounds(50, 350, 200, 300);
        // System.out.println(table.botOne.hand[1].getScore());

        JLabel droidcard2 = new JLabel(new ImageIcon(table.botTwo.hand[1].getCardImage()));
        droidcard2.setBounds(925, -100, 200, 300);
        // System.out.println(table.botTwo.hand[1].getScore());

        JLabel vadercard2 = new JLabel(new ImageIcon(table.botThree.hand[1].getCardImage()));
        vadercard2.setBounds(1705, 350, 200, 300);
        //System.out.println(table.botThree.hand[1].getScore());

        bet = new JButton("Place Bet");
        bet.setBounds(1150, 865, 150, 50);
        bet.addActionListener(this);

        check = new JButton("Check");
        check.setBounds(1150, 925, 150, 50);
        check.addActionListener(this);

        fold = new JButton("Fold");
        fold.setBounds(1150, 985, 150, 50);
        fold.addActionListener(this);

        yourbetamount = new JLabel(howmuchplayerbert);
        yourbetamount.setBounds(1750, 785, 100, 100);

        amountofMoney = new JLabel(masterVal);
        amountofMoney.setBounds(1750, 775, 150, 150);

        pot = new JLabel("Pot: " + potString);
        pot.setBounds(1800, 10, 100, 100);

        bot1Bet = new JLabel(table.botOne.botsLeft());
        bot1Bet.setBounds(50, 300, 100, 100);

        bot2Bet = new JLabel(table.botTwo.botsLeft());
        bot2Bet.setBounds(750, 50, 100, 100);

        bot3Bet = new JLabel(table.botThree.botsLeft());
        bot3Bet.setBounds(1800, 300, 100, 100);

        JLabel label5 = new JLabel(new ImageIcon(chip5.getCardImage()));
        JLabel label10 = new JLabel(new ImageIcon(chip10.getCardImage()));
        JLabel label25 = new JLabel(new ImageIcon(chip25.getCardImage()));
        JLabel label100 = new JLabel(new ImageIcon(chip100.getCardImage()));
        label5.setBounds(1300, 875, 150, 150);
        label10.setBounds(1450, 875, 150, 150);
        label25.setBounds(1600, 875, 150, 150);
        label100.setBounds(1750, 875, 150, 150);

        pane.add(playercard1, new Integer(1));
        pane.add(playercard2, new Integer(2));
        pane.add(droidcard1, new Integer(2));
        pane.add(droidcard2, new Integer(1));
        pane.add(c3pocard1, new Integer(1));
        pane.add(c3pocard2, new Integer(2));
        pane.add(vadercard1, new Integer(1));
        pane.add(vadercard2, new Integer(2));
        pane.add(bet, new Integer(0));
        pane.add(check, new Integer(0));
        pane.add(fold, new Integer(0));
        pane.add(yourbetamount, new Integer(0));
        pane.add(label5);
        pane.add(label10);
        pane.add(label25);
        pane.add(label100);
        pane.add(amountofMoney);
        pane.add(pot);
        pane.add(bot1Bet);
        pane.add(bot2Bet);
        pane.add(bot3Bet);

        MouseListener ml5 = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                String backtoInt;
                String backtoInt2;
                if (SwingUtilities.isRightMouseButton(e) && value < moneyAmount) {
                    value = value + 5;
                    if (value > moneyAmount) {
                        value = 1500;
                    }

                    theBets = theBets - 5;
                    if (theBets < 0) {
                        theBets = 0;
                    }
                    backtoInt2 = String.valueOf(theBets);
                    yourbetamount.setText(backtoInt2);

                    backtoInt = String.valueOf(value);
                    amountofMoney.setText(backtoInt);
                } else if (SwingUtilities.isLeftMouseButton(e)) {
                    value = value - 5;
                    backtoInt = String.valueOf(value);
                    amountofMoney.setText(backtoInt);

                    theBets = theBets + 5;
                    backtoInt2 = String.valueOf(theBets);
                    yourbetamount.setText(backtoInt2);
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        MouseListener ml10 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                String backtoInt;
                String backtoInt2;
                if (SwingUtilities.isRightMouseButton(e) && value < moneyAmount) {
                    value = value + 10;
                    if (value > moneyAmount) {
                        value = 1500;
                    }

                    theBets = theBets - 10;
                    if (theBets < 0) {
                        theBets = 0;
                    }
                    backtoInt2 = String.valueOf(theBets);
                    yourbetamount.setText(backtoInt2);
                    backtoInt = String.valueOf(value);
                    amountofMoney.setText(backtoInt);
                } else if (SwingUtilities.isLeftMouseButton(e)) {
                    value = value - 10;
                    backtoInt = String.valueOf(value);
                    amountofMoney.setText(backtoInt);
                    theBets = theBets + 10;
                    backtoInt2 = String.valueOf(theBets);
                    yourbetamount.setText(backtoInt2);
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        MouseListener ml25 = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                String backtoInt;
                String backtoInt2;
                if (SwingUtilities.isRightMouseButton(e) && value < moneyAmount) {
                    value = value + 25;
                    if (value > moneyAmount) {
                        value = 1500;
                    }

                    theBets = theBets - 25;
                    if (theBets < 0) {
                        theBets = 0;
                    }
                    backtoInt2 = String.valueOf(theBets);
                    yourbetamount.setText(backtoInt2);
                    backtoInt = String.valueOf(value);
                    amountofMoney.setText(backtoInt);
                } else if (SwingUtilities.isLeftMouseButton(e)) {
                    value = value - 25;
                    backtoInt = String.valueOf(value);
                    amountofMoney.setText(backtoInt);
                    theBets = theBets + 25;
                    backtoInt2 = String.valueOf(theBets);
                    yourbetamount.setText(backtoInt2);
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        MouseListener ml100 = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                String backtoInt;
                String backtoInt2;
                if (SwingUtilities.isRightMouseButton(e) && value < moneyAmount) {

                    value = value + 100;
                    if (value > moneyAmount) {
                        value = 1500;
                    }

                    backtoInt = String.valueOf(value);
                    amountofMoney.setText(backtoInt);
                    theBets = theBets - 100;
                    if (theBets < 0) {
                        theBets = 0;
                    }
                    backtoInt2 = String.valueOf(theBets);
                    yourbetamount.setText(backtoInt2);

                } else if (SwingUtilities.isLeftMouseButton(e)) {
                    value = value - 100;
                    backtoInt = String.valueOf(value);
                    amountofMoney.setText(backtoInt);
                    theBets = theBets + 100;
                    backtoInt2 = String.valueOf(theBets);
                    yourbetamount.setText(backtoInt2);
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };

        label5.addMouseListener(ml5);
        label10.addMouseListener(ml10);
        label25.addMouseListener(ml25);
        label100.addMouseListener(ml100);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(2000, 2000);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
    }
    String master = "Flop";

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object control = ((JButton) ae.getSource()).getText();
        if (control == "Place Bet") {
            boolean one = true;
            boolean two = true;
            boolean three = true;
            switch (master) {
                case "Flop":

                    moneyAmount = moneyAmount - theBets;
                    String val = String.valueOf(moneyAmount);
                    amountofMoney.setText(val);
                    yourbetamount.setText("0");
                    potCount = potCount + theBets;
                    potString = String.valueOf(potCount);
                    pot.setText("Pot: " + potString);

                     {
                        try {
                            int thebotsBets = table.botOne.botsBets();
                            if (thebotsBets < theBets) {
                                System.out.println("Fold");
                                JOptionPane.showMessageDialog(null, "C3PO decided to Fold");
                            } else {
                                table.botOne.botsRunningTotal(thebotsBets);
                                bot1Bet.setText(table.botOne.botsLeft());
                                potCount = potCount + thebotsBets;
                                potString = String.valueOf(potCount);
                                pot.setText("Pot: " + potString);
                            }
                            int thebotsBetsDroid = table.botTwo.botsBets();
                            if (thebotsBetsDroid < thebotsBets ) {
                                System.out.println("Fold");
                                JOptionPane.showMessageDialog(null, "Droid decided to Fold");
                            } else {
                                table.botTwo.botsRunningTotal(thebotsBetsDroid);
                                bot2Bet.setText(table.botTwo.botsLeft());
                                potCount = potCount + thebotsBetsDroid;
                                potString = String.valueOf(potCount);
                                pot.setText("Pot: " + potString);
                            };
                            int thebotsBetsVader = table.botThree.botsBets();
                            if (thebotsBetsVader < thebotsBetsDroid) {
                                System.out.println("Fold");
                                JOptionPane.showMessageDialog(null, "Vader decided to Fold");
                            } else {
                                table.botTwo.botsRunningTotal(thebotsBetsVader);
                                bot2Bet.setText(table.botThree.botsLeft());
                                potCount = potCount + thebotsBetsVader;
                                potString = String.valueOf(potCount);
                                pot.setText("Pot: " + potString);
                            };

                            table.botThree.botsBets();
                        } catch (IOException ex) {
                            Logger.getLogger(JavaPoker.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    table.theFlop();
                    JLabel flopCard1 = new JLabel(new ImageIcon(table.comHand[0].getCardImage()));
                    flopCard1.setBounds(350, 350, 200, 300);
                    JLabel flopCard2 = new JLabel(new ImageIcon(table.comHand[1].getCardImage()));
                    flopCard2.setBounds(600, 350, 200, 300);
                    JLabel flopCard3 = new JLabel(new ImageIcon(table.comHand[2].getCardImage()));
                    flopCard3.setBounds(850, 350, 200, 300);
                    pane.add(flopCard1, new Integer(0));
                    pane.add(flopCard2, new Integer(0));
                    pane.add(flopCard3, new Integer(0));
                    master = "Turn";

                    break;
                case "Turn":

                    moneyAmount = moneyAmount - theBets;
                    masterVal = String.valueOf(moneyAmount);
                    amountofMoney.setText(masterVal);
                    yourbetamount.setText("0");
                    potCount = potCount + theBets;
                    potString = String.valueOf(potCount);
                    pot.setText("Pot: " + potString);
                    bet.setEnabled(false);
                    check.setEnabled(false);
                    fold.setEnabled(false);

                    table.theTurn();
                    JLabel turnCard = new JLabel(new ImageIcon(table.comHand[3].getCardImage()));
                    turnCard.setBounds(1100, 350, 200, 300);
                    pane.add(turnCard, new Integer(0));
                    master = "River";
                    bet.setEnabled(true);
                    check.setEnabled(true);
                    fold.setEnabled(true);
                    break;
                case "River":
                    moneyAmount = moneyAmount - theBets;
                    masterVal = String.valueOf(moneyAmount);
                    amountofMoney.setText(masterVal);
                    yourbetamount.setText("0");
                    potCount = potCount + theBets;
                    potString = String.valueOf(potCount);
                    pot.setText("Pot: " + potString);
                    bet.setEnabled(false);
                    check.setEnabled(false);
                    fold.setEnabled(false);

                    table.theRiver();
                    JLabel river = new JLabel(new ImageIcon(table.comHand[4].getCardImage()));
                    river.setBounds(1350, 350, 200, 300);
                    pane.add(river, new Integer(0));
                    bet.setEnabled(true);
                    check.setEnabled(true);
                    fold.setEnabled(true);
                    break;
            }

//           
//
//           
        } else if (control == "Fold") {
            bet.setEnabled(false);
            check.setEnabled(false);
            fold.setEnabled(false);
        }
    }
}

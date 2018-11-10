
package javapoker;


import java.awt.Color;
import java.awt.event.*;
import java.io.File;

import java.awt.Color;

import java.io.IOException;

import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JLayeredPane;
import javax.swing.SwingUtilities;

public class JavaPoker {

    ArrayList<Cards> cardsArray = new ArrayList<Cards>();
    String masterVal = "1500";
    int moneyAmount = Integer.parseInt(masterVal);
    int value = Integer.parseInt(masterVal);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        new JavaPoker();
    }

    public JavaPoker() throws IOException {


        Cards chip1 = new Cards(1, ImageIO.read(new File("Chip1.png")), "null");
        Cards chip5 = new Cards(5, ImageIO.read(new File("Chip5.png")), "null");
        Cards chip10 = new Cards(10, ImageIO.read(new File("Chip10.png")), "null");
        Cards chip25 = new Cards(25, ImageIO.read(new File("Chip25.png")), "null");
        Cards chip100 = new Cards(100, ImageIO.read(new File("Chip100.png")), "null");


        JLayeredPane pane = new JLayeredPane();
        JFrame mainFrame = new JFrame("Panel Example");
        mainFrame.getContentPane().add(pane);
        pane.setBounds(0, 0, 2000, 2000);
        pane.setBackground(Color.gray);
        pane.setLayout(null);
        Deck deck = new Deck();
        Table table = new Table();
        JLabel playercard1 = new JLabel(new ImageIcon(table.deck.getCard().getCardImage()));
        playercard1.setBounds(800, 850, 200, 300);
        JLabel playercard2 = new JLabel(new ImageIcon(deck.getCard().getCardImage()));
        playercard2.setBounds(925, 850, 200, 300);
        JLabel droidcard1 = new JLabel(new ImageIcon(deck.getCard().getCardImage()));
        droidcard1.setBounds(800, -100, 200, 300);
        JLabel droidcard2 = new JLabel(new ImageIcon(deck.getCard().getCardImage()));
        droidcard2.setBounds(925, -100, 200, 300);
        JLabel c3pocard1 = new JLabel(new ImageIcon(deck.getCard().getCardImage()));
        c3pocard1.setBounds(10, 350, 200, 300);
        JLabel c3pocard2 = new JLabel(new ImageIcon(deck.getCard().getCardImage()));
        c3pocard2.setBounds(50, 350, 200, 300);
        JLabel vadercard1 = new JLabel(new ImageIcon(deck.getCard().getCardImage()));
        vadercard1.setBounds(1650, 350, 200, 300);
        JLabel vadercard2 = new JLabel(new ImageIcon(deck.getCard().getCardImage()));
        vadercard2.setBounds(1705, 350, 200, 300);
        JLabel riverCard1 = new JLabel(new ImageIcon(deck.getCard().getCardImage()));
        riverCard1.setBounds(350, 350, 200, 300);
        JLabel riverCard2 = new JLabel(new ImageIcon(deck.getCard().getCardImage()));
        riverCard2.setBounds(600, 350, 200, 300);
        JLabel riverCard3 = new JLabel(new ImageIcon(deck.getCard().getCardImage()));
        riverCard3.setBounds(850, 350, 200, 300);
        JLabel turnCard = new JLabel(new ImageIcon(deck.getCard().getCardImage()));
        turnCard.setBounds(1100, 350, 200, 300);
        JLabel flopCard = new JLabel(new ImageIcon(deck.getCard().getCardImage()));
        flopCard.setBounds(1350, 350, 200, 300);



        JLabel label = new JLabel(new ImageIcon(chip1.getCardImage()));
        JLabel label5 = new JLabel(new ImageIcon(chip5.getCardImage()));
        JLabel label10 = new JLabel(new ImageIcon(chip10.getCardImage()));
        JLabel label25 = new JLabel(new ImageIcon(chip25.getCardImage()));
        JLabel label100 = new JLabel(new ImageIcon(chip100.getCardImage()));

        JLabel amountofMoney = new JLabel(masterVal);

        label.setBounds(1150, 875, 150, 150);
        label5.setBounds(1300, 875, 150, 150);
        label10.setBounds(1450, 875, 150, 150);
        label25.setBounds(1600, 875, 150, 150);
        label100.setBounds(1750, 875, 150, 150);
        amountofMoney.setBounds(1750, 775, 150, 150);



        pane.add(playercard1, new Integer(1));
        pane.add(playercard2, new Integer(2));
        pane.add(droidcard1, new Integer(2));
        pane.add(droidcard2, new Integer(1));
        pane.add(c3pocard1, new Integer(1));
        pane.add(c3pocard2, new Integer(2));
        pane.add(vadercard1, new Integer(1));
        pane.add(vadercard2, new Integer(2));
        pane.add(riverCard1, new Integer(0));
        pane.add(riverCard2, new Integer(0));
        pane.add(riverCard3, new Integer(0));
        pane.add(turnCard, new Integer(0));
        pane.add(flopCard, new Integer(0));


        pane.add(label);
        pane.add(label5);
        pane.add(label10);
        pane.add(label25);
        pane.add(label100);
        pane.add(amountofMoney);

        MouseListener ml1 = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                System.out.println(value);
                String backtoInt;
                if (SwingUtilities.isRightMouseButton(e) && value <= moneyAmount) {
                    value = value + 1;
                    if (value > 1500) {
                        value = 1500;
                    }
                    backtoInt = String.valueOf(value);
                    amountofMoney.setText(backtoInt);
                } else if (SwingUtilities.isLeftMouseButton(e)) {
                    value = value - 1;
                    backtoInt = String.valueOf(value);
                    amountofMoney.setText(backtoInt);
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
        MouseListener ml5 = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                System.out.println(value);

                String backtoInt;
                if (SwingUtilities.isRightMouseButton(e) && value < moneyAmount) {
                    value = value + 5;
                    if (value > 1500) {
                        value = 1500;
                    }
                    backtoInt = String.valueOf(value);
                    amountofMoney.setText(backtoInt);
                } else if (SwingUtilities.isLeftMouseButton(e)) {
                    value = value - 5;
                    backtoInt = String.valueOf(value);
                    amountofMoney.setText(backtoInt);
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

                System.out.println(value);
                String backtoInt;
                if (SwingUtilities.isRightMouseButton(e) && value < moneyAmount) {
                    value = value + 10;
                    if (value > 1500) {
                        value = 1500;
                    }
                    backtoInt = String.valueOf(value);
                    amountofMoney.setText(backtoInt);
                } else if (SwingUtilities.isLeftMouseButton(e)) {
                    value = value - 10;
                    backtoInt = String.valueOf(value);
                    amountofMoney.setText(backtoInt);
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

                System.out.println(value);
                String backtoInt;
                if (SwingUtilities.isRightMouseButton(e) && value < moneyAmount) {
                    value = value + 25;
                    if (value > 1500) {
                        value = 1500;
                    }
                    backtoInt = String.valueOf(value);
                    amountofMoney.setText(backtoInt);
                } else if (SwingUtilities.isLeftMouseButton(e)) {
                    value = value - 25;
                    backtoInt = String.valueOf(value);
                    amountofMoney.setText(backtoInt);
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

                System.out.println(value);
                String backtoInt;
                if (SwingUtilities.isRightMouseButton(e) && value < moneyAmount) {

                    value = value + 100;
                    if (value > 1500) {
                        value = 1500;
                    }
                    backtoInt = String.valueOf(value);
                    amountofMoney.setText(backtoInt);

                } else if (SwingUtilities.isLeftMouseButton(e)) {
                    value = value - 100;
                    backtoInt = String.valueOf(value);
                    amountofMoney.setText(backtoInt);
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

        label.addMouseListener(ml1);
        label5.addMouseListener(ml5);
        label10.addMouseListener(ml10);
        label25.addMouseListener(ml25);
        label100.addMouseListener(ml100);


        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(2000, 2000);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
    }
}

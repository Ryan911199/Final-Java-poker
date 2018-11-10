package src.javapoker;
import java.awt.Color;
import java.io.IOException;

import java.util.ArrayList;
import javax.swing.ImageIcon;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JLayeredPane;

public class JavaPoker {


    ArrayList<Cards> cardsArray = new ArrayList<Cards>();


    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws IOException {
        new JavaPoker();
    }


    public JavaPoker() throws IOException {
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
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(2000, 2000);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
    }
}
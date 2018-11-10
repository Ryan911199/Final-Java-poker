package javapoker;

import javax.swing.plaf.TableHeaderUI;
import java.io.IOException;
import java.util.logging.Handler;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Table {

    Deck deck;
    Player player;
    Bot botOne;
    Bot botTwo;
    Bot botThree;
    int startingCHips = 1500;
    Cards comHand[];

    public Table() throws IOException {
        deck = new Deck();
        comHand = new Cards[5];
        player = new Player(startingCHips, "Tom");
        botOne = new Bot(startingCHips, "Droid");
        botTwo = new Bot(startingCHips, "C3PO");;
        botThree = new Bot(startingCHips, "R2D2");;
    }

    public void dealHands() {
        for (int i = 0; i < 8; i++) {
            if (i == 0) {
                player.setHand(deck.getCard(), 0);
            }
            if (i == 1) {
                botOne.setHand(deck.getCard(), 0);
            }
            if (i == 2) {
                botTwo.setHand(deck.getCard(), 0);
            }
            if (i == 3) {
                botThree.setHand(deck.getCard(), 0);
            }
            if (i == 4) {
                player.setHand(deck.getCard(), 1);
            }
            if (i == 5) {
                botOne.setHand(deck.getCard(), 1);
            }
            if (i == 6) {
                botTwo.setHand(deck.getCard(), 1);
            }
            if (i == 7) {
                botThree.setHand(deck.getCard(), 1);
            }

        }

    }

    public void theFlop() {
        comHand[0] = deck.getCard();
        comHand[1] = deck.getCard();
        comHand[2] = deck.getCard();
    }

    public void theTurn() {
        comHand[3] = deck.getCard();
    }

    public void theRiver() {
        comHand[4] = deck.getCard();
    }

    public void shuffle() {
        deck.shuffle();
    }

    public void checkHand() {
        Cards playerHand[] = new Cards[]{comHand[0], comHand[1], comHand[2], comHand[3], comHand[4], player.hand[0], player.hand[1]};
        Cards botHand1[] = new Cards[]{comHand[0], comHand[1], comHand[2], comHand[3], comHand[4], botOne.hand[0], botOne.hand[1]};
        Cards botHand2[] = new Cards[]{comHand[0], comHand[1], comHand[2], comHand[3], comHand[4], botTwo.hand[0], botTwo.hand[1]};
        Cards botHand3[] = new Cards[]{comHand[0], comHand[1], comHand[2], comHand[3], comHand[4], botThree.hand[0], botThree.hand[1]};
        Hand_Eval handeval = new Hand_Eval(playerHand, botHand1, botHand2, botHand3);
    }
}

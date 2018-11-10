package src.javapoker;

import java.io.IOException;
import java.util.logging.Handler;

public class Table {
	Deck deck;
	Player player;
	Bot botOne;
	Bot botTwo;
	Bot botThree;
	int startingCHips = 1500;


	public Table() throws IOException {
		deck = new Deck();
		player = new Player(startingCHips, "Tom");
		botOne = new Bot(startingCHips, "Droid");
		botTwo = new Bot(startingCHips, "C3PO");;
		botThree = new Bot(startingCHips, "R2D2");;
	}

	public void dealHands(){
		player.setHand(deck.getCard(), deck.getCard());
		botOne.setHand(deck.getCard(), deck.getCard());
		botTwo.setHand(deck.getCard(), deck.getCard());
		botOne.setHand(deck.getCard(), deck.getCard());
	}
	public void shuffle(){deck.shuffle();}
	public void checkHand(){
		//Hand_Eval handeval = new Hand_Eval()
	}
}

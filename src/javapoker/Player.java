package javapoker;

public class Player {
	int chips;
	Cards hand[];
	String name;

	public Player(int Chips, String Name){
		chips = Chips;
		hand = new Cards[2];
		name = Name;
	}
	public void setHand(Cards cardOne, int i) {
		hand[i] = cardOne;
		
	}
}

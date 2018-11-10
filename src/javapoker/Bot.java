package javapoker;


public class Bot {
	int chips;
	Cards hand[];
	String name;

	public Bot(int Chips, String Name) {
		chips = Chips;
		hand = new Cards[2];
		name = Name;
	}
	public void setHand(Cards cardOne, Cards cardTwo) {
		hand[0] = cardOne;
		hand[1] = cardTwo;
	}
}

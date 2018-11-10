package javapoker;
import javax.imageio.ImageIO;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Deck {
	int deckArray[] = new int[51];
	ArrayList<Cards> cardsArray = new ArrayList<Cards>();
	public Deck() throws IOException{
		Cards acespades = new Cards(1, ImageIO.read(new File("ASpades.png")),"Spades");
		Cards spades2 = new Cards(2, ImageIO.read(new File("2Spades.png")), "Spades");
		Cards spades3 = new Cards(3, ImageIO.read(new File("3Spades.png")), "Spades");
		Cards spades4 = new Cards(4, ImageIO.read(new File("4Spades.png")), "Spades");
		Cards spades5 = new Cards(5, ImageIO.read(new File("5Spades.png")), "Spades");
		Cards spades6 = new Cards(6, ImageIO.read(new File("6Spades.png")), "Spades");
		Cards spades7 = new Cards(7, ImageIO.read(new File("7Spades.png")), "Spades");
		Cards spades8 = new Cards(8, ImageIO.read(new File("8Spades.png")), "Spades");
		Cards spades9 = new Cards(9, ImageIO.read(new File("9Spades.png")), "Spades");
		Cards spades10 = new Cards(10, ImageIO.read(new File("10Spades.png")), "Spades");
		Cards spadesJ = new Cards(11, ImageIO.read(new File("JSpades.png")), "Spades");
		Cards spadesQ = new Cards(12, ImageIO.read(new File("QSpades.png")), "Spades");
		Cards spadesK = new Cards(13, ImageIO.read(new File("KSpades.png")), "Spades");
		Cards acehearts = new Cards(1, ImageIO.read(new File("AHearts.png")), "Hearts");
		Cards hearts2 = new Cards(2, ImageIO.read(new File("2Hearts.png")), "Hearts");
		Cards hearts3 = new Cards(3, ImageIO.read(new File("3Hearts.png")), "Hearts");
		Cards hearts4 = new Cards(4, ImageIO.read(new File("4Hearts.png")), "Hearts");
		Cards hearts5 = new Cards(5, ImageIO.read(new File("5Hearts.png")), "Hearts");
		Cards hearts6 = new Cards(6, ImageIO.read(new File("6Hearts.png")), "Hearts");
		Cards hearts7 = new Cards(7, ImageIO.read(new File("7Hearts.png")), "Hearts");
		Cards hearts8 = new Cards(8, ImageIO.read(new File("8Hearts.png")), "Hearts");
		Cards hearts9 = new Cards(9, ImageIO.read(new File("9Hearts.png")), "Hearts");
		Cards hearts10 = new Cards(10, ImageIO.read(new File("10Hearts.png")), "Hearts");
		Cards heartsJ = new Cards(11, ImageIO.read(new File("JHearts.png")), "Hearts");
		Cards heartsQ = new Cards(12, ImageIO.read(new File("QHearts.png")), "Hearts");
		Cards heartsK = new Cards(13, ImageIO.read(new File("KHearts.png")), "Hearts");
		Cards aceclubs = new Cards(1, ImageIO.read(new File("AClubs.png")), "Clubs");
		Cards clubs2 = new Cards(2, ImageIO.read(new File("2Clubs.png")), "Clubs");
		Cards clubs3 = new Cards(3, ImageIO.read(new File("3Clubs.png")), "Clubs");
		Cards clubs4 = new Cards(4, ImageIO.read(new File("4Clubs.png")), "Clubs");
		Cards clubs5 = new Cards(5, ImageIO.read(new File("5Clubs.png")), "Clubs");
		Cards clubs6 = new Cards(6, ImageIO.read(new File("6Clubs.png")), "Clubs");
		Cards clubs7 = new Cards(7, ImageIO.read(new File("7Clubs.png")), "Clubs");
		Cards clubs8 = new Cards(8, ImageIO.read(new File("8Clubs.png")), "Clubs");
		Cards clubs9 = new Cards(9, ImageIO.read(new File("9Clubs.png")), "Clubs");
		Cards clubs10 = new Cards(10, ImageIO.read(new File("10Clubs.png")), "Clubs");
		Cards clubsJ = new Cards(11, ImageIO.read(new File("JClubs.png")), "Clubs");
		Cards clubsQ = new Cards(12, ImageIO.read(new File("QClubs.png")), "Clubs");
		Cards clubsK = new Cards(13, ImageIO.read(new File("KClubs.png")), "Clubs");
		Cards acediamonds = new Cards(1, ImageIO.read(new File("ADiamonds.png")),"Diamonds");
		Cards diamonds2 = new Cards(2, ImageIO.read(new File("2Diamonds.png")), "Diamonds");
		Cards diamonds3 = new Cards(3, ImageIO.read(new File("3Diamonds.png")), "Diamonds");
		Cards diamonds4 = new Cards(4, ImageIO.read(new File("4Diamonds.png")), "Diamonds");
		Cards diamonds5 = new Cards(5, ImageIO.read(new File("5Diamonds.png")), "Diamonds");
		Cards diamonds6 = new Cards(6, ImageIO.read(new File("6Diamonds.png")), "Diamonds");
		Cards diamonds7 = new Cards(7, ImageIO.read(new File("7Diamonds.png")), "Diamonds");
		Cards diamonds8 = new Cards(8, ImageIO.read(new File("8Diamonds.png")), "Diamonds");
		Cards diamonds9 = new Cards(9, ImageIO.read(new File("9Diamonds.png")), "Diamonds");
		Cards diamonds10 = new Cards(10, ImageIO.read(new File("10Diamonds.png")), "Diamonds");
		Cards diamondsJ = new Cards(11, ImageIO.read(new File("JDiamonds.png")), "Diamonds");
		Cards diamondsQ = new Cards(12, ImageIO.read(new File("QDiamonds.png")), "Diamonds");
		Cards diamondsK = new Cards(13, ImageIO.read(new File("KDiamonds.png")), "Diamonds");
		Cards chip1 = new Cards(1, ImageIO.read(new File("Chip1.png")), "Chip");
		Cards chip5 = new Cards(5, ImageIO.read(new File("Chip5.png")), "Chip");
		Cards chip10 = new Cards(10, ImageIO.read(new File("Chip10.png")), "Chip");
		Cards chip25 = new Cards(25, ImageIO.read(new File("Chip25.png")), "Chip");
		Cards chip100 = new Cards(100, ImageIO.read(new File("Chip100.png")), "Chip");
		cardsArray.add(acespades);
		cardsArray.add(spades2);
		cardsArray.add(spades3);
		cardsArray.add(spades4);
		cardsArray.add(spades5);
		cardsArray.add(spades6);
		cardsArray.add(spades7);
		cardsArray.add(spades8);
		cardsArray.add(spades9);
		cardsArray.add(spades10);
		cardsArray.add(spadesJ);
		cardsArray.add(spadesQ);
		cardsArray.add(spadesK);
		cardsArray.add(acehearts);
		cardsArray.add(hearts2);
		cardsArray.add(hearts3);
		cardsArray.add(hearts4);
		cardsArray.add(hearts5);
		cardsArray.add(hearts6);
		cardsArray.add(hearts7);
		cardsArray.add(hearts8);
		cardsArray.add(hearts9);
		cardsArray.add(hearts10);
		cardsArray.add(heartsJ);
		cardsArray.add(heartsQ);
		cardsArray.add(heartsK);
		cardsArray.add(aceclubs);
		cardsArray.add(clubs2);
		cardsArray.add(clubs3);
		cardsArray.add(clubs4);
		cardsArray.add(clubs5);
		cardsArray.add(clubs6);
		cardsArray.add(clubs7);
		cardsArray.add(clubs8);
		cardsArray.add(clubs9);
		cardsArray.add(clubs10);
		cardsArray.add(clubsJ);
		cardsArray.add(clubsQ);
		cardsArray.add(clubsK);
		cardsArray.add(acediamonds);
		cardsArray.add(diamonds2);
		cardsArray.add(diamonds3);
		cardsArray.add(diamonds4);
		cardsArray.add(diamonds5);
		cardsArray.add(diamonds6);
		cardsArray.add(diamonds7);
		cardsArray.add(diamonds8);
		cardsArray.add(diamonds9);
		cardsArray.add(diamonds10);
		cardsArray.add(diamondsJ);
		cardsArray.add(diamondsQ);
		cardsArray.add(diamondsK);
		for (int i = 0; i < deckArray.length; i++) {
			deckArray[i] = i;
		}
	}

	public Cards getCard() {
		Random rand = new Random();
		int i;
		i = rand.nextInt(51) + 1;
//		while (deckArray[i] == -1 ) {
//			i = rand.nextInt(52) + 1;
//		}
//		deckArray[i] = -1;
		return cardsArray.get(i);
	}
       
	public void shuffle (){
		for (int i = 0; i < deckArray.length; i++){
			deckArray[i] = i;
		}
	}
}

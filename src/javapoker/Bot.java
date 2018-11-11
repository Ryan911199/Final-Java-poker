package javapoker;

import java.io.IOException;
import java.util.Random;

public class Bot {
    int previousnum = 0;
    int chips;
    Cards hand[];
    String name;

    public Bot(int Chips, String Name) {
        chips = Chips;
        hand = new Cards[2];
        name = Name;
    }

    public void setHand(Cards cardOne, int i) throws IOException {

        hand[i] = cardOne;
    }

    public String botsLeft() {
        String a = String.valueOf(chips);    
        return a;

    }
    
    
    public void botsRunningTotal(int r) {
        chips =  chips - r;
       
      
    }
    
    public int botsBets() throws IOException {
        Random rand = new Random();
        int a = Integer.parseInt(botsLeft());
        int random = rand.nextInt(a);
        return random;
    }
}

package javapoker;

import java.awt.image.BufferedImage;

/**
 *
 * @author rithv
 */

public class Cards {
    private BufferedImage cardImage;
    private int vals;
    private String suit;
        
     public Cards(int Value, BufferedImage card, String Suit) {
      
        cardImage = card;
        vals= Value;
        suit = Suit;
       
    }
     public BufferedImage getCardImage(){
        return cardImage;
    }
       public String getsuit(){
        return suit;
    }
      public int getScore(){
        return vals;
    }
   
   
}


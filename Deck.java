package week6;

import java.util.ArrayList;
import java.util.Collections;


public class Deck {
    private ArrayList <Card> cards;

    
    public Deck( ) {
    	
    	cards = new ArrayList <Card> ();
    	for (int i =0; i < 52; i ++){
    		cards.add(new Card(i));
     		
    	}
    }
        public void shuffle() {
        Collections.shuffle(cards);
    }
  

   
    
    public Card draw() {
        if (cards.isEmpty()) {
        System.out.println("No more cards in the deck.");
          return null;
       }
        else {
        Card currentCard = cards.get(0);
        cards.remove(0);
       return currentCard;
   
        }
     

    }
}
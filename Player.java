package week6;

import java.util.ArrayList;

public class Player {

	
	private ArrayList <Card> hand;
	private String name;
	private int score;
	
	
	public Player(String firstName) {
		super();
		this.name = firstName;
		this.score = 0;
		this.hand = new ArrayList<Card> ();
		
	}


	public void describe() {
		System.out.println("\n "  + name + "  has these cards:");
		for (Card card : hand) {
			System.out.println(card.describe());
		
		}
	}
	public Card flip() {
		Card currentCard = hand.get(0);
		hand.remove(0);
		System.out.println(name + " has "+  currentCard.describe());		
		return currentCard;
	}
	public void draw(Deck deck) {
		Card currentCard = deck.draw();
		hand.add(currentCard);
	}
	public void incremntScore() {
	this.score ++;
}
	    public String getName() {
	        return name;
	    }
	   
	    
	    public int getScore() {
	    	return score;
	    }
	       
	 public void setName(String name) {
	        this.name = name;
	    }
}


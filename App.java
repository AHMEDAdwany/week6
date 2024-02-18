package week6;

public class App {

public static void main(String[] args) {
	// TODO Auto-generated method stub

	Deck newDeck = new Deck();
	
	
	Player p1 = new Player("Ally  ");
	
	Player p2 = new Player("Jr  ");
	
	
	System.out.println(" Decks are ready to go!!");
	
	for ( int i = 0; i < 26; i++) {
		
		newDeck.shuffle();
		
	p1.draw(newDeck);
	p2.draw(newDeck);
	}
	
	
	
	
	int p1Value, p2Value;
	
	for (int i = 0; i < 26; i ++) {

		p1Value = p1.flip().getValue(); 
	
		p2Value = p2.flip().getValue(); 
	
		if (p1Value > p2Value) {
			p1.incremntScore();
		System.out.println("Good round " + p1.getName() + "wins this one!");
	}
		else if (p1Value < p2Value) {
			p2.incremntScore();
		System.out.println("Good round " + p2.getName() + "wins this one!");
	}
		else {
			System.out.println("Draw");
			
		}
		System.out.println("Scores are:  " + p1.getName() + ": " + p1.getScore() + "  " + p2.getName() + " : " + p2.getScore() );
	}
	if (p1.getScore() > p2.getScore()) {
		
	System.out.println("Good Game! " + p1.getName() + " wins this one!");
}
	else if (p1.getScore() < p2.getScore()) {
		
	System.out.println("Good Game! " + p2.getName() + " wins this one!");
}
	else {
		System.out.println("The game was a draw");
		
	}
}
	
}


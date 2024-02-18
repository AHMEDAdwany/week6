package week6;


public class Card {
    private int value;
    private int name;

    public Card(int value, int name) {
        this.value = value;
        this.name = name;
    }

    public Card(int num) {
        this.value = num / 13;
        this.name = num % 13;
    }

 
    public int getName() {
        return name;
    }
    public void setName(int name) {
        this.name = name;
    }
       public int getValue() {
        return value;
    }

    public void setValue( int value) {
        this.value = value;
    }
  
    
    
//     public void Deck() {
  //          ArrayList cards = new ArrayList<>();
    //        describe();
  //      }

      public String describe() {
            String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
            String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
           
            return values[name] + " of " + suits[value];
     
            
            //    for (String suit : suits) {
       //         for (int value = 2; value <= 14; value++) {
          //          String cardName = names[value - 2] + " of " + suit;
            //        cards.add(new Card(value, cardName));
              //  }
            //}
		
}
}




package OOP2;

public class TestCards {

	public static void main(String[] args) {
		
		DeckOfCard myDeck = new DeckOfCard();
		
		myDeck.shuffle();
		
		for(int i = 1 ; i <= myDeck.getNumberOfCards(); i++) {
			System.out.printf("%-19s",myDeck.dealCard());
			if(i % 4 == 0) System.out.print("\n");
		}

	}

}

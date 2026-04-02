package OOP2;
import java.security.SecureRandom;

public class DeckOfCard {
	
	private static SecureRandom sr = new SecureRandom();
	private static int NUMBER_OF_CARDS = 52;
	
	private Card[] deck = new Card[NUMBER_OF_CARDS];
	private int currentCard = 0;
	
	public DeckOfCard() {
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "Kings"};
		String[] suits = {"Hearts", "Dimonds", "Clubs", "Spades"};
		
		for(int count = 0; count < deck.length; count++) {
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
		}
	}
	
	
	public void shuffle() {
		currentCard = 0;
		
		for(int first = 0; first < deck.length; first++) {
			int second = sr.nextInt(NUMBER_OF_CARDS);
			
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	
	public Card dealCard() {
		if (currentCard < deck.length) return deck[currentCard++];
		else return null;
	}
	
	public int getNumberOfCards() {
		return NUMBER_OF_CARDS;
	}

}

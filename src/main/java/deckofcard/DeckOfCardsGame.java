package deckofcard;
import java.util.ArrayList;

public class DeckOfCardsGame {

	ArrayList<String> DeckOfCard = new ArrayList<String>();
	/*
	 *created one dimentional array and initailize  variables 
	 */
	private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	private	String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};

	/*
	 * In this method we have initialized the size of cards.
	 * In this I have created String type array of Suits and Ranks to store its value and initialize it.
	 */
	public void deckOfCards() {

		int numOfCards = suits.length * ranks.length;
		System.out.println("\nNumber of cards in the deck:" + numOfCards);

		for (int i = 0; i < ranks.length; i++) { 
			
			for (int j = 0; j < suits.length; j++) {   
				DeckOfCard.add(ranks[i] + "--" + suits[j]);
			}
		}

	}
}

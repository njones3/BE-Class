package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<>();
	
	Deck(){
		
		
		String[] suits = {"Spades", "Diamonds", "Hearts", "Clubs"};
		String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9",
							"10", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			for (int count = 2; count <= 14; count++) {
				String name = numbers[count - 2] + " of" + " " + suit;
				Card card = new Card(count, name);
				cards.add(card);
			}
		}
	}
	
	
	
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}

}
